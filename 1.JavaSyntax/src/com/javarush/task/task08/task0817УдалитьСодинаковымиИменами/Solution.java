package com.javarush.task.task08.task0817УдалитьСодинаковымиИменами;

import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String,String> map = new HashMap<>();
        map.put("1","петя");
        map.put("2","петя");
        map.put("3","Тютя");
        map.put("4","петя");
        map.put("5","Гера");
        map.put("6","Тютя");
        map.put("7","Рома");
        map.put("8","Армэн");
        map.put("9","Наташа");
        map.put("10","Оля");

        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        //напишите тут ваш код
        HashMap<String, String> copy2 = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy2.entrySet()) {
            int i = 0;
            for (Map.Entry<String, String> pair2 : copy2.entrySet()) {
                if (pair2.getValue().equals(pair.getValue()))
                    i++;
                if (i > 1) removeItemFromMapByValue(map, pair.getValue());
            }

        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

        /*createMap();
        System.out.println(createMap());
        removeTheFirstNameDuplicates(createMap());
        System.out.println(createMap());*/
        HashMap<String, String> map1 = new HashMap<>(createMap());
        for (Map.Entry<String, String> pairs : map1.entrySet()) {
            String key = pairs.getKey();
        String value = pairs.getValue();
        System.out.println(key + ":" + value);
        }
    }
}







