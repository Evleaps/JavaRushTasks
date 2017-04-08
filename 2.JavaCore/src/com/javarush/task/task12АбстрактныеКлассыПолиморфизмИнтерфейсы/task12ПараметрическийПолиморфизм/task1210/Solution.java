package com.javarush.task.task12АбстрактныеКлассыПолиморфизмИнтерфейсы.task12ПараметрическийПолиморфизм.task1210;

/* 
Три метода возвращают максимальное из двух переданных в него чисел
Написать public static методы: int max(int, int), long max(long, long), double max(double, double).
Каждый метод должен возвращать максимальное из двух переданных в него чисел.
*/

public class Solution {
    public static void main(String[] args) {
        max(5,8);
        max(5.3,8.8);
        max(5L,8L);
    }

    //Напишите тут ваши методы
    public static int max(int a,int b){
        int min = Math.max(a,b);
        return min;
    }
    public static long max(long a,long b){
        long min = Math.max(a,b);
        return min;
    }
    public static double max(double a,double b){
        double min = Math.max(a,b);
        return min;
    }
}
