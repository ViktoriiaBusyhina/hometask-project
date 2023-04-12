package classes;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FundGenerator {



    public List<PensionFund> generate (String filePath, int startYear, int endYear) throws IOException {
        File file = new File(filePath);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        Random random = new Random();
        List<PensionFund> funds = new ArrayList<>();
        String line = "";
        while (line != null){
            line = bufferedReader.readLine();
            if (line != null) {
                funds.add(new PensionFund(
                        line,
                        random.nextInt(startYear, endYear),
                        TypeOfFund.getRandomType()));
            }
        }
        fileReader.close();
        bufferedReader.close();
        return funds;

    }

}
