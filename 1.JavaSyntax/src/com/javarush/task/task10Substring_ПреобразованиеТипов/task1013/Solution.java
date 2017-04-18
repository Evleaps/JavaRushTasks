package com.javarush.task.task10Substring_ПреобразованиеТипов.task1013;

/* 
Конструкторы класса Human
Напиши класс Human с 6 полями.
Придумай и реализуй 10 различных конструкторов для него.
Каждый конструктор должен иметь смысл.
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // напишите тут ваши переменные и конструкторы
        private String name;
        private int age;
        private boolean gender;
        private long penis;
        private int weight;
        private boolean perents;


        public Human(String name, int age, boolean gender, long penis, int weight,
                     int speedJavaEducations, boolean topMen, boolean toy,
                     byte sizeDojki, boolean perents) {
            /*this.name = name;
            this.age = age;
            this.gender = gender;
            this.penis = penis;
            this.weight = weight;
            this.perents = perents;*/

        }
        public Human(String name, int age, boolean gender, long penis, int weight,
                     int speedJavaEducations, boolean topMen, boolean toy) {
        }
        public Human(String name, int age, boolean gender, long penis, int weight,
                     int speedJavaEducations, boolean topMen) {
        }
        public Human(String name, int age, boolean gender, long penis, int weight,
                     int speedJavaEducations) {
        }
        public Human(String name, int age, boolean gender, long penis, int weight) {
        }
        public Human(String name, int age, boolean gender) {
        }
        public Human(String name, int age, boolean gender, long penis) {
        }
        public Human(String name, int age) {
        }
        public Human(String name) {
        }
        public Human(String name, int age, boolean gender,int weight, long penis) {
        }

    }
}


