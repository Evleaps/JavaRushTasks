package com.javarush.task.task12АбстрактныеКлассыПолиморфизмИнтерфейсы.task12ПараметрическийПолиморфизм.task1209;

/* 
Три метода возвращают минимальное из двух переданных в него чисел
Написать public static методы: int min(int, int), long min(long, long), double min(double, double).
Каждый метод должен возвращать минимальное из двух переданных в него чисел.
*/

public class Solution {
    public static void main(String[] args) {
        min(5,8);
       min(5.3,8.8);
       min(5L,8L);
    }

    //Напишите тут ваши методы
    public static int min(int a,int b){
        int min = Math.min(a,b);
        return min;
    }
    public static long min(long a,long b){
        long min = Math.min(a,b);
        return min;
    }
    public static double min(double a,double b){
        double min = Math.min(a,b);
        return min;
    }


}
