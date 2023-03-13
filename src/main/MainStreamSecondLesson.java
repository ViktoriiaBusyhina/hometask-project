package main;

import classes.Person;
import classes.Sex;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MainStreamSecondLesson {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();


        Person person5 = new Person("Даниил", 60, null);
        people.add(person5);

        Person person1 = new Person("Анна", 20, Sex.FEMALE);
        people.add(person1);

        Person person2 = new Person("Виктория", 200, Sex.FEMALE);
        people.add(person2);

        List<Person> children1 = new ArrayList<>();
        Person child1 = new Person("Кирилл", 5, Sex.MALE);
        Person child2 = new Person("Луиза", 10, Sex.FEMALE);
        children1.add(child1);
        children1.add(child2);

        person2.setChildren(children1);


        Person person3 = new Person("Ирина", 200, Sex.FEMALE);

        List<Person> children2 = new ArrayList<>();
        Person child3 = new Person("Ребенок3", 5, Sex.MALE);
        Person child4 = new Person("Ребенок4", 10, Sex.FEMALE);
        Person child5 = new Person("Ребенок5", 12, Sex.FEMALE);
        children2.add(child3);
        children2.add(child4);
        children2.add(child5);

        person3.setChildren(children2);

        people.add(person3);




        //Фильтрация
        //Фильтрация по enum +
        //Фильтрация по значение, числовое +
        //1) Среди всех людей найти женщин +
        //2) Найти людей (женщин), которые будут старше 50 лет +

        //Много людей и у этих людей много детей
        //много детей
        //3) получить список всех детей

        //подсчитать количество

        //найти какое-то общее (суммарное) значение

        //::
        //Optional

        List<Person> answer = people.stream()
                .filter(person -> person.getSex() != null && person.getSex().equals(Sex.FEMALE))
                .filter(woman -> woman.getYears() > 50)
                .map(woman -> woman.getChildren())
                .flatMap(children -> children.stream())
                .toList();

        System.out.println(answer);
        System.out.println(answer.size());

        //Посчитать общий возраст всех детей

        Optional<Integer> optional = people.stream()
                .filter(person -> person.getSex() != null)
                .filter(person -> person.getSex().equals(Sex.FEMALE))
                .filter(woman -> woman.getYears() > 50)
                .map(woman -> woman.getChildren())
                .flatMap(children -> children.stream())
                .map(child -> child.getYears())
                .reduce((i1, i2) -> i1 + i2);

        System.out.println(optional.isPresent());
        if (optional.isPresent()) {
            System.out.println("Дети есть, их суммарный возраст = " + optional.get());
        }
        else {
            System.out.println("Детей нет, получается, их суммарный возраст = " + 0);
        }













    }

}
