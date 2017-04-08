package com.javarush.task.task01.task0140;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Выводим квадрат числа
Напиши программу, которая считывает с клавиатуры целое число a и выводит квадрат этого числа (a * a).
Внимательно просмотри лекцию. Для считывания данных с клавиатуры используй метод nextInt() класса Scanner.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        int a;
        //напишите тут ваш код
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         a = Integer.parseInt(reader.readLine());
         a = a*a;
        System.out.println(a);


    }
}