package com.javarush.task.task09.task0902УзнатьЧерезСтекКтоНасВызвал;

/* 
И снова StackTrace
Написать пять методов, которые вызывают друг друга.
Каждый метод должен возвращать имя метода, вызвавшего его, полученное с помощью StackTrace.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        method1();

    }

    public static String method1() {
        StackTraceElement[] stackTraceElements2 = Thread.currentThread().getStackTrace();
        String name = stackTraceElements2[2].getMethodName();
        System.out.println(name);
        method2();
        return name;
        //напишите тут ваш код
    }

    public static String method2() {

        StackTraceElement[] stackTraceElements3 = Thread.currentThread().getStackTrace();
        String name = stackTraceElements3[2].getMethodName();
        System.out.println(name);
        method3();
        return name;
        //напишите тут ваш код
    }

    public static String method3() {

        StackTraceElement[] stackTraceElements4 = Thread.currentThread().getStackTrace();
        String name = stackTraceElements4[2].getMethodName();
        System.out.println(name);
        method4();

        return name;
        //напишите тут ваш код
    }

    public static String method4() {

        StackTraceElement[] stackTraceElements5 = Thread.currentThread().getStackTrace();
        String name = stackTraceElements5[2].getMethodName();
        System.out.println(name);
        method5();
        return name;
        //напишите тут ваш код
    }

    public static String method5() {
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements6 = Thread.currentThread().getStackTrace();
        String name = stackTraceElements6[2].getMethodName();
        System.out.println(name);

        return name;
    }
}
