package com.javarush.task.task09.task0919ВыводНаЭкранСтекаОшибки;

/* 
Деление на ноль
оздай метод public static void divisionByZero, в котором подели любое число на ноль и выведи на экран результат деления.
Оберни вызов метода divisionByZero в try..catch. Выведи стек-трейс исключения используя метод exception.printStackTrace()
*/

public class Solution {

    public static void main(String[] args) {
        try {
        divisionByZero();
        }catch (ArithmeticException exception){
            StackTraceElement[] elements = Thread.currentThread().getStackTrace();
            exception.printStackTrace();
        }
    }
    public static void divisionByZero(){
        int i = (int) (Math.random()*9+3);
        i = i / 0;
        System.out.println(i);

    }
}
