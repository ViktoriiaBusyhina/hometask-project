package main;

import java.util.*;

public class MainMap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        Map<String, Integer> map = new HashMap<>();

        map.put("Сидоров", 5);
        map.put("Иванов", 2);

        if (map.containsKey(name)) {
            Integer mark = map.get(name);
            System.out.println(mark);
        }
        else {
            System.out.println("Такого ученика нет");
        }

        Set<String> set = map.keySet(); //все ключи
        System.out.println(set);

        Collection<Integer> collection = map.values(); //все значения

        for (Integer integer : collection) {
            System.out.println(integer);
        }

        boolean hasTwo = map.containsValue(3);
        System.out.println(hasTwo);

        //1) Создать мапу (HashMap<String, Integer>)
        //2) Заполнить ее значениями "Город страны, где вы сейчас живете" - население
        //3) Со сканнера вводится имя города - отдать его население (написать на экран)

        //4)* Найти среднее количество жителей во всех добавленных вами городах







    }
}
