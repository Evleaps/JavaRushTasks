package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Самые частые байты
Ввести с консоли имя файла.
Найти байт или байты с максимальным количеством повторов.
Вывести их на экран через пробел.
Закрыть поток ввода-вывода.

Требования:
1. Программа должна считывать имя файла с консоли.
2. Для чтения из файла используй поток FileInputStream.
3. В консоль через пробел должны выводиться все байты из файла с максимальным количеством повторов.
4. Данные в консоль должны выводится в одну строку.
5. Поток чтения из файла должен быть закрыт.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inStream = new FileInputStream(reader.readLine());
        //создадим мапу для отслеживания
        HashMap<Integer, Integer> map = new HashMap<>();

       while (inStream.available() > 0) {
           //если мапа уже содержит такой байт, то добавить ( data, счетчик +1 )
           int data = inStream.read();
           if (map.containsKey(data)) {
              // System.out.println("до - " + map.get(data));
               map.put(data, map.get(data) + 1);
             //  System.out.println("пос - " +map.get(data));
           }
           else map.put(data, 1);
       }

       //найдем максимальный байт,т.е. значение
       int max = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) max = entry.getValue();
        }
        //если значение равно максимуму, вывести
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue().equals(max)) System.out.print(entry.getKey() + " " );
        }

        reader.close();
        inStream.close();
    }
}
