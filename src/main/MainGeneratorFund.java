package main;

import classes.FundGenerator;
import classes.PensionFund;
import classes.TypeOfFund;

import java.io.IOException;
import java.util.List;

public class MainGeneratorFund {
    public static void main(String[] args) throws IOException {
         String filePath = "resources/fund.txt";
         int start = 1950;
         int end = 2023;

        FundGenerator fundGenerator = new FundGenerator();
        List<PensionFund> funds = fundGenerator.generate(filePath,start,end);


        int lengOfBank = 15;

        funds.stream()
                .filter(pensionFund -> pensionFund.getType().equals(TypeOfFund.STATE))
                .filter(pensionFund -> pensionFund.getName().length() >= lengOfBank)
                .forEach(System.out::println);
    }

}
