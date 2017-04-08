package com.javarush.task.task04_ЦиклыТhisМодули.lesson07_ЧетНечетЧислаПоМодулю.task03_Кол_воЧетнНечетнЧисел;

/* Положительные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел в исходном наборе.
Пример для чисел -4 6 6:
2
Пример для чисел -6 -6 -3:
0
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         int a = Integer.parseInt(reader.readLine());
         int b = Integer.parseInt(reader.readLine());
         int c = Integer.parseInt(reader.readLine());

         if (a<0 & b<0 & c<0) System.out.println(0);
         if (a>0 & b>0 & c>0) System.out.println(3);
         if (a<0 & b>0 & c>0) System.out.println(2);
         if (a<0 & b<0 & c>0) System.out.println(1);


    }
}
