package com.javarush.task.task04_ЦиклыТhisМодули.lesson13_ЦиклFor.task03_РисТреугольник;

/* Рисуем треугольник
Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
Пример:
8
88
888
...
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //
        //МАГИЯ, ВЕЗДЕ МАГИЯ ААААААА
        for (int c=1; c<11;c++)
        for (int i=0; i<1;i++){
            for (int b=0;b<c;b++){
                System.out.print(8);
            }
            System.out.println("");
        }

    }
}
