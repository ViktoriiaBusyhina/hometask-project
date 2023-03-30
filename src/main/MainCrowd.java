package main;

import classes.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MainCrowd {

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

        List<Worker> workers = new ArrayList<>();
        workers.add(new Worker());
        workers.add(new Worker());
        workers.add(new Worker());

        List<Company> companies = new ArrayList<>();
        companies.add(new Company("Что-нибудь"));

        CrowdService crowdService = new CrowdService();
        //crowdService.findChildrenForListOfPersonSecond(workers);

        //crowdService.findChildrenForListOfPersonSecond(companies);

        List<Object> objects = new ArrayList<>();

        crowdService.findChildrenForListOfPersonThird(workers);
        crowdService.findChildrenForListOfPersonThird(people);
        //crowdService.findChildrenForListOfPersonThird(companies);
        crowdService.findChildrenForListOfPersonFourth(people);
        System.out.println(people.size());

        crowdService.findChildrenForListOfPersonFourth(objects);
        System.out.println(objects.size());
    }
}
