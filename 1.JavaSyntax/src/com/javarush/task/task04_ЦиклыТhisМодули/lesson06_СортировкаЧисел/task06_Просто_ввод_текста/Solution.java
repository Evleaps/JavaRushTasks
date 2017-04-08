package com.javarush.task.task04_ЦиклыТhisМодули.lesson06_СортировкаЧисел.task06_Просто_ввод_текста;

/* И 18-ти достаточно
Ввести с клавиатуры имя и возраст. Если возраст больше 20 вывести надпись «И 18-ти достаточно».
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         String name = reader.readLine();
         int age = Integer.parseInt(reader.readLine());
         if (age>20) System.out.println("И 18-ти достаточно");





    }
}
