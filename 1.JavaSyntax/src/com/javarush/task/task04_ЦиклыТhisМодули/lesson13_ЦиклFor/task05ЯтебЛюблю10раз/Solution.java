package com.javarush.task.task04_ЦиклыТhisМодули.lesson13_ЦиклFor.task05ЯтебЛюблю10раз;

import java.io.*;

/* Все любят Мамбу
Ввести с клавиатуры имя и используя цикл for 10 раз вывести: [*имя* любит меня.]
Пример текста:
Света любит меня.
Света любит меня.
…
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         String text = reader.readLine();

         for(int i=0; i<10;i++) System.out.println(text+" любит меня.");

    }
}
