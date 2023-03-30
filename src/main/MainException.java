package main;

import classes.CrowdService;
import classes.Person;

import java.util.ArrayList;
import java.util.List;

public class MainException {

    public static void main(String[] args) {
        List<Person> children = new ArrayList<>();
        children.add(null);

        Person person = new Person();
        person.setChildren(children);

        List<Person> personList = new ArrayList<>();
        personList.add(person);

        CrowdService crowdService = new CrowdService();
        crowdService.findChildrenForListOfPerson(personList);
    }
}
