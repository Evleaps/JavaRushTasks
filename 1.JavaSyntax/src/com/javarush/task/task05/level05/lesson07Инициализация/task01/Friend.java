package com.javarush.task.task05.level05.lesson07Инициализация.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя инициализаторами (тремя методами initialize):
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend
{
    private String name;
    private String gender;
    private int age;

    public void initialize(String name)
    {
        this.name = name;
    }

    public void initialize(String name,int age)
    {
        this.name = name;
        this.age = age;
    }

    public void initialize(int age)
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
