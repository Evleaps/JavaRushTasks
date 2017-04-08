package com.javarush.task.task06.level06.lesson11_ещеStaticИсортировкаЧисел.bonus03_сортировкаЧиселУвеличение;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = Integer.parseInt(reader.readLine());
        }

        //Сортируем массив
        /*Для уменьшения - Arrays.sort(array, Collections.reverseOrder());
        * Для увеличения  Arrays.sort(array);
        * Для Имен/названий от А до Я -  Arrays.sort(name);*/

        Arrays.sort(array);//сортировка в порядке увеличения
        for (int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }

    }
}
