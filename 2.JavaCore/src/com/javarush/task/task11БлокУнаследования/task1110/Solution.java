package com.javarush.task.task11БлокУнаследования.task1110;

/* 
Добавь недостающие переменные
Посмотри внимательно на методы и добавь недостающие поля.
*/

public class Solution {
    public static void main(String[] args) {
    }

    public class Cat {
        private String name;
        private int age;
        private int weight;
        private int speed;

        public Cat(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public void setWeight(int weight) {

        }

        public void setSpeed(int speed) {

        }
    }
}
