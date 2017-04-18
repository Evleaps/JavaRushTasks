package com.javarush.task.task08_Data_HashMap_сортировки.task0818_УдалитьКтоЗПменьше500Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
Создать словарь (Map<String, Integer>) и занести в него десять записей по принципу: «фамилия» — «зарплата».
Удалить из словаря всех людей, у которых зарплата ниже 500
*/

public class Solution {
    //метод с самим массивом
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Иванов", 300);
        map.put("Аймалетдинов", 4500);
        map.put("Рошмаков", 3000);
        map.put("Гусев", 3000);
        map.put("Осипова", 2000);
        map.put("Макарычева", 3500);
        map.put("Зимин", 400);
        map.put("Сокольский", 2900);
        map.put("Горбунов", 1800);
        map.put("Демидов", 900);
        return map;
    }

    //метод который удаляет из массива
    public static HashMap<String, Integer> removeItemFromMap(HashMap<String, Integer> map) {
        //сначала вызвать итератор
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Integer> pair = iterator.next();
            int money = pair.getValue();
            if (money<500) iterator.remove();
        }
        //не забыть возвратить новое значение
        return map;
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = removeItemFromMap(createMap());//map равен методу удаления который вызвал массив

        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext())
        {
            Map.Entry<String,Integer> pair = iterator.next();
            String key = pair.getKey();
            int value = pair.getValue();
            System.out.println(key + " - " + value);
        }


    }


}