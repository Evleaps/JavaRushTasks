package com.javarush.task.task05ИзучаемКонструкторы.level05ГеттерыСеттеры.lesson09Инициализация.task04;

/* Создать класс Circle
Создать класс (Circle) круг, с тремя конструкторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color
*/

public class Circle
{
    //напишите тут ваш код
    //напишите тут ваш код
    private int centerX;
    private int centerY;
    private int radius;
    private int width;
    private String color;

    public Circle(int centerX,int centerY,int radius){
        this.centerX=centerX;
        this.centerY=centerY;
        this.radius=radius;
    }

    public Circle(int centerX,int centerY,int radius,int width){
        this.centerX=centerX;
        this.centerY=centerY;
        this.radius=radius;
        this.width=width;
    }

    public Circle(int centerX,int centerY,int radius,String color){
        this.centerX=centerX;
        this.centerY=centerY;
        this.radius=radius;
        this.width=width;
        this.color=color;
    }

}
