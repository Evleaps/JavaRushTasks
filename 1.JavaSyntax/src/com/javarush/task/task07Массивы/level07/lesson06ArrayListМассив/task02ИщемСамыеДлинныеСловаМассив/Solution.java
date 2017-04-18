package com.javarush.task.task07Массивы.level07.lesson06ArrayListМассив.task02ИщемСамыеДлинныеСловаМассив;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //1
        ArrayList<String> text = new ArrayList<String>();
        //2
        int max = 0;
        String s = null;
        for (int i = 0; i < 5; i++)
        {
             text.add(reader.readLine()); //упрощенка ввода в массив
        }
        //3

        for (int i = 0; i < 5; i++)//находим максимум
        {
            if (text.get(i).length() > max)
            {
                max = text.get(i).length();//присваиваем значение максимуму
                s = text.get(i);//присваиваем переменной текст
            }
        }
        for (int j = 0; j < 5; j++)
        {
            if (text.get(j).length()==s.length() & text.get(j)!= s)//равно длине и не является значением переменной S
                System.out.println(text.get(j));
        }

        System.out.println(s);

    }
}
