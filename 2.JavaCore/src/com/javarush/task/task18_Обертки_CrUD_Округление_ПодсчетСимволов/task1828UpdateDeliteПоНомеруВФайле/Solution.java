package com.javarush.task.task18_Обертки_CrUD_Округление_ПодсчетСимволов.task1828UpdateDeliteПоНомеруВФайле;

/* 
Прайсы 2
CrUD для таблицы внутри файла
Считать с консоли имя файла для операций CrUD

Программа запускается с одним из следующих наборов параметров:
-u id productName price quantity
-d id

Значения параметров:
где id — 8 символов
productName — название товара, 30 chars (60 bytes)
price — цена, 8 символов
quantity — количество, 4 символа
-u — обновляет данные товара с заданным id
-d — производит физическое удаление товара с заданным id (все данные, которые относятся к переданному id)

В файле данные хранятся в следующей последовательности (без разделяющих пробелов):
id productName price quantity
Данные дополнены пробелами до их длины

Пример:
19846   Шорты пляжные синие           159.00  12
198478  Шорты пляжные черные с рисунко173.00  17
19847983Куртка для сноубордистов, разм10173.991234


Требования:
1. Программа должна считать имя файла для операций CrUD с консоли.
2. При запуске программы без параметров список товаров должен остаться неизменным.
3. При запуске программы с параметрами "-u id productName price quantity" должна обновится информация о товаре в файле.
4. При запуске программы с параметрами "-d id" строка товара с заданным id должна быть удалена из файла.
5. Созданные для файлов потоки должны быть закрыты.
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        UpdateDelite(args,reader.readLine());
        reader.close();
    }
/*Программа дополняет пробелами при необходимости слова, но так-же если больше укорачивает до заданного кол-ва символов.
* Однако, результат будет неверным относительно цены и количества, в рабочей программе это нужно будет обязательно учесть! */
    private static String Substr(String position, int posLenght) {
        if (position.length() > posLenght) position = position.substring(0,posLenght);
        return position;
    }

    public static void UpdateDelite(String[] args,String fileName) throws IOException {
        BufferedReader inStreram = new BufferedReader(new FileReader(fileName));
        List<String> lines = new ArrayList<>();
        String line;

        while ((line = inStreram.readLine())!= null) {
            if (line.substring(0,8).trim().equals(args[1])) {
                if ("-u".equals(args[0])) {
                    lines.add(String.format("%-8s%-30s%-8s%-4s", Substr(args[1],8),Substr(args[2],30),Substr(args[3],8),Substr(args[4],4)));
                }
            }else
                lines.add(line);
        }

        FileOutputStream outStream = new FileOutputStream(fileName);
        for (String s : lines) {
            outStream.write((String.format("%s%n", s)).getBytes());
        }
        outStream.close();
        inStreram.close();
    }
}



/*   Первый работающий код, но длинный и сложный.

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        BufferedReader inStream = new BufferedReader(new FileReader(fileName));

        switch (args[0]) {
            case "-u": AddProduct(args, inStream, fileName); break;
            case "-d": Delite(args, inStream, fileName); break;
        }
        inStream.close();
    }

    public static String AddSpase(String position, int lenghtPosition) {
       int count = lenghtPosition - position.length();
       if (count < 0) position = position.substring(0,lenghtPosition);
       else if (count > 0) {
           for (int i = 0; i < count; i++) {
               position += " ";
           }
       }
        return position;
    }

    public static void AddProduct(String[] args, BufferedReader inStream, String fileName) throws IOException {
        File copy = File.createTempFile("copy.txt", null);
        BufferedWriter writerCopy = new BufferedWriter(new FileWriter(copy));

        String id = args[1];
        String productName = args[2];
        String price = args[3];
        String quality = args[4];

        String str;
        while ((str = inStream.readLine()) != null) {
            String lineId = str.split("\\D")[0];
            if (id.equals(lineId)) {
                writerCopy.write(AddSpase(id,8) + AddSpase(productName,30) + AddSpase(price,8) + AddSpase(quality,4) + "\n");
            }else writerCopy.write(str + "\n");
        }

        writerCopy.close();

        BufferedReader readerCopy = new BufferedReader(new FileReader(copy));
        BufferedWriter outStream = new BufferedWriter(new FileWriter(fileName));
        while (readerCopy.ready()) {
            outStream.write(readerCopy.readLine() + "\n");
        }

        outStream.close();
        readerCopy.close();
        copy.delete();
    }

    public static void Delite(String[] args, BufferedReader inStream, String fileName ) throws IOException {
        File copy = File.createTempFile("copy.txt", null);
        BufferedWriter writerCopy = new BufferedWriter(new FileWriter(copy));
        String id = args[1].substring(0,8);

        String str;
        while ((str = inStream.readLine()) != null) {
            String lineId = str.split("\\D")[0];
            if (id.equals(lineId)) {}
            else writerCopy.write(str + "\n");
        }

        writerCopy.close();

        BufferedReader readerCopy = new BufferedReader(new FileReader(copy));
        BufferedWriter outStream = new BufferedWriter(new FileWriter(fileName));
        while (readerCopy.ready()) {
             outStream.write(readerCopy.readLine() + "\n");
        }

        outStream.close();
        readerCopy.close();
        copy.delete();
    }*/