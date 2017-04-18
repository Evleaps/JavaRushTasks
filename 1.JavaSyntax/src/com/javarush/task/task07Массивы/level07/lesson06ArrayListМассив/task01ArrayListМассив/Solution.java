package com.javarush.task.task07Массивы.level07.lesson06ArrayListМассив.task01ArrayListМассив;

import java.util.ArrayList;

/* 5 различных строчек в списке
1. Создай список строк.
2. Добавь в него 5 различных строчек.
3. Выведи его размер на экран.
4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        ArrayList<String> text = new ArrayList<String>();
        //1
        String text1 = "a";
        String text2 = "б";
        String text3 = "г";
        String text4 = "в";
        String text5 = "д";
        //2
        text.add(text1);
        text.add(text2);
        text.add(text3);
        text.add(text4);
        text.add(text5);
        //3
        System.out.println(text.size());
        //4
        for (int i = 0; i < text.size(); i++)
        {
            System.out.println(text.get(i));
        }



    }
}
