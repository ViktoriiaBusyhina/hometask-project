package main;

import classes.Car;
import classes.Person;
import classes.Sex;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class MainStream {

    public static void main(String[] args) {
        //коллекция из людей
        //для каждого человека необходимо взять его возраст
        //добавить к возрасту +5 лет
        //сложить все возраста
        //получить общую сумму

        //Вася - 15 лет
        //Антон - 40 лет
        //Евгений - 78 лет

        // 20+45+83= 148

        List<Person> list = new ArrayList<>();
        Person first = new Person();
        first.setYears(15);
        first.setSex(Sex.FEMALE);
        list.add(first);

        Person second = new Person();
        second.setYears(40);
        list.add(second);

        Person third = new Person();
        third.setYears(78);
        list.add(third);

        int sum = 0;
        for (Person person : list) {
            if (person.getYears() > 50) {

            }
            int age = person.getYears();
            age += 5;
            sum += age;
        }

        list.stream().forEach(p -> System.out.println(p.getYears() + 5));


        //list
                //        .stream()
                //        .filter((p) -> p.getYears() > 50)



        Optional answer = list.stream()
                .map(p -> p.getYears())
                .map(age -> age + 5)
                .reduce(Integer::sum);


        //(параметры) -> реализация метода
        Car car1 = () -> System.out.println("поехали");
        Car car2 = () -> System.out.println("не доехали");
        Car car3 = () -> {
            System.out.println("приехали");
            System.out.println("Ну почти....");
        };

        Car car4 = new Car() {
            @Override
            public void go() {
                System.out.println("приехали");
            }
        };

        System.out.println(car1.getClass());
        System.out.println(car2.getClass());
        System.out.println(car3.getClass());
        System.out.println(car4.getClass());

        car1.go();
        car2.go();
        car3.go();
        car4.go();


        Consumer<Integer> consumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        };

        Consumer<Integer> consumer2 = (x) -> System.out.println(x);

        consumer.accept(5);
        consumer.accept(51);
        consumer.accept(15);
        consumer.accept(25);

        consumer2.accept(5);
        consumer2.accept(51);
        consumer2.accept(15);
        consumer2.accept(25);

        Predicate<Integer> predicate = (a) -> a > 10;

        boolean b1 = predicate.test(12);
        boolean b2 = predicate.test(10);
        boolean b3 = predicate.test(9);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        Function<Person, Sex> function = (p) -> p.getSex();

        Sex s1 = function.apply(first);
        System.out.println(s1);

    }


    //a=5
    //b=4
    //(a, b) -> {sout(a); sout(b); }

    //a=5
    //b=4
    //c=3
    //(a, b, c) -> a * 2 + b + c;
}

