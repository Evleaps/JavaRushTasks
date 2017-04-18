package com.javarush.task.task05ИзучаемКонструкторы.level05ГеттерыСеттеры.lesson12Максимум_из_Nчисел_иВыходСловом.bonus03_максимум_N_чисел;

import java.io.*;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = Integer.parseInt(reader.readLine());

        int[] number = new int[maximum];//создали массив на N ячеек
        for (int i = 0; i < number.length; i++)
        {
            number[i] = Integer.parseInt(reader.readLine());//заполнили ячейки
        }


        int max = number[0];
        for (int i = 0; i < number.length; i++)//цикл не более максимального количества ячеек в массиве
        {
            if (number[i]>max)//максимум нашли
                max = number[i];//присвоили максимум переменной

        }

        System.out.println (max);//вывод
    }
}
