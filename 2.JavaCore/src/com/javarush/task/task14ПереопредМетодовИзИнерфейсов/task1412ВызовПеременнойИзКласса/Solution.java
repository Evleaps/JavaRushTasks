package com.javarush.task.task14ПереопредМетодовИзИнерфейсов.task1412ВызовПеременнойИзКласса;
/*
1. Напиши реализацию метода printMainInfo, чтобы:
1.1. Если в метод передают объект типа Drawable, у этого объекта вызывался метод draw.
1.2. Если в метод передают объект типа Movable, у этого объекта вызывался метод move.
*/
public class Solution {
    public static void main(String[] args) {
        Object obj = new Circle();
        Movable movable = (Movable) obj;
        Drawable drawable = new Rectangle();

        printMainInfo(drawable);
        printMainInfo(movable);
    }

    public static void printMainInfo(Object object) {
        //напишите тут ваш код\
        //крч вызвал переменную
        if (object instanceof Drawable) ((Rectangle)object).draw();
        if (object instanceof Movable) ((Circle)object).move();

    }

    static interface Movable {
        void move();
    }
    static class Circle implements Movable {
        public void draw() {
            System.out.println("can be drawn");
        }
        public void move() {
            System.out.println("can be moved");
        }
    }



    static interface Drawable {
        void draw();
    }
    static class Rectangle implements Drawable {
        public void draw() {
            System.out.println("can be drawn");
        }
        public void move() {
            System.out.println("can be moved");
        }
    }
}
