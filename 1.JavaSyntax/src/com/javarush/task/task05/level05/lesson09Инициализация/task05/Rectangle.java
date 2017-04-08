package com.javarush.task.task05.level05.lesson09Инициализация.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота). Создать для него как можно больше конструкторов:
Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle
{
    //напишите тут ваш код
    private int top;
    private int left;
    private int width;
    private int height;
    private Rectangle copy;

    public Rectangle(int top,int left, int width, int height){
        this.left=left;
        this.top=top;
        this.width=width;
        this.height=height;
    }

    public Rectangle(int top,int left){
        this.top=top;
        this.left=left;
        this.width=0;
        this.height=0;
    }

    public Rectangle(int top,int left, int width){
        this.top=top;
        this.left=left;
        this.width=width;
        this.height=width;
    }

    public Rectangle(Rectangle copy){
        this.top=top;
        this.left=left;
        this.width=width;
        this.height=height;
    }

}
