package com.javarush.task.task06СборщикМусораStaticСортировка.level06.lesson05СборщикМусора.task02;

/* Классы Cat и Dog и метод finalize для каждого
В каждом классе Cat и Dog написать метод finalize, который выводит на экран текст о том, что такой-то объект уничтожен.
*/

public class Cat
{
    String name = "f";

    protected void finalize() throws Throwable{
        System.out.println(name + " уничтожен");
    }


}

class Dog
{
    String name = "y";

    protected void finalize() throws Throwable{
        System.out.println(name + " уничтожен");
    }

}