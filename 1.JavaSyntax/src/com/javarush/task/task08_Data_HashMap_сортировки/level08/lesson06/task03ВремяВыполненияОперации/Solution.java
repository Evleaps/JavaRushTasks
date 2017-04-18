package com.javarush.task.task08_Data_HashMap_сортировки.level08.lesson06.task03ВремяВыполненияОперации;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* Измерить сколько времени занимает 10 тысяч вставок для каждого списка
Измерить, сколько времени занимает 10 тысяч вставок для каждого списка.
Метод getTimeMsOfInsert  должен вернуть время его исполнения в миллисекундах.
*/

public class Solution
{
    public static void main(String[] args)
    {
        System.out.println(getTimeMsOfInsert(new ArrayList()));
        System.out.println(getTimeMsOfInsert(new LinkedList()));
    }

    public static long  getTimeMsOfInsert(List list)
    {
        //напишите тут ваш код
        Date currentTime = new Date(); //текущая дата

        insert10000(list);

        //напишите тут ваш код
        Date newTime = new Date();//время после выполнения 10К операций вставки

        long msDalay = newTime.getTime() - currentTime.getTime();
        return msDalay;
    }

    public static void insert10000(List list)
    {
        for (int i=0;i<10000;i++)
        {
            list.add(0, new Object());
        }
    }
}
