package main;

import java.util.*;

public class MainHometask {

    public static void main(String[] args) {
        String[] words = {"Я", "Я", "я"};
        System.out.println(findUsages(words));
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("1");
        list.add("1");
        list.add("12");
        list.add("133");
        list.add("122");

        System.out.println(Collections.frequency(list, "1"));
    }

    public static Map<String, Integer> findUsages(String[] words) {
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            if (map.containsKey(word)) {
                int value = map.get(word);
                map.put(word, value + 1);
            } else {
                map.put(word, 1);
            }
        }
        return map;
    }

    public static Map<String, Integer> findUsagesSecond(String[] words) {
        Map<String, Integer> map = new HashMap<>();

        Arrays.stream(words)
                .forEach(word -> {
                    if (map.containsKey(word)) {
                        int value = map.get(word);
                        map.put(word, value + 1);
                    } else {
                        map.put(word, 1);
                    }
                });
        return map;
    }
}
