package com.javarush.task.task07.level07.lesson06ArrayListМассив.task04СтрокиВначалоМассива;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 10 строчек в начало списка
1. Создай список строк в методе main.
2. Добавь в него 10 строчек с клавиатуры, но только добавлять не в конец списка, а в начало.
3. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //1
        ArrayList<String> list = new ArrayList<>();
        //2
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++)
        {
            list.add(0,reader.readLine());
        }
        //3
        for (int i = 0; i < 10; i++)
        {
            System.out.println(list.get(i));
        }

    }
}
