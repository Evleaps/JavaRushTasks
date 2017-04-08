package com.javarush.task.task09.task0930СортировкаБезСортировкиБУквыЧисла;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Задача по алгоритмам
Задача: Пользователь вводит с клавиатуры список слов (и чисел).
Слова вывести в возрастающем порядке, числа — в убывающем.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        {
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < array.length; i++) {
                if (isNumber(array[i])) {
                    list.add(Integer.parseInt(array[i]));
                    for (int j = i; j < array.length; j++) {
                        if (isNumber(array[j]) && !isGreaterThan(array[i], array[j])) {
                            String buffer = array[i];
                            array[i] = array[j];
                            array[j] = buffer;
                        }
                    }
                } else {
                    for (int j = i; j < array.length; j++) {
                        if (!isNumber(array[j]) && isGreaterThan(array[i], array[j])) {
                            String buffer = array[i];
                            array[i] = array[j];
                            array[j] = buffer;
                        }
                    }
                }
            }
            Collections.sort(list,Collections.reverseOrder());
            int coutn = 0;
            for (int i = 0; i < array.length; i++) {
                if (isNumber(array[i])){
                    array[i] = list.get(coutn).toString();
                coutn++;
                }
            }
        }
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-')) // не цифра и не начинается с '-'
            {
                return false;
            }
        }
        return true;
    }
}
