package com.javarush.task.task05.level05.lesson05ГеттерСеттер.task01ИмяКотика;

/* Создать класс Cat
Создать класс Cat. У кота должно быть имя (name, String), возраст (age, int), вес (weight, int), сила (strength, int).
*/

public class Cat
{
    //описал работу программы
    String name;
    int age;
    int weight;
    int strength;

    public static void main(String[] args)
            //опиа
    {
        Cat puma = new Cat();
        puma.name = "Жора";
        puma.age = 5;
        puma.weight = 48;
        puma.strength = 150;
    }


}
