package main;

import classes.Person;
import classes.Worker;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class MainGenerics {

    public static void main(String[] args) throws InterruptedException {
        List<String> listForStringsOnlyForString = new ArrayList<>();

        listForStringsOnlyForString.add("String1");
        listForStringsOnlyForString.add("String2");
        listForStringsOnlyForString.add("String3");
        listForStringsOnlyForString.add("String4");
        listForStringsOnlyForString.add("String5");
        //listForStringsOnlyForString.add(new Person());

        for (Object o : listForStringsOnlyForString) {
            String str = (String) o;
            System.out.println(str);
        }


        //object -> person -> worker

        //int a = 5;
        //long b = a; //неявное приведение типов
//
        //long c = 3_000_000_000L;
        //int d = (int) c; //явное приведение
//
        //System.out.println(d);
//
//
        //Person person = new Worker();
        //Worker worker = (Worker) person;
//
        //Object object = new Worker(); //неявное приведение типов
        //Worker worker1 = (Worker) object; //явное приведение типов
//
        //System.out.println(person);
        //System.out.println(worker1);
//
        ////Object obj = new Object();
        ////Worker worker2 = (Worker) obj;
//
        //Person person1 = new Person();
        //Worker worker3 = (Worker) person1;

    }
}
