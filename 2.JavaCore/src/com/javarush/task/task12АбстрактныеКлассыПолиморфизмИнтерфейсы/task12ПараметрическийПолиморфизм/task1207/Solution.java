package com.javarush.task.task12АбстрактныеКлассыПолиморфизмИнтерфейсы.task12ПараметрическийПолиморфизм.task1207;

/* 
print(int) и print(Integer)
Написать два метода: print(int) и print(Integer).
Написать такой код в методе main, чтобы вызвались они оба.
*/

public class Solution {
    public static void main(String[] args) {
        print(7);
        print((Integer) 200);

    }

    //Напишите тут ваши методы
    public static void print(int a){}
    public static void print(Integer b){
    }
}
