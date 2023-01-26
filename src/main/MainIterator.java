package main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainIterator {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("привет");
        list.add("пока");
        System.out.println(list);

        Iterator iterator = list.iterator();


        //System.out.println(iterator.hasNext());
        //System.out.println(iterator.next());
//
        //System.out.println(iterator.hasNext());
        //System.out.println(iterator.next());
//
        //System.out.println(iterator.hasNext());
        //System.out.println(iterator.next());

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("------");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("------");

        String answer = "";
        //list.for
        for (String s : list) {
            answer = answer + s;
        }



        int index = 0;
        for (String a: list) {
            if (a.equals("привет")) {
                System.out.println("я нашел тебя");
                System.out.println(index);
            }
            index++;
        }

        for (String a: list) {
            System.out.println(a);
        }

        for (String a: list) {
            System.out.println(a);
        }

        System.out.println(answer);

        //foreach


        //for (int i = 0; i < list.size(); i++) {
        //    System.out.println(list.get(i));
        //}


    }
}
