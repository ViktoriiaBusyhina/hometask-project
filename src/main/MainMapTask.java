package main;

import java.util.*;

public class MainMapTask {



    public static void main(String[] args) {
        //1) Создать мапу (HashMap<String, Integer>)
        //2) Заполнить ее значениями "Город страны, где вы сейчас живете" - население
        //3) Со сканнера вводится имя города - отдать его население (написать на экран)

        //4)* Найти среднее количество жителей во всех добавленных вами городах

        Map<String, Integer> cities = new HashMap<>();

        cities.put("Минск", 2_000_000);
        cities.put("Берлин", 2_000_000);
        cities.put("Мюнхен", 800_000);

        Scanner scanner = new Scanner(System.in);
        String nameOfCity = scanner.nextLine();

        if (cities.containsKey(nameOfCity)) {
            Integer population = cities.get(nameOfCity);
            System.out.println(population);
        }
        else {
            System.out.println("Такого города у нас нет");
        }

        int sum = 0;

        //Collection<Integer> populationOfCities = cities.values();
        //for (Integer populationOfCity : populationOfCities) {
        //    sum += populationOfCity;
        //}

        //20-11

        Set<String> set = cities.keySet();
        for (String city : set) {
            sum += cities.get(city);
        }

        int average = sum / cities.size();

        System.out.println("Среднее значение равно: " + average);




    }
}
