package com.javarush.task.task08_Data_HashMap_сортировки.level08.lesson08.task04УдалитьТехКтоРодилсяЛетом;

import java.util.*;

/* Удалить всех людей, родившихся летом
Создать словарь (MapClass<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{

    public static void main(String[] args) throws Exception
    {
        HashMap<String, Date> map = createMap() ;
        removeAllSummerPeople(map);
        for (Map.Entry<String, Date> para : map.entrySet())
        {
            System.out.println(para.getKey() + " " + para.getValue());
        }
    }
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone1", new Date("JUNE 1 1980"));
        map.put("Stallone2", new Date("JANUARY 1 1980"));
        map.put("Stallone3", new Date("JULY 1 1980"));
        map.put("Stallone4", new Date("AUGUST 1 1980"));
        map.put("Stallone5", new Date("SEPTEMBER 1 1980"));
        map.put("Stallone6", new Date("OCTOBER 1 1980"));
        map.put("Stallone7", new Date("NOVEMBER 1 1980"));
        map.put("Stallone8", new Date("DECEMBER 1 1980"));
        map.put("Stallone9", new Date("JUNE 1 1980"));
        map.put("Stallone10", new Date("JUNE 1 1980"));


        return map;

        

    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        Iterator<Map.Entry<String,Date>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())
        {
            Map.Entry<String,Date> pair = iterator.next();
            Date date = pair.getValue();
            if (date.getMonth()>4 & date.getMonth()<8)
                iterator.remove();


        }
    }
}


