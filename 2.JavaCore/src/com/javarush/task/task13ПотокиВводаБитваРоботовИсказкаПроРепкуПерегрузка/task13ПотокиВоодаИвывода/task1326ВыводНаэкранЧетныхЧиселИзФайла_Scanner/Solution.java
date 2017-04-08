package com.javarush.task.task13ПотокиВводаБитваРоботовИсказкаПроРепкуПерегрузка.task13ПотокиВоодаИвывода.task1326ВыводНаэкранЧетныхЧиселИзФайла_Scanner;

/* 
Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.

Пример ввода:
5
8
11
3
2
10

Пример вывода:
2
8
10
*/

import java.io.*;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //объект сканнер вызывает поток взятия файла ну и вот.
        Scanner scanner = new Scanner(new FileInputStream(reader.readLine()));
        AbstractList<Integer> list = new ArrayList<>();

        //итератор не явный, некстлайн  == строке.
        while (scanner.hasNext()) {
            String word = scanner.nextLine();
            if (Integer.parseInt(word)%2 == 0)
                list.add(Integer.parseInt(word));
        }
        Collections.sort(list);
        for (int a : list) {
            System.out.println(a);
        }
        reader.close();
        scanner.close();
    }

}
/*   РАБОЧИЙ КОД ЧЕРЕЗ BufferedReadder ЧИТАЮЩИЙ ПОСТРОЧНО! СЕРВЕР ХОЧЕТ InputStream
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader inStream = new BufferedReader(new FileReader(reader.readLine()));
        AbstractList<Integer> list = new ArrayList<>();
        String str;

        while ((str = inStream.readLine()) != null) {
            if (Integer.parseInt(str)%2 == 0)
            list.add(Integer.parseInt(str));
        }
        Collections.sort(list);
        for (int a : list) {
            System.out.println(a);
        }
        reader.close();
        inStream.close();
    }*/
