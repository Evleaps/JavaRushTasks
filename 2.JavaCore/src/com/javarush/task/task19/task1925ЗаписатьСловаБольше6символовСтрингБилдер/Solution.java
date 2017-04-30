package com.javarush.task.task19.task1925ЗаписатьСловаБольше6символовСтрингБилдер;
/* Длинные слова
В метод main первым параметром приходит имя файла1, вторым — файла2.
Файл1 содержит слова, разделенные пробелом.
Записать через запятую в Файл2 слова, длина которых строго больше 6.
В конце файла2 запятой не должно быть.
Закрыть потоки.

Пример выходных данных в файл2:
длинное,короткое,аббревиатура

Требования:
1. Программа НЕ должна считывать данные с консоли.
2. Программа должна считывать содержимое первого файла (используй FileReader c конструктором String).
3. Поток чтения из файла (FileReader) должен быть закрыт.
4. Программа должна записывать через запятую во второй файл все слова из первого файла длина которых строго больше 6(используй FileWriter).
5. Поток записи в файл (FileWriter) должен быть закрыт.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader inStream = new BufferedReader(new FileReader(args[0]));
        BufferedWriter outStream = new BufferedWriter(new FileWriter(args[1]));
        StringBuilder stringBuilder = new StringBuilder();

        /*Сначала загоним все в экономичный СтрингБилдер, так мы избежим склеивания строк при отсутствии пробела*/

        while (inStream.ready()) {
            String str = inStream.readLine();
            String[] s = str.split(" ");
            for (String sss : s) {
                if (sss.length()>6)
                    stringBuilder.append(sss + ",");
            }
        }
        stringBuilder.deleteCharAt(stringBuilder.length()-1);
        outStream.write(stringBuilder.toString());

        outStream.close();
        inStream.close();
    }
}