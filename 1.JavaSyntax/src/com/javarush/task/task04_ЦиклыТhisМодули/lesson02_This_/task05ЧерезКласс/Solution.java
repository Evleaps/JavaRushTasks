package com.javarush.task.task04_ЦиклыТhisМодули.lesson02_This_.task05ЧерезКласс;

/* Подсчитать количество котов
Написать код, чтобы правильно считалось количество созданных котов (count) и на экран выдавалось правильно их количество.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Cat cat1 = new Cat();
        Cat.count++;//прибавляет 1 к выводу
        cat1.count+=1;//прибавляет переданное число, и обозначает, что оно принадлежит только этому объекту "Сат1"
        //напишите тут ваш код

        Cat cat2 = new Cat();
        Cat.count++;
        //напишите тут ваш код

        System.out.println("Cats count is " + Cat.count);
    }
    public static class Cat
    {
        public static int count = 0;
    }
}