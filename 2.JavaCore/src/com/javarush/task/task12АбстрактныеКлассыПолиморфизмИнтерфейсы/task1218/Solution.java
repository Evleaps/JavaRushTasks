package com.javarush.task.task12АбстрактныеКлассыПолиморфизмИнтерфейсы.task1218;

/* 
Fly, Move, Eat для классов Dog, Car, Duck, Airplane
Есть public интерфейсы Fly(летать), Move(передвигаться), Eat(есть).
Добавь эти интерфейсы классам Dog(собака), Car(автомобиль), Duck(утка), Airplane(самолет).
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface Fly {
        public void fly();
    }

    public interface Move {
        public void move();
    }

    public interface Eat {
        public void eat();
    }

    public class Dog implements Eat, Move {
        public void eat(){}
        public void move(){}
    }

    public class Duck implements Eat, Move, Fly {
        public void eat(){}
        public void move(){}
        public void fly(){}
    }

    public class Car implements Move{
        public void move(){}
    }

    public class Airplane implements Move, Fly{
        public void move(){}
        public void fly(){}
    }
}
