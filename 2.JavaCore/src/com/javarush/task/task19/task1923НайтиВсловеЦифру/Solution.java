package com.javarush.task.task19.task1923НайтиВсловеЦифру;

/* 
Слова с цифрами
В метод main первым параметром приходит имя файла1, вторым — файла2.
Файл1 содержит строки со слов, разделенные пробелом.
Записать через пробел в Файл2 все слова, которые содержат цифры, например, а1 или abc3d.
Закрыть потоки.


Требования:
1. Программа НЕ должна считывать данные с консоли.
2. Программа должна считывать содержимое первого файла (используй FileReader c конструктором String).
3. Поток чтения из файла (FileReader) должен быть закрыт.
4. Программа должна записывать во второй файл все слова из первого файла которые содержат цифры (используй FileWriter).
5. Поток записи в файл (FileWriter) должен быть закрыт.
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader inStream = new BufferedReader(new FileReader(args[0]));
        BufferedWriter outStream = new BufferedWriter(new FileWriter(args[1]));

        String str;
        while ((str = inStream.readLine()) != null) {
            String[] s = str.split(" ");
            for (String en : s) {
                Pattern pattern = Pattern.compile("\\d+");
                Matcher matcher = pattern.matcher(en);
                if (matcher.find())
                    outStream.write(en + " ");
            }
        }
        outStream.close();
        inStream.close();
    }
}
