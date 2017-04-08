package com.javarush.task.task09.task0921ЕслиПользовательВВодТекстАнеЧислоТо;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Метод в try..catch
Написать программу, которая будет вводить числа с клавиатуры.
Код по чтению чисел с клавиатуры должен быть в методе readData.
Обернуть все тело (код внутри readData) этого метода в try..catch.
Если пользователь ввёл какой-то текст, вместо ввода числа, то метод должен перехватить исключение и вывести на экран все ранее введенные числа в качестве результата.
Числа выводить с новой строки сохраняя порядок ввода.
*/

public class Solution {
    public static void main(String[] args){
        try {
            readData();
        }catch (IOException e){
            System.out.println(e);
        }
    }

    public static void readData() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        try {
            while (true) {
                int nu = Integer.parseInt(reader.readLine());
                list.add(nu);
            }
        }catch (NumberFormatException e){
            for (int a : list) {
                System.out.println(a);
            }
        }
    }
}
