package com.javarush.task.task12АбстрактныеКлассыПолиморфизмИнтерфейсы.task12АбстракстныеКлассы.task1212;

/* 
Исправь код. Первая задача
Исправь код, чтобы программа компилировалась.

Подсказка:
метод getChild должен остаться абстрактным.
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static abstract class Pet {
        public String getName() {
            return "Я - котенок";
        }

        public abstract Pet getChild();
    }
}
