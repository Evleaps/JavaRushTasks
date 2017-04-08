package com.javarush.task.task10.ПреобразованиеТипов;

/* 
Задача №1 на преобразование целых типов
Расставьте правильно операторы приведения типа, чтобы получился ответ: d > 0
int a = 0;
int b = (byte) a + 46;
byte c = (byte) (a*b);
double f = (char) 1234.15;
long d = (short) (a + f / c + b);
*/

public class Solution1 {
    public static void main(String[] args) {
        int a = 0;//0
        int b = (byte) a + 46;//46
        byte c = (byte) (a * b);//0
        double f = (char) 1234.15;//1234.0
        long d = (int) (a + f / c + b);//0+(-1)+0
        System.out.println(d);

    }
}
