package main;

import classes.Pensioner;
import classes.Person;
import classes.Worker;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainExample {

    public static void main(String[] args) {
        int[] array = new int[5]; //массив из интов
        List<Integer> list = new ArrayList<>(); //список (лист) из интов
        List<Integer> list2 = new LinkedList<>(); //линкедЛист из интов

        //Правильно создать два списка. Один ArrayList, один LinkedList (тип данных String). Добавить в каждый из них по 3 элемента.
        //Центральный элемент в ArrayList заменить на первый элемент. Удалить последний элемент.
        //к LinkedList добавить весь ArrayList.
        //* - найти самую длинную строку в вашем получившемся листе.
        
        List<Person> people = new ArrayList<>();
        people.add(new Worker());
        people.add(new Pensioner("123", 2, 3, 4, 5));

        System.out.println(people);

        array[0] = 1;
        array[1] = 3;
        array[2] = 100;
        //добавить новый
        array[3] = 999; //4
        array[4] = 1976; //5

        list.add(1);//0
        list.add(3);//1
        list.add(10000); //2
        list.add(4);//3
        list.add(1000);//4

        System.out.println(list);

        list.add(3, 5);

        System.out.println(list);

        list.set(3, 1000);

        System.out.println(list);

        System.out.println(list.contains(10010));

        list.remove(0);

        System.out.println(list);

        System.out.println(list);

        System.out.println(list);

        list.addAll(list);

        System.out.println(list);

        //20-48

        list.clear();

        System.out.println(list);

        System.out.println(list.isEmpty());




        int a = array[1];
        //int a1 = list.get(1);

        int len = array.length;
        int len1 = list.size();

        //for (int i = 0; i < array.length; i++) {
        //    if (array[i] == 999) {
        //        System.out.println(i);
        //        break;
        //    }
        //}

        int index = list.indexOf(111111111);
        System.out.println(index);



        //for (int i = 0; i < 5; i+=2) {
        //    System.out.println(list.get(i));
        //}




    }
}
