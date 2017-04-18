package com.javarush.task.task07Массивы.level07.lesson12.bonus03_Сортировка_Массива;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer[] array = new Integer[20];
        for (int i = 0; i < 20; i++)
        {
            array[i] = Integer.parseInt(reader.readLine());
        }

        Arrays.sort(array, Collections.reverseOrder());

        for (int x : array)
        {
            System.out.println(x);
        }
    }

    public static void sort(Integer[] array)
    {

        //напишите тут ваш код
        /*    Сортируем массив
        Для уменьшения - Arrays.sort(array, Collections.reverseOrder());
        Для увеличения  Arrays.sort(array);
        Для Имен названий от А до Я -  Arrays.sort(name);*/

    }
}
