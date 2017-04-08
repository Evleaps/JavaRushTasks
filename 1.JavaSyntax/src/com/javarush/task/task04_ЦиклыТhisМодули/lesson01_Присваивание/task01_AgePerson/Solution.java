package com.javarush.task.task04_ЦиклыТhisМодули.lesson01_Присваивание.task01_AgePerson;

/* Shadowing variables
Подумайте, что делает программа.
Исправьте ошибку в программе чтобы переменная age объекта person изменила свое значение.
Подсказка: тщательно просмотрите метод adjustAge
*/
public class Solution
{
    public static void main(String[] args) {

        Person person = new Person();
        System.out.println("Age is: " + person.age);
        person.adjustAge(person.age);
        System.out.println("Adjusted Age is: " + person.age);
        person.newAge(person.age);
        System.out.println("new Age is: " + person.age);
    }

    public static class Person
    {
       /*В данном случае мы присваиваем перемнной age сумму age и 20. Но, в данном случае age - это переменная метода. Нам же нужно присвоить значение переменной класса.

Если переменные имеют одинаковое название, то в таком случае из метода мы можем обратиться к переменной класса при помощь this.переменная.*/

        int age = 20;

        void adjustAge(int age)
        {
            this.age = age + age + 20; // где this.age (this - этот) - переменная класса, а просто age - переменная метода
            System.out.println("The Age in adjustAge() is " + age);
        }
        void newAge(int age)
        {
            System.out.println("The Age in adjustAge() is " + age);
            this.age = age + age + age; // где this.age (this - этот) - переменная класса, а просто age - переменная метода

        }
    }
}
