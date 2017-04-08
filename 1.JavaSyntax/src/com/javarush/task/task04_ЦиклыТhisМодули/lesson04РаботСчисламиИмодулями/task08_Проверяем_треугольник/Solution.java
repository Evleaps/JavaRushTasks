package com.javarush.task.task04_ЦиклыТhisМодули.lesson04РаботСчисламиИмодулями.task08_Проверяем_треугольник;

/* Треугольник
Ввести с клавиатуры три числа а, b, c – стороны предполагаемого треугольника.
Определить возможность существования треугольника по сторонам. Результат вывести на экран в следующем виде:
"Треугольник существует." - если треугольник с такими сторонами существует.
"Треугольник не существует." - если треугольник с такими сторонами не существует.
Подсказка: Треугольник существует только тогда, когда сумма любых двух его сторон больше третьей.
Требуется сравнить каждую сторону с суммой двух других.
Если хотя бы в одном случае сторона окажется больше суммы двух других, то треугольника с такими сторонами не существует.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
    //напишите тут ваш код
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String a = reader.readLine();
    int a1 = Integer.parseInt(a);
    String b = reader.readLine();
    int b1 = Integer.parseInt(b);
    String c = reader.readLine();
    int c1 = Integer.parseInt(c);

    if ((a1 + b1) > c1 & (b1 + c1) > a1 & (c1 + a1) > b1)
        System.out.println("Треугольник существует.");
    else System.out.println("Треугольник не существует.");
}

        }

