package com.javarush.task.task05ИзучаемКонструкторы.level05ГеттерыСеттеры.lesson09Инициализация.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя конструкторами:
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend
{
    //напишите тут ваш код
    private String name;
    private int age;
    private String gender;

    public Friend(String name){
        this.name=name;
    }

    public Friend(String name, int age){
        this.name=name+age;
    }

    public Friend(String name,int age,String gender){
        this.name=name+age+gender;
    }

}