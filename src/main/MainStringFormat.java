package main;

import java.util.Map;

public class MainStringFormat {

    public static void main(String[] args) {
        int a = 25;
        int b = 2;
        String name = "Даниил";

        System.out.printf("a=%d, b=%d", a, b);
        System.out.println("a=" + a + ", b=" + b);

        System.out.printf("Всего в классе %d школьников!", a);
        System.out.println("Всего в классе " + a + " школьников!");

        System.out.printf("Меня зовут %s", name);

        //%s - вставка строки
        //%d - целые числа
        //%f - дробные числа
        //%.2f - дробное число, два знака после запятой
        //%n - перенос строки
        //%% - просто знак %
        //%b - булеан зачение
        //%B - булеан большими буквами

        System.out.printf("Число Пи равно %.2f%n", 3.14);
        System.out.printf("Число Пи равно %100.10f%n", 3.14);

        System.out.printf("first%nsecond%nthird");

        //97%
        System.out.printf("Всего проголосовало: %d%%%n", 97);

        System.out.printf("Обычная строка - %B%n", "1");
        System.out.printf("Нул - %B%n", null);
        System.out.printf("Число - %B%n", 0);
        System.out.printf("Число - %B%n", 1);

        System.out.printf("Привет, тут будет много пробелов%100.10s%n", "Hi guys!");

        int age = 77;

        String str = String.format("Привет, меня зовут %s, мне %d лет, а число pi=%.2f", name, age, Math.PI);
        String strWithout = "Привет, меня зовут " + name + ", мне " + age + " лет, а число pi= " + Math.PI;

        System.out.println(str);
        System.out.println(strWithout);





    }
}
