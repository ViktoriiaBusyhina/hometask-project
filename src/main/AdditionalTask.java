package main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AdditionalTask {
    public static void main(String[] args) {
        //Правильно создать два списка. Один ArrayList, один LinkedList (тип данных String). Добавить в каждый из них по 3 элемента.
        //Центральный элемент в ArrayList заменить на первый элемент. Удалить последний элемент.
        //к LinkedList добавить весь ArrayList.
        //* - найти самую длинную строку в вашем получившемся листе.

        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();
        arrayList.add("1234");
        arrayList.add("2");
        arrayList.add("3");

        linkedList.add("4");
        linkedList.add("5");
        linkedList.add("66789654");

        arrayList.set(1, "1");

        int center = arrayList.size() / 2;
        String first = arrayList.get(0);
        arrayList.set(center, first);

        arrayList.remove(2);

        linkedList.addAll(arrayList);

        System.out.println(linkedList);

        String maxString = "";
        for (String s : linkedList) {
            if (s.length() > maxString.length()) {
                maxString = s;
            }
        }

        System.out.println(maxString);





    }
}
