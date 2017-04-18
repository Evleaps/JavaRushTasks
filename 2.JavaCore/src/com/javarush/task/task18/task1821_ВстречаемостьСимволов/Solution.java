package com.javarush.task.task18.task1821_ВстречаемостьСимволов;

/* 
Встречаемость символов
Программа запускается с одним параметром — именем файла, который содержит английский текст.
Посчитать частоту встречания каждого символа.
Отсортировать результат по возрастанию кода ASCII (почитать в инете).

Пример:
‘,’=44, ‘s’=115, ‘t’=116.

Вывести на консоль отсортированный результат:
[символ1] частота1
[символ2] частота2
Закрыть потоки.

Пример вывода:
, 19
- 7
f 361


Требования:
1. Считывать с консоли ничего не нужно.
2. Создай поток для чтения из файла, который приходит первым параметром в main.
3. В файле необходимо посчитать частоту встречания каждого символа и вывести результат.
4. Выведенный в консоль результат должен быть отсортирован по возрастанию кода ASCII.
5. Поток для чтения из файла должен быть закрыт.
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
//        FileInputStream inputStream = new FileInputStream("C:/My programs/Coding/JavaRushTasks/2.JavaCore/src/com/javarush/task/task18/task1821_ВстречаемостьСимволов/1.txt");

        FileInputStream inputStream = new FileInputStream(args[0]);
        //нужен именно long потому что, значение может переполниться в случае если символов очень много
        long[] bytes = new long[256];


        while (inputStream.available() > 0) {
            int data = inputStream.read();
            bytes[data]++;
        }
        for (int i = 0; i < bytes.length; i++) {
            if (bytes[i] != 0)
                System.out.println((char) i + " " + bytes[i]);
        }
        inputStream.close();
    }
}


/* Отличный вариант, treemap сразу делает сортироку ASCII

 //FileInputStream inputStream = new FileInputStream("C:/My programs/Coding/JavaRushTasks/2.JavaCore/src/com/javarush/task/task18/task1821_ВстречаемостьСимволов/1.txt");
        FileInputStream inputStream = new FileInputStream(args[0]);

        TreeMap<Character, Integer> map = new TreeMap<>();

        while (inputStream.available() > 0) {
            Character data = (char)inputStream.read();
            if (map.containsKey(data))
                map.put(data, map.get(data) + 1);
            else map.put(data, 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        inputStream.close();
    }*/
