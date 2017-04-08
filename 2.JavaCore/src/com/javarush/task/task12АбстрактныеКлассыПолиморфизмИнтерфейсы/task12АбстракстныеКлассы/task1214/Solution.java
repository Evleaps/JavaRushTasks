package com.javarush.task.task12АбстрактныеКлассыПолиморфизмИнтерфейсы.task12АбстракстныеКлассы.task1214;

/* 
Класс Cow от Animal
Унаследуй класс Cow от Animal.
Реализуй все недостающие методы в классе Cow.
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static abstract class Animal {
        public abstract String getName();
    }

    public static class Cow extends Animal {
        public String getName(){
            return "корова";
        }
    }

}
