package main;

import classes.Person;
import classes.Sex;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

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

        List<Person> answer = list.stream()
                .filter(person -> person.getYears() > 35) //конвейерный метод
                .sorted() //конвейерный метод
                .toList(); //терминальный метод

        Set<Person> answer2 = list.stream()
                .filter(person -> person.getYears() > 35) //конвейерный метод
                .sorted() //конвейерный метод
                .collect(Collectors.toSet()); //терминальный

        //List<Person> answer3 = list.stream()
        //        .filter(person -> person.getYears() > 35) //конвейерный метод
        //        .sorted() //конвейерный метод
        //        .collect(Collectors.toSet()); //а так нельзя, потому что собираем коолектором в сет,
        // а пытаемся запихнуть в лист

        System.out.println(result);
        System.out.println(list);
        System.out.println(answer);
        System.out.println(answer2);

    }
}
