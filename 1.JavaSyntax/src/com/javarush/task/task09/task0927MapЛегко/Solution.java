package com.javarush.task.task09.task0927MapЛегко;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
Есть класс кот – Cat, с полем «имя» (String).
Создать словарь Map<String, Cat> и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех котов и вывести его на экран.
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        HashMap<String, Cat> map = new HashMap<>();
        map.put("1",new Cat(null));
        map.put("2",new Cat(null));
        map.put("3",new Cat(null));
        map.put("4",new Cat(null));
        map.put("5",new Cat(null));
        map.put("6",new Cat(null));
        map.put("7",new Cat(null));
        map.put("8",new Cat(null));
        map.put("9",new Cat(null));
        map.put("10",new Cat(null));
        return map;
    }


    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        Set<Cat> cats = new HashSet<>();
        for (Map.Entry<String,Cat> entry: map.entrySet()) {
            cats.add(entry.getValue());
        }
        return cats;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
