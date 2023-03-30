package main;

import java.util.Scanner;

public class MainExceptionSecond {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int temp = scanner.nextInt();

        if (temp < 0) {
            System.out.println("Неправильно");
            throw new NullPointerException("на самом деле это не настоящий nullpointer");
        }
    }
}
