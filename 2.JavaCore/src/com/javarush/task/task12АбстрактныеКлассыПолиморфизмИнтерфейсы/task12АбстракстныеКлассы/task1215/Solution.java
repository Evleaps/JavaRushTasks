package com.javarush.task.task12АбстрактныеКлассыПолиморфизмИнтерфейсы.task12АбстракстныеКлассы.task1215;

/* 
Классы Cat и Dog от Pet
Унаследуй классы Cat и Dog от Pet.
Реализуй недостающие методы.
Классы Cat и Dog не должны быть абстрактными.
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static abstract class Pet {
        public abstract String getName();

        public abstract Pet getChild();
    }

    public static class Cat extends Pet{
        public String getName(){
            return "Cat";
        }
        public Pet getChild(){
            return new Cat();
        }
    }

    public static class Dog extends Pet{
        public String getName(){
            return "Dog";
        }
        public Pet getChild(){
            return new Dog();
        }

    }

}
