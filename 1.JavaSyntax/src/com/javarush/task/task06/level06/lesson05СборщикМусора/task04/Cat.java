package com.javarush.task.task06.level06.lesson05СборщикМусора.task04;

/* Cчётчик котов
В конструкторе класса Cat [public Cat()] увеличивать счётчик котов (статическую переменную этого же класса catCount) на 1. В методе finalize уменьшать на 1.
*/

public class Cat
{
    public static int catCount = 0;

    //напишите тут ваш код
    public Cat(){
        catCount++;
    }
    protected void finalize() throws Throwable
    {
        super.finalize();
        catCount--;
    }

    public static void main(String[] args) {
    }
}
