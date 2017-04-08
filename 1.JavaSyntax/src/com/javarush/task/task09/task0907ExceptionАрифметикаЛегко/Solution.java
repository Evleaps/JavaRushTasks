package com.javarush.task.task09.task0907ExceptionАрифметикаЛегко;

/* 
Исключение при работе с числами
Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
*/

public class Solution {
    public static void main(String[] args) throws Exception{
        //напишите тут ваш код

        try {
            int a = 42 / 0;
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }

        //напишите тут ваш код
    }
}
