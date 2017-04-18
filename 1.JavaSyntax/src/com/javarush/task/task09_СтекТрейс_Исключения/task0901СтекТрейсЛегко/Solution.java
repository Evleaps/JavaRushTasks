package com.javarush.task.task09_СтекТрейс_Исключения.task0901СтекТрейсЛегко;

/* 
Возвращаем StackTrace
Написать пять методов, которые вызывают друг друга.
Каждый метод должен возвращать свой StackTrace.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        method1();
    }

    public static StackTraceElement[] method1() {
        method2();
        StackTraceElement[] stackTraceElements1 = Thread.currentThread().getStackTrace();
        return stackTraceElements1;
        //напишите тут ваш код
    }

    public static StackTraceElement[] method2() {
        method3();
        StackTraceElement[] stackTraceElements2 = Thread.currentThread().getStackTrace();
        return stackTraceElements2;
        //напишите тут ваш код
    }

    public static StackTraceElement[] method3() {
        method4();
        StackTraceElement[] stackTraceElements3 = Thread.currentThread().getStackTrace();
        return stackTraceElements3;
        //напишите тут ваш код
    }

    public static StackTraceElement[] method4() {
        method5();
        StackTraceElement[] stackTraceElements4 = Thread.currentThread().getStackTrace();
        return stackTraceElements4;
        //напишите тут ваш код
    }

    public static StackTraceElement[] method5() {
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements5 = Thread.currentThread().getStackTrace();

        return stackTraceElements5;

    }
}
