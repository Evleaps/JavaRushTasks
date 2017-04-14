package com.javarush.task.task18.task1808ЕслиБайтовНечетноеТоВ2ФайлБольше;

/* 
Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать большую часть.
Закрыть потоки.


Требования:
1. Программа должна три раза считать имена файлов с консоли.
2. Для чтения из файла используй поток FileInputStream, для записи в файлы - FileOutputStream
3. Первую половину байт из первого файла нужно записать во второй файл.
4. Вторую половину байт из первого файла нужно записать в третий файл.
5. Потоки FileInputStream и FileOutputStream должны быть закрыты.
*/

import java.io.*;

public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        String file3 = reader.readLine();

        FileInputStream inStreamFile1 = new FileInputStream(file1);
        FileOutputStream outStreamFile2 = new FileOutputStream(file2);
        FileOutputStream outStreamFile3 = new FileOutputStream(file3);

        //проверим, четное ли кол-во байтов в массиве
        byte[] buffer;
        if ((inStreamFile1.available() % 2) != 0) {                 //если не четное
            buffer = new byte[(inStreamFile1.available() + 1) / 2]; //буффер равен половина+1
        } else {
            buffer = new byte[inStreamFile1.available() / 2];
        }

        if (inStreamFile1.available() > 0) {         //если есть что записывать
            int count = inStreamFile1.read(buffer);  //читаем первую половину+1байт
            outStreamFile2.write(buffer);            //тут мы записали половину + 1 байт
            if (inStreamFile1.available() > 0) {
                count = inStreamFile1.read(buffer);  //тут мы читаем оставшуюся половину
                outStreamFile3.write(buffer, 0, count);//заносим остаток
            }
        }

        inStreamFile1.close();
        outStreamFile2.close();
        outStreamFile3.close();
        reader.close();
    }
}
