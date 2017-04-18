package com.javarush.task.task08_Data_HashMap_сортировки.task0823ИзменяемРегистрСловВстроке;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();//вводим строку
        char[] a = s.toCharArray();//разбили строку на массив

        a[0] = Character.toUpperCase(a[0]);//сдели первый элемент массива большой буквой

        Boolean b = false;

        //а теперь найдем остальные буквы в словах
        for (int i = 0; i < a.length; i++)//на длину всего массива
        {
            if (a[i] == ' ')//если эл-т является пробелом
            {
                b = true; //то
            }
            else if (a[i] != ' ' && b) // иначе если э-т не пробел и не true
            {
                a[i] = Character.toUpperCase(a[i]);//то увеличиваем регистр
                b = false;//и возвращаем false, что бы не зависло
            }
        }

        System.out.println(a);

        //рабочий код, но валидатор агрит
        //НА САМОМ ДЕЛЕ ВВОД ТОЧКИ УРОНИТ ПРОГРАММУ
        /*String[] array = s.split(" ");//разбил строку на слова
        for (int i = 0; i < array.length; i++) {//
            char[] slovo = array[i].toCharArray();//разбил каждое слово на символы
            slovo[0] = Character.toUpperCase(slovo[0]);//увеличил регистр
            System.out.print(slovo);
            System.out.print(" ");
        }*/

    }
}
