package com.javarush.task.task08_Data_HashMap_сортировки.task0822МинВАррайлист;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Минимальное из N чисел
1. Ввести с клавиатуры число N.
2. Считать N целых чисел и заполнить ими список — метод getIntegerList.
3. Найти минимальное число среди элементов списка — метод getMinimum.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        // find minimum here — найти минимум тут
        int min = array.get(0);
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i)<min)
                min = array.get(i);
        }
        return min;
    }


    public static List<Integer> getIntegerList() throws IOException {
        //create and initialize a list here - создать и заполнить список тут
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         int N = Integer.parseInt(reader.readLine());
         ArrayList<Integer> array = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            array.add(Integer.parseInt(reader.readLine()));
        }
        return array;
    }
}
