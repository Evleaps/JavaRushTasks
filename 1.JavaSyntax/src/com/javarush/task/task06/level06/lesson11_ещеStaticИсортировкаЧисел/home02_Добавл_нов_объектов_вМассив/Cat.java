package com.javarush.task.task06.level06.lesson11_ещеStaticИсортировкаЧисел.home02_Добавл_нов_объектов_вМассив;

import java.util.ArrayList;

/* Статические коты
1. В классе Cat добавь public статическую переменную cats (ArrayList<Cat>).
2. Пусть при каждом создании кота (нового объекта Cat) в переменную cats добавляется этот новый кот. Создать 10 объектов Cat.
3. Метод printCats должен выводить всех котов на экран. Нужно использовать переменную cats.
*/

public class Cat {
    public Cat() {
    }
    //напишите тут ваш код
    static ArrayList<Cat> cats = new ArrayList<Cat>();



    public static void main(String[] args) {
        //Создай тут 10 котов
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        Cat cat5 = new Cat();
        Cat cat6 = new Cat();
        Cat cat7 = new Cat();
        Cat cat8 = new Cat();
        Cat cat9 = new Cat();
        Cat cat10 = new Cat();
        //добавление новых объектов в начало массива cats
        cats.add(0,cat1);
        cats.add(0,cat2);
        cats.add(0,cat3);
        cats.add(0,cat4);
        cats.add(0,cat5);
        cats.add(0,cat6);
        cats.add(0,cat7);
        cats.add(0,cat8);
        cats.add(0,cat9);
        cats.add(0,cat10);
        printCats();
    }

    public static void printCats() {
        //Добавь свой код для пункта 3 тут
        System.out.println(Cat.cats);

    }
}
