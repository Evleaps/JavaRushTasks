package com.javarush.task.task10.ПреобразованиеТипов;

/* 
Задача №2 на преобразование целых типов
Расставьте правильно операторы приведения типа, чтобы получился ответ: d=3.765
int a = 15;
int b = 4;
float c = a / b;
double d = a * 1e-3 + c;
*/

public class ПреобразованиеЧислоЕ {
    public static void main(String[] args) {
        int a = 15;
        int b = 4;
        float  c = (float) a / b; //3.75 (Без приведения 3.0)
        double d =  a * 1e-3 + c;
        /*15*1*10-3+3,75=
        = 15*0.001+3.75=
        =0.015+3.75=3.765*/

        System.out.println(d);


    }
}
