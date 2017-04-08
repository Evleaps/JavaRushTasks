package com.javarush.task.task07.level07.lesson06ArrayListМассив.task05ВзятьСконцаВначалоПоставить;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Удали последнюю строку и вставь её в начало
1. Создай список строк.
2. Добавь в него 5 строчек с клавиатуры.
3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //1
        ArrayList<String> list = new ArrayList<String>();
        //2
        for (int i = 0; i < 5; i++)
        {
            list.add(reader.readLine());
        }
        //3
        for (int i = 0; i < 13; i++)
        {
            String s = list.get(4);
            list.remove(4);
            list.add(0,s);
        }
        //4
        for (int i = 0; i < 5; i++)
        {
            System.out.println(list.get(i));
        }

    }
}
