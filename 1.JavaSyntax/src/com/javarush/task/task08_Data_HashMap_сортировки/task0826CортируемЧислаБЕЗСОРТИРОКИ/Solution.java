package com.javarush.task.task08_Data_HashMap_сортировки.task0826CортируемЧислаБЕЗСОРТИРОКИ;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Пять победителей
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }

    public static void sort(int[] array) {
        //напишите тут ваш код
        for (int i = 0; i < 5; i++)
            for (int j = i; j < array.length; j++)
                if(array[i]<array[j]){
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }


/* ТАК Я ИСПОЛЬЗОВАЛ СОРТИРОВКУ РАБОЧИЙ
      Integer[] newArray = new Integer[20];
        for (int i = 0; i < 20; i++) {
            newArray[i] = array[i];
        }
        Arrays.sort(newArray, Collections.reverseOrder());
        for (int i = 0; i < 5; i++) {
            array[i] = newArray[i];
        }
*/
    }
}
