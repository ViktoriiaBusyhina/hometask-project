package main;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainPoem {
    public static void main(String[] args) throws IOException {
        String filePath = "resources/data.txt";
        String output = "resources/resize_data.txt";

        Scanner scanner = new Scanner(System.in);
        int start;
        int finish;

        System.out.println("Введите начало отрывка стиха");
        start = scanner.nextInt();
        System.out.println("Введите конец отрывка стиха");
        finish = scanner.nextInt();

        List<String> strings = createListFromFile(filePath);


        File outputFile = new File(output);
        FileWriter fileWriter = new FileWriter(outputFile);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);


        createNewFile(start, finish, strings, bufferedWriter);


    }

    private static List<String> createListFromFile (String filePath) throws IOException {
        List<String> strings = new ArrayList<>();

        File file = new File(filePath);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = "";
        while (line != null){
            line = bufferedReader.readLine();
            if (line != null) {
                strings.add(line);
            }
        }

        fileReader.close();
        bufferedReader.close();

        return strings;
    }


    private static void createNewFile(int start, int finish, List<String> strings, BufferedWriter bufferedWriter) throws IOException {
        strings.stream()
                .skip(start - 1)
                .limit(finish - start + 1)
                .forEach(line1 -> {
                    try {
                        bufferedWriter.write( line1);
                        bufferedWriter.newLine();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                });
        bufferedWriter.close();
    }


}
