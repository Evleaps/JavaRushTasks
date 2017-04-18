package com.javarush.task.task03циклыВводСклавы.lesson04_Massiv.task02;

/* 4 скобки
Расставить правильно (по другому) скобки, чтобы на экран вывелось число 850
*/

public class Logic_850
{
    public static void main(String[] args)
    {
       // System.out.println( (1 + 2) * (3 + 4) * (5 + (6 * 7)) + 8 * 9 + 10 * 11 + 12 * 13 + 14 + 15);
        System.out.println(( 1 + 2 * (3 + 4 * 5 + 6 * 7 + 8 * 9 + 10 * 11 + 12 * 13 + 14) + 15));
    }
}