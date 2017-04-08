package com.javarush.task.task04_ЦиклыТhisМодули.lesson13_ЦиклFor.task01_От1до100Четные;

/* Четные числа
Используя цикл for вывести на экран чётные числа от 1 до 100 включительно.
Через пробел либо с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        for (int i=1; i<101;i++) {
            if (i%2==0) System.out.println(i);
        }

    }
}
