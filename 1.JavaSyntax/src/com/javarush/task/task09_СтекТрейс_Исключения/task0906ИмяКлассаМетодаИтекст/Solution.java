package com.javarush.task.task09_СтекТрейс_Исключения.task0906ИмяКлассаМетодаИтекст;

/* 
Логирование стек трейса
Реализовать метод log.
Он должен выводить на экран имя класса и имя метода (в котором вызывается метод log), а также переданное сообщение.
Имя класса, имя метода и сообщение разделить двоеточием с пробелом.

Пример вывода:
com.javarush.task.task09_СтекТрейс_Исключения.task0906ИмяКлассаМетодаИтекст.SolutionДобавьОперацию: main: In main method
*/

public class Solution {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String s) {
        //напишите тут ваш код
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        String nameMethod = elements[2].getMethodName();
        String nameClass = elements[2].getClassName();

        System.out.println(nameClass + ": "+nameMethod+": " + s);
    }
}
