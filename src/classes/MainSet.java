package classes;

import java.util.*;

public class MainSet {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Set<String> set = new HashSet<>();

        list.add("Привет");
        list.add("Привет");
        list.add("Привет");

        set.add("Привет");
        set.add("Привет");
        set.add("Привет");

        int size = set.size();
        boolean answer = set.contains("привет");

        boolean empty = set.isEmpty();


        System.out.println(empty);

        set.remove("Привет");

        System.out.println(set.size());

        set.remove("ппп");

        set.clear();

        System.out.println(answer);
        System.out.println(size);

        System.out.println(list);
        System.out.println(set);


        Set<String> strings = new HashSet<>();

        for (int i = 1_000_000; i > 0; i--) {
            strings.add(String.valueOf(i));
        }

        //System.out.println(strings);

        Set<Integer> integers = new TreeSet<>();

        for (int i = 1_000_000; i > 0; i--) {
            integers.add(i);
        }

        System.out.println(integers);

        //Вводится 3 числа с консоли
        //узнать, равны ли они друг другу
        //5, 5, 5 - true
        //5, 4, 5 - false

        //20-25

    }
}
