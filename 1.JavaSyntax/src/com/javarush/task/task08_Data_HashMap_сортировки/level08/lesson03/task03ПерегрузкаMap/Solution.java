package com.javarush.task.task08_Data_HashMap_сортировки.level08.lesson03.task03ПерегрузкаMap;

import java.util.HashMap;
import java.util.Map;

/* Коллекция HashMap из котов
Есть класс Cat с полем имя (name, String).
Создать коллекцию HashMap<String, Cat>.
Добавить в коллекцию 10 котов, в качестве ключа использовать имя кота.
Вывести результат на экран, каждый элемент с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //тут массив с именами
        String[] cats = new String[]
                {"васька", "мурка", "дымка", "рыжик", "серый", "снежок", "босс", "борис", "визя", "гарфи"};

        //передали значение в объект addCatsToMap
        HashMap<String, Cat> map = addCatsToMap(cats);

        //вывод
        for (Map.Entry<String, Cat> pair : map.entrySet())
        {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }


    public static HashMap<String, Cat> addCatsToMap(String[] cats)
    {
        //напишите тут ваш код
        Map<String,Cat> map = new HashMap<String, Cat>();
        for (int i = 0; i < cats.length; i++)
        {
            Cat cat = new Cat(cats[i]);
            map.put(cats[i],cat);
        }
        return (HashMap<String,Cat>) map;

    }


    public static class Cat
    {
        String name;

        public Cat(String name)
        {
            this.name = name;
        }

        @Override
        public String toString()
        {
            return name != null ? name.toUpperCase() : null;
        }
    }
}
