package com.javarush.task.task18_Обертки_CrUD_Округление_ПодсчетСимволов.task1822_ПрогаСАргументомИщетВтаблицеЗначения;

/* 
Поиск данных внутри файла
Считать с консоли имя файла.
Найти в файле информацию, которая относится к заданному id, и вывести ее на экран в виде, в котором она записана в файле.
Программа запускается с одним параметром: id (int).
Закрыть потоки.

В файле данные разделены пробелом и хранятся в следующей последовательности:
id productName price quantity
где id — int.
productName — название товара, может содержать пробелы, String.
price — цена, double.
quantity — количество, int.

Информация по каждому товару хранится в отдельной строке.


Требования:
1. Программа должна считать имя файла с консоли.
2. Создай для файла поток для чтения.
3. Программа должна найти в файле и вывести информацию о id, который передается первым параметром.
4. Поток для чтения из файла должен быть закрыт.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader readerFile = new BufferedReader(new FileReader(reader.readLine()));

        /*
        * Программа запускается с одним параметром: id (int). - это означает, что программу запустили с консоли и
        * передали ей агрумент в args. в идее агрументы - Run-->Edit Configuration --> Program arguments (туда мы заносим наши агрументы)
        *
        * т.е. программа знает аргумент, потом прога проверяет, не начинается ли работа с заданного аргумента. Если да, то вывести строку
         * (буфридер читает построчно, не забываем)*/
        String str;
        while ((str = readerFile.readLine()) != null) {
            if (str.startsWith(args[0].toString()))
                System.out.println(str);
        }


        reader.close();
        readerFile.close();
    }
}

