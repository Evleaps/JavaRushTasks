package com.javarush.task.task10Substring_ПреобразованиеТипов.task1015МассивИзArrayList;

import java.util.ArrayList;

/* 
Массив списков строк
Создать массив, элементами которого будут списки строк.
Заполнить массив любыми данными и вывести их на экран.
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //напишите тут ваш код
        ArrayList<String>[] arrayOfStringList = new ArrayList[2];
        ArrayList<String> addressesArr = new ArrayList<>();
        ArrayList<String> addressesArr1 = new ArrayList<String>();
        addressesArr.add("zero");
        addressesArr.add("zero1");
        addressesArr1.add("zero11");
        addressesArr1.add("zero11");


        arrayOfStringList[0] = addressesArr;
        arrayOfStringList[1] = addressesArr1;

        return arrayOfStringList;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}