package com.javarush.task.task04_ЦиклыТhisМодули.lesson04РаботСчисламиИмодулями.task05_Увеличить_число;

/* Положительное и отрицательное число
Ввести с клавиатуры число. Если число положительное, то увеличить его в два раза. Если число отрицательное, то прибавить единицу.
Вывести результат на экран.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        int b = Integer.parseInt(a);
                /*int oneVznos1 = Integer.parseInt(oneVznos);*/

        if (b < 0)
        {
            b++;
            System.out.println(b);
        }
        if (b > 0)
        {
            b = b * 2;
            System.out.println(b);
        }
    }}