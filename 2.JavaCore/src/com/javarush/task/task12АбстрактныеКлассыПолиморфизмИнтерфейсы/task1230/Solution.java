package com.javarush.task.task12АбстрактныеКлассыПолиморфизмИнтерфейсы.task1230;

/* 
Метод, который выводит на экран число 10
Добавь еще один метод, чтобы программа выводила на экран число 10.

Подсказка:
используй перегрузку методов.
*/

public class Solution {
    public static void main(String[] args) {
        Integer i = 5;
        int x = transformValue(i);

        System.out.println(x);
    }
    //если нет int а Integer то третий по счету метод вообще не вызовется, ошибка
    public static int transformValue(Integer i)
    {
        return i*2;
    }
    public static int transformValue(int i) {
        return i * i;
    }

}
