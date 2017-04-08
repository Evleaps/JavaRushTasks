package com.javarush.task.task04_ЦиклыТhisМодули.lesson06_СортировкаЧисел.task07_Одно_число_не_равно_двум;

/* Три числа
Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой.
Вывести на экран порядковый номер числа, отличного от остальных.
Пример для чисел 4 6 6:
1
Пример для чисел 6 6 3:
3
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

         if (a==b & a!=c) System.out.println(3);
         if (a==c & a!=b) System.out.println(2);
         if (c==b & c!=a) System.out.println(1);
    }
}
