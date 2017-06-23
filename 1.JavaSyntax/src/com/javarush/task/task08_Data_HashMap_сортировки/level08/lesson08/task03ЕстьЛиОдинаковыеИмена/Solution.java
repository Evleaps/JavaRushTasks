package com.javarush.task.task08_Data_HashMap_сортировки.level08.lesson08.task03ЕстьЛиОдинаковыеИмена;

import java.util.HashMap;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (MapClass<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        Map<String,String> map = new HashMap<>();//создал
        map.put("adin1","jopa1");
        map.put("adin2","jopa");
        map.put("adin3","jopa1");
        map.put("adin4","jopa2");
        map.put("adin5","jopa1");
        map.put("adin6","jopa");
        map.put("adin7","jopa");
        map.put("adin8","jopa2");
        map.put("adin9","jopa");
        map.put("adin10","jopa");

        return (HashMap<String,String>) map;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        //напишите тут ваш код
        int c = 0;
        for (Map.Entry<String,String> pair : map.entrySet())
            if (pair.getValue().equals(name))
                c++;
        return c;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        //напишите тут ваш код
        int a = 0;
        for (Map.Entry<String,String> pair1 : map.entrySet())
            if (pair1.getKey().equals(lastName))
                a++;
        return a;

    }
}
