package com.javarush.task.task18.task1817ОкруглениеПослеЗанятой;

/* 
Пробелы
В метод main первым параметром приходит имя файла.
Вывести на экран соотношение количества пробелов к количеству всех символов. Например, 10.45.
1. Посчитать количество всех символов.
2. Посчитать количество пробелов.
3. Вывести на экран п2/п1*100, округлив до 2 знаков после запятой.
4. Закрыть потоки.


Требования:
1. Считывать с консоли ничего не нужно.
2. Создай поток чтения из файла, который приходит первым параметром в main.
3. Посчитай отношение пробелов ко всем символам в файле и выведи в консоль это число.
4. Выведенное значение необходимо округлить до 2 знаков после запятой.
5. Поток чтения из файла должен быть закрыт.
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Locale;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inStream = new FileInputStream(args[0]);

        double countSpase = 0;
        double countAllSymbol = 0;

        while (inStream.available() > 0) {
            int data = inStream.read();
            countAllSymbol++;
            if (data == ' ')countSpase++;
        }
        double ratio = countSpase/countAllSymbol*100;
        //округляем до 2х знаков после запятой
        System.out.println(String.format(Locale.ENGLISH,"%.2f",ratio));
        inStream.close();
    }

}
