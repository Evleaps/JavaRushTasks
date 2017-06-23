package com.javarush.task.task08_Data_HashMap_сортировки.task0821_ВыводНаЭкранМАПУ;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
1. Создать словарь MapClass (<String, String>) и добавить туда 10 человек в виде «Фамилия»-«Имя».
2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями.
4. Вывести содержимое MapClass на экран.
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
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
        map.put("8","Наташа");
        map.put("8","Оля");

        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
