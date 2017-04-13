package com.javarush.task.task18.task1809;

/*
Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке.
Закрыть потоки.


Требования:
1. Программа должна два раза считать имена файлов с консоли.
2. Для чтения из файла используй поток FileInputStream, для записи в файл - FileOutputStream
3. Во второй файл нужно записать все байты из первого в обратном порядке.
4. Потоки FileInputStream и FileOutputStream должны быть закрыты.
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String oneFile = reader.readLine();
        String twoFile = reader.readLine();

        FileInputStream in = new FileInputStream(oneFile);
        FileOutputStream out = new FileOutputStream(twoFile);

        ArrayList<Integer> list = new ArrayList<>(in.available());
        while (in.available() > 0) {
            list.add(in.read());
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            out.write(list.get(i));
        }

        in.close();
        out.close();
    }
}
/* через стек почему то не хочет работать
Stack<Integer> stack = new Stack<>();

        while (in.available() > 0) {
            int data = in.read();
            stack.push(data);
        }
        while (stack.isEmpty()){
            out.write(stack.pop());
        }*/
