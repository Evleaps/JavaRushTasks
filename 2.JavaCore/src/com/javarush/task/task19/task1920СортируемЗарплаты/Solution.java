package com.javarush.task.task19.task1920СортируемЗарплаты;

/* 
Самый богатый
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] — String, [значение] — double. [имя] и [значение] разделены пробелом.

Для каждого имени посчитать сумму всех его значений.
Вывести в консоль имена в алфавитном порядке, у которых максимальная сумма.
Имена разделять пробелом либо выводить с новой строки.
Закрыть потоки.

Пример входного файла:
Петров 0.501
Иванов 1.35
Петров 0.85

Пример вывода:
Петров


Требования:
1. Программа НЕ должна считывать данные с консоли.
2. Программа должна считывать содержимое файла (используй FileReader).
3. Поток чтения из файла (FileReader) должен быть закрыт.
4. Программа должна выводить в консоль имена, у которых максимальная сумма.
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        TreeMap<String, Double> map = new TreeMap<>();
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));

        String str;
        while ((str = reader.readLine()) != null) {
            String name = str.split(" ")[0];
            double money = Double.parseDouble(str.split(" ")[1]);

            if (map.containsKey(name))
                map.put(name, map.get(name) + money);
            else map.put(name, money);
        }

        List list = new ArrayList(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Double>>() {
            @Override
            public int compare(Map.Entry<String, Double> o1, Map.Entry<String, Double> o2) {
                return (o2.getValue().compareTo(o1.getValue()));
            }
        });

        double maxMoney = Double.parseDouble(list.get(0).toString().split("=")[1]);
        for (Object loly : list) {
            double BossMoney = Double.parseDouble(loly.toString().split("=")[1]);
            String BossName = loly.toString().split("=")[0];
            if (BossMoney == maxMoney)
                System.out.println(BossName);
            else break;
        }


        reader.close();
    }
}