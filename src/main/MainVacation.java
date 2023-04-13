package main;

import classes.Vacation;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainVacation {

    // 1 уровень сложности: Формируем отпуск. С консоли
    //Считываем два числа - количество дней отдыха и количество людей.
    // Ответ - это стоимость отпуска - произведение дней отдыха на количество людей
    //Обратите внимание, что при попытке ввести текст вместо числа у вас упадет ошибка.
    // Обработайте ее используя блок try-catch одним из способов,
    // что обсуждали с вами на занятии.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Введите число дней:");
            int days = scanner.nextInt();
            System.out.println("Введите количество людей");
            int people = scanner.nextInt();

            Vacation vacation = new Vacation();
            System.out.println("Стоимость отпуска: " + vacation.calculateVacationCost(days,people));
        }
        catch (InputMismatchException ex ){
            throw new RuntimeException("Вы облажались :D", ex);

        }

    }
}
