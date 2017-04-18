package com.javarush.task.task05ИзучаемКонструкторы.level05ГеттерыСеттеры.lesson09Инициализация.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя конструкторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    //напишите тут ваш код
    private String name;
    private int growth;
    private String color;

    public Dog (String name){
        this.name = name;
    }

    public Dog (String name,int growth){
        this.name = name;
        this.growth = growth;
    }

    public Dog (String name,int growth,String color){
        this.name = name;
        this.growth = growth;
        this.color = color;
    }

}
