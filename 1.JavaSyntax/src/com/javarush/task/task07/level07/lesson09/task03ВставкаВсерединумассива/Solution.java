package com.javarush.task.task07.level07.lesson09.task03ВставкаВсерединумассива;

import java.util.ArrayList;
import java.util.Collections;

/* Слово «именно»
1. Создай список из слов «мама», «мыла», «раму».
2. После каждого слова вставь в список строку, содержащую слово «именно».
3. Используя цикл for вывести результат на экран, каждый элемент списка с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        //1
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "мама","мыла", "раму");
        //2
       list.add(1,"именно");
       list.add(3,"именно");
       list.add("именно");

        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }

    }
}
