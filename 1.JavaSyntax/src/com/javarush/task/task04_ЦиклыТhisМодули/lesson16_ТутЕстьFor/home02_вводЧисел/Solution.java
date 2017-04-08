package com.javarush.task.task04_ЦиклыТhisМодули.lesson16_ТутЕстьFor.home02_вводЧисел;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //напишите тут ваш код
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         int a1 = Integer.parseInt(reader.readLine());
         int b1 = Integer.parseInt(reader.readLine());
         int c1 = Integer.parseInt(reader.readLine());


        if (a1>b1 & a1>c1 & c1>b1) System.out.println(c1);
        if (a1>b1 & a1>c1 & b1>c1) System.out.println(b1);
        if (b1>c1 & b1>a1 & c1>a1) System.out.println(a1);
    }
}
