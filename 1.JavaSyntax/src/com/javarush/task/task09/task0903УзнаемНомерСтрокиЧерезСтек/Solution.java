package com.javarush.task.task09.task0903УзнаемНомерСтрокиЧерезСтек;

/* 
Кто меня вызывал?

Написать пять методов, которые вызывают друг друга.
Метод должен вернуть номер строки кода, из которого вызвали этот метод.
Воспользуйся функцией: element.getLineNumber().
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        method1();
    }

    public static int method1() {
        method2();
        int element = Thread.currentThread().getStackTrace()[2].getLineNumber();
        System.out.println(element);
        return  element;
    }

    public static int method2() {
        method3();
        int element = Thread.currentThread().getStackTrace()[2].getLineNumber();
        System.out.println(element);
        return  element;
    }

    public static int method3() {
        method4();
        int element = Thread.currentThread().getStackTrace()[2].getLineNumber();
        System.out.println(element);
        return  element;
    }

    public static int method4() {
        method5();
        int element = Thread.currentThread().getStackTrace()[2].getLineNumber();
        System.out.println(element);
        return  element;
    }

    public static int method5() {
        int element = Thread.currentThread().getStackTrace()[2].getLineNumber();
        System.out.println(element);
        return  element;
    }
}
