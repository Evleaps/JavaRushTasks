package com.javarush.task.task04_ЦиклыТhisМодули.lesson10_ЦиклWhile.task03_ЦиклВыводаСтрок;

import java.io.*;

/* Хорошего не бывает много
Ввести с клавиатуры строку и число N.
Вывести на экран строку N раз используя цикл while.
Пример ввода:
абв
2
Пример вывода:
абв
абв
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        int b = Integer.parseInt(reader.readLine());

        int i = 0; // указать начальную точку
        while (i < b)
        { // указать, до какого числа исполнять цикл
            System.out.println(a);//указать что делать, во время выполнения
            i++;//увеличить, иначе будет рекурсия

        }
    }
}