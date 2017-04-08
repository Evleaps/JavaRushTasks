package com.javarush.task.task04_ЦиклыТhisМодули.lesson10_ЦиклWhile.task05_ТаблицаУмножWhile;

/* Таблица умножения
Вывести на экран таблицу умножения 10х10 используя цикл while.
Числа разделить пробелом.
1 2 3 4 5 6 7 8 9 10
2 4 6 8 10 12 14 16 18 20
...
*/

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        int i = 1;
        while (i<=10){
            int h = 1;
            while (h<=10){
                System.out.print(i*h + " ");
                h++;
            }
            System.out.println("");
            i++;
        }


    }
}
