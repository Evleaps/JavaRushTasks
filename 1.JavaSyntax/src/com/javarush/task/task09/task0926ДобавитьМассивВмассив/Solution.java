package com.javarush.task.task09.task0926ДобавитьМассивВмассив;

import java.util.ArrayList;

/* 
Список из массивов чисел
Создать список, элементами которого будут массивы чисел.
Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно.
Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();//список с массивами чисел
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {1,2};
        int[] array3 = {1,2,3,4};
        int[] array4 = {1,2,3,4,5,6,7};
        int[] array5 = {};

        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(array1);
        list.add(array2);
        list.add(array3);
        list.add(array4);
        list.add(array5);
        return list;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
