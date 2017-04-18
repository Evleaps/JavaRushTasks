package com.javarush.task.task08_Data_HashMap_сортировки.level08.lesson06.task02_10К_удалений_и_др;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* Провести 10 тысяч вставок, удалений
Для arrayList и linkedList провести 10 тысяч вставок, удалений, а также вызовов get и set.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        // ArrayList
        ArrayList arrayList = new ArrayList();
        insert10000(arrayList);
        get10000(arrayList);
        set10000(arrayList);
        remove10000(arrayList);

        // LinkedList
        LinkedList linkedList = new LinkedList();
        insert10000(linkedList);
        get10000(linkedList);
        set10000(linkedList);
        remove10000(linkedList);
    }

    public static void insert10000(List list)
    {
        //напишите тут ваш код
        List<Integer> list1=list;
        for (int i = 0; i < 10000; i++)
        {
            list1.add(5);
        }


    }

    public static void get10000(List list)
    {
        List<Integer> list1=list;
        //напишите тут ваш код
        for (int i = 0; i < 10000; i++)
        {
            list1.get(i);
        }

    }

    public static void set10000(List list)
    {
        //напишите тут ваш код
        List<Integer> list1=list;
        for (int i = 0; i < 10000; i++)
        {
            list1.set(i,5);
        }

    }

    public static void remove10000(List list)
    {
        //напишите тут ваш код
        List<Integer> list1=list;
        for (int i = 0; i < 10000; i++)
        {
            list1.remove(0);
        }

    }
}
