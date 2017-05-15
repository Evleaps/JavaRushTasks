package com.javarush.task.task18_Обертки_CrUD_Округление_ПодсчетСимволов.task1819ДобавитьСодержимоеВНачалоФайла;

/* 
Объединение файлов
Считать с консоли 2 имени файла.
В начало первого файла записать содержимое второго файла так, чтобы получилось объединение файлов.
Закрыть потоки.


Требования:
1. Программа должна два раза считать имена файлов с консоли.
2. Для первого файла создай поток для чтения и считай его содержимое.
3. Затем, для первого файла создай поток для записи. Для второго - для чтения.
4. Содержимое первого и второго файла нужно объединить в первом файле.
5. Сначала должно идти содержимое второго файла, затем содержимое первого.
6. Созданные для файлов потоки должны быть закрыты.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String file1 = reader.readLine();
        String file2 = reader.readLine();
        FileInputStream inputStream = new FileInputStream(file1);
        FileOutputStream outputStream = new FileOutputStream(file1);
        FileInputStream inputStream2 = new FileInputStream(file2);

        byte[] buffer = new byte[inputStream.available()];
//сохранил в count все что лежало в 1-м файле.
        int count = 0;
        while (inputStream.available() > 0) {
            count = inputStream.read(buffer);
        }
//запишем из 2го в первый, !при записывании  предыдушие файлы стираются
        while (inputStream2.available() > 0) {
            int data = inputStream2.read();
            outputStream.write(data);
        }
//добавили  содержимое 2го файла из буффера
        outputStream.write(buffer,0,count);

        outputStream.close();
        inputStream.close();
        inputStream2.close();
    }
}
