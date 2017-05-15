package com.javarush.task.task18_Обертки_CrUD_Округление_ПодсчетСимволов.task1816ПроверяемНаличаеАнглБукв;

/* 
Английские буквы
В метод main первым параметром приходит имя файла.
Посчитать количество букв английского алфавита, которое есть в этом файле.
Вывести на экран число (количество букв).
Закрыть потоки.

Требования:
1. Считывать с консоли ничего не нужно.
2. Создай поток чтения из файла, который приходит первым параметром в main.
3. В файле необходимо посчитать буквы английского алфавита и вывести это число в консоль.
4. Нужно учитывать заглавные и строчные буквы.
5. Поток чтения из файла должен быть закрыт.
*/

import java.io.FileInputStream;
import java.io.IOException;


public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inStream = new FileInputStream(String.valueOf(args[0]));
        int count = 0;

        while (inStream.available() > 0) {
            int data = inStream.read();
            if ((data>='a'&data<='z')||(data>='A'&data<='Z')) count++;
        }
        System.out.println(count);
        inStream.close();
    }
}
