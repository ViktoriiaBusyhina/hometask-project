package main;

import classes.Person;
import generics.Box;

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
        Person person = new Person();

        listForStringsOnlyForString.stream()
                .filter()
                .

        //Box<String> stringBox = new Box<>("1233");
        //Box<Integer> integerBox = new Box<>(1234);
        //Box<Person> persBox = new Box<>(person);

        Integer[] arr = new Integer[10];
        System.out.println(arr.toString());
        System.out.println(arr.hashCode());

        //TestGeneric<Integer[]> arrayTest = new TestGeneric<>(new Integer[2]);
        //TestGeneric<int> intTest = new TestGeneric<>(new Integer[2]);

        //stringBox.print();
        //integerBox.print();
        //persBox.print();


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


        List<Integer> years = new ArrayList<>();
        years.add(34);
        years.add(45);
        years.add(12);
        years.add(23);
        years.add(3);

        Box<Integer> box = new Box<>(1, years);

        List<String> strings = new ArrayList<>();
        strings.add("123");
        Box<String> stringBox = new Box<>("123", strings);

        System.out.println(box);

    }
}
