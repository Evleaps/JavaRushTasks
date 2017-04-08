package com.javarush.task.task05.level05.lesson12Максимум_из_Nчисел_иВыходСловом.bonus02МинИз5Чисел;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Нужно добавить в программу новую функциональность
Задача: Программа вводит два числа с клавиатуры и выводит минимальное из них на экран.
Новая задача: Программа вводит пять чисел с клавиатуры и выводит минимальное из них на экран.
*/

public class Solution
{

    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());

        int min_five = min(a, b, c, d, e);

        System.out.println("Minimum = " + min_five);
    }


    public static int min(int a, int b)
    {
        return a < b ? a : b;
    }

    public static int min(int a, int b, int c, int d, int e)
    {
        int min1 = min(a, b);
        int min2 = min(c, d);
        int min3 = min(min1, min2);

        return min(min3, e);
    }
}
