package com.javarush.task.task04_ЦиклыТhisМодули.lesson04РаботСчисламиИмодулями.task02_Blizhaishee_chislo;

/* Ближайшее к 10
Реализовать метод closeToTen. Метод должен выводить на экран ближайшее к 10 из двух чисел, записанных в аргументах метода.
Например, среди чисел 8 и 11 ближайшее к десяти 11. Если оба числа на равной длине к 10, то вывести на экран любое из них.
Подсказка:  используйте метод public static int abs(int a), который возвращает абсолютную величину числа.
*/

public class Solution
{
    public static void main(String[] args)
    {
        closeToTen(8,11);
        closeToTen(14,7);
    }

    public static void closeToTen(int a, int b)
    {
        //::CODE:
        if (abs(10-a)<abs(10-b)) // abs дает модуль числа
            /*10-8 = 2, 10-11=-1 == модуль -1 равен [1]*/   //ОТВЕТ 11
            /*10-14=-4 или [4] по модулю, 10-3=3*/          //ОТВЕТ 7
        System.out.println(a);
        else
            System.out.println(b);


    }
    public static int abs(int a) // описываем АБС, что бы давал модуль числа
    {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}