package com.javarush.task.task03.lesson05_return.task02;

/* Реализация метода
Реализуйте метод public static void writeToConsole(String s), который добавляет к началу строки выражение "printing: "
и выводит измененную строку на экран, каждый раз с новой строки.
Пример вывода для "Hello world!":
printing: Hello world!
*/

public class Realized_metod
{
    public static void main(String[] args)
    {
        writeToConsole("Hello world!");
    }

    public static void writeToConsole(String s)
    {
        //напишите тут ваш код
        System.out.println("printing: " + s );
    }
}