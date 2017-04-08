package com.javarush.task.task13ПотокиВводаБитваРоботовИсказкаПроРепкуПерегрузка.task13ПотокиВоодаИвывода.task0929ФайлНеСуществуетЦиклТруКетч;

import java.io.*;

/* 
Обогатим код функциональностью!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sourceFileName;
        //цикл выполняется пока не будет вылетать ошибок
        while (true) {
            try
            {
                sourceFileName = reader.readLine();
                InputStream fileInputStream = getInputStream(sourceFileName);
                break;//если ошибки нет, то мы до этого пункта дойдем, иначе кетч и заного цикл
            }
            catch (FileNotFoundException e)
            {
                System.out.println("Файл не существует.");
            }
        }
        String destinationFileName = reader.readLine();

        InputStream fileInputStream = getInputStream(sourceFileName);
        OutputStream fileOutputStream = getOutputStream(destinationFileName);


        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            fileOutputStream.write(data);
        }

        fileInputStream.close();
        fileOutputStream.close();
    }

    public static InputStream getInputStream(String fileName) throws IOException {
        return new FileInputStream(fileName);
    }

    public static OutputStream getOutputStream(String fileName) throws IOException {
        return new FileOutputStream(fileName);
    }
}

