package com.javarush.task.task18.task1825СортировкаФайловПоНазванию;

/* 
Собираем файл
Собираем файл из кусочков.
Считывать с консоли имена файлов.
Каждый файл имеет имя: [someName].partN.

Например, Lion.avi.part9, Lion.avi.part235, …, Lion.avi.part37.

Имена файлов подаются в произвольном порядке. Ввод заканчивается словом «end«.
В папке, где находятся все прочтенные файлы, создать файл без суффикса [.partN].

Например, Lion.avi.

В него переписать все байты из файлов-частей используя буфер.
Файлы переписывать в строгой последовательности, сначала первую часть, потом вторую, …, в конце — последнюю.
Закрыть потоки.


Требования:
1. Программа должна считывать имена файлов с консоли, пока не будет введено слово "end".
2. Создай поток для записи в файл без суффикса [.partN] в папке, где находятся все считанные файлы.
3. В новый файл перепиши все байты из файлов-частей *.partN.
4. Чтение и запись должны происходить с использованием буфера.
5. Созданные для файлов потоки должны быть закрыты.
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        FileOutputStream outStream;

        while (true) {
            String name = reader.readLine();
            if (!name.equals("end"))
            list.add((name));
            else break;
        }
/*Названия одинаковые, соответственно сортировка листа работает корректно от part1 до partN */
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int a = Integer.parseInt(o1.split("part")[1]+"");
                int b = Integer.parseInt(o2.split("part")[1]+"");
                return a - b;
            }
        });

        //файл создается в папке с предыдущими файлами
        String resultFile = list.get(0).split(".part")[0] + "";
        File destFile = new File(resultFile);
        destFile.createNewFile();
        outStream = new FileOutputStream(destFile);
//записывает все буфером
        for (String search : list) {
            FileInputStream inStream = new FileInputStream(search);
            byte[] buffer = new byte[inStream.available()];
            while (inStream.available() > 0) {
                int count = inStream.read(buffer);
                outStream.write(buffer,0,count);
            }
            inStream.close();
        }
        outStream.close();
        reader.close();
    }
}
