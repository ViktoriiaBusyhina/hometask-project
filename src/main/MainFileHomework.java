package main;

import java.io.*;
import java.util.Scanner;

public class MainFileHomework {

    public static void main(String[] args) {
        File file = new File("resources/names.txt");
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int finish = scanner.nextInt();


        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            int count = 0;
            while (line != null) {
                count++;
                line = bufferedReader.readLine();
                if (count >= start && count <= finish) {
                    System.out.println(line);
                }
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        catch (IOException e) {
            System.out.println("Ошибка ввода-вывода");
        }


    }
}
