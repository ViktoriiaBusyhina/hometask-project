package main;

import classes.Person;
import classes.Sex;

import java.util.ArrayList;
import java.util.List;

public class MainStreamAdditional {

    public static void main(String[] args) {
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

        long result = list.stream()
                .filter(person -> person.getYears() > 35) //конвейерный метод
                .sorted() //конвейерный метод
                .count(); //терминальный метод

        System.out.println(result);

    }
}
