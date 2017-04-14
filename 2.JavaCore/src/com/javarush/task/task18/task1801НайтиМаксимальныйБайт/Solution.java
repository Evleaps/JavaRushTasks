package com.javarush.task.task18.task1801НайтиМаксимальныйБайт;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
Ввести с консоли имя файла.
Найти максимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода.


Требования:
1. Программа должна считывать имя файла с консоли.
2. Для чтения из файла используй поток FileInputStream.
3. В консоль должен выводиться максимальный байт, считанный из файла.
4. Поток чтения из файла должен быть закрыт.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inStrem = new FileInputStream(reader.readLine());

        int maxByte = 0;
        while (inStrem.available() > 0) {
            int data = inStrem.read();
            if (data > maxByte) maxByte = data;
        }
        System.out.println(maxByte);


        reader.close();
        inStrem.close();
    }
}
