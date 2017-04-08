package com.javarush.task.task03.lesson05_return.task03;

/* Конвертер времени
Добавьте метод public static int convertToSeconds(int hour) который будет конвертировать часы в секунды.
Вызовите его дважды в методе main с любыми параметрами. Результаты выведите на экран, каждый раз с новой строки.
*/

public class Converts_Hour_to_Sec
{

    //напишите тут ваш код
    public static int convertToSeconds(int hour){
        int operation = hour *60*60; //hour множим на 60 минут и 60 секунд
        return operation;
    }

    public static void main(String[] args) {
        //напишите тут ваш код
        System.out.println(convertToSeconds(1));
        System.out.println(convertToSeconds(24));
    }
}