package com.javarush.task.task05.level05.lesson05ГеттерСеттер.task04Создал3объекта;


/* Создать три объекта типа Cat
В методе main создать три объекта типа Cat и заполнить их данными.
Использовать класс Cat из первой задачи. Класс Cat создавать не надо.
*/

//import com.javarush.task.task05.level05.lesson05ГеттерСеттер.task01ИмяКотика.Cat;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        /*com.javarush.task.task05.level05.lesson05ГеттерСеттер.task01ИмяКотика.Cat murka = new com.javarush.task.task05.level05.lesson05ГеттерСеттер.task01ИмяКотика.Cat();
        com.javarush.task.task05.level05.lesson05ГеттерСеттер.task01ИмяКотика.Cat murka1 = new com.javarush.task.task05.level05.lesson05ГеттерСеттер.task01ИмяКотика.Cat();
        com.javarush.task.task05.level05.lesson05ГеттерСеттер.task01ИмяКотика.Cat murka2 = new com.javarush.task.task05.level05.lesson05ГеттерСеттер.task01ИмяКотика.Cat();



        murka.name = "df";
        murka1.name = "df";
        murka2.name = "df";*/



        Cat cat1= new Cat("kek",15,13,124);
        Cat cat2= new Cat("keg",12,15,125);
        Cat cat3= new Cat("kefd",11,14,123);

    }

    public static class Cat {

        public static int count = 0;
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            count++;

            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}
