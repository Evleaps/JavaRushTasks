package com.javarush.task.task07Массивы.level07.lesson06ArrayListМассив.task03ИщемСамыеКороткиеСловаМассив;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Самая короткая строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую короткую строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //1
        ArrayList<String> list = new ArrayList<String>();
        //2
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++)
        {
            list.add(reader.readLine());
        }
        //3
        int max = list.get(0).length()+1;
        String text = null;
        for (int i = 0; i < 5; i++)
        {
            if (list.get(i).length() < max)
            {
                max = list.get(i).length();
                text = list.get(i);
            }
        }
        for (int i = 0; i < 5; i++)
        {
            if (list.get(i).length()==max & list.get(i)!=text)
                System.out.println(list.get(i));
        }
        System.out.println(text);
    }
}
