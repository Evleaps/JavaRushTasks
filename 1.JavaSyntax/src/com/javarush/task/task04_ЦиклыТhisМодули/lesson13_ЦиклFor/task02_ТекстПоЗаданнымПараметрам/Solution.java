package com.javarush.task.task04_ЦиклыТhisМодули.lesson13_ЦиклFor.task02_ТекстПоЗаданнымПараметрам;

import java.io.*;

/* Рисуем прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
8888
8888
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         int a = Integer.parseInt(reader.readLine());
         int b = Integer.parseInt(reader.readLine());
         /*int c = a*b;*/

         for (int a1 = 0;a1<a;a1++) {
             for (int b1 = 0;b1<b;b1++){
                 System.out.print(8);
         }
        System.out.println("");


    }
}}
