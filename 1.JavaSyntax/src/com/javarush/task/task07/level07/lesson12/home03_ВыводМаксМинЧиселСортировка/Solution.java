package com.javarush.task.task07.level07.lesson12.home03_ВыводМаксМинЧиселСортировка;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* Максимальное и минимальное числа в массиве
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer array[] = new Integer[20];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = Integer.parseInt(reader.readLine()); //ввели числа
        }

        Arrays.sort(array);//отсортировал по возрастанию

        //теперь маленькое в начале и большое в конце, вывод мак + пробел + минимум

        System.out.println((array[array.length-1]) + " " + array[0]);


        /*    Сортируем массив
        Для уменьшения - Arrays.sort(array, Collections.reverseOrder());
        Для увеличения  Arrays.sort(array);
        Для Имен названий от А до Я -  Arrays.sort(name);*/




    }
}
