package com.javarush.task.task04_ЦиклыТhisМодули.lesson06_СортировкаЧисел.task01_мин_из_2х_чисел;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        int a1 = Integer.parseInt(a);
        String b = reader.readLine();
        int b1 = Integer.parseInt(b);

        if (a1<b1) System.out.println(a1);
        else System.out.println(b1);

    }
}