package com.javarush.task.task18.task1824ОстановкаПрограммы;

/* 
Файлы и исключения
Читайте с консоли имена файлов.
Если файла не существует (передано неправильное имя файла), то перехватить исключение FileNotFoundException, вывести в консоль переданное неправильное имя файла и завершить работу программы.
Закрыть потоки.
Не используйте System.exit();


Требования:
1. Программа должна считывать имена файлов с консоли.
2. Для каждого файла нужно создавать поток для чтения.
3. Если файл не существует, программа должна перехватывать исключение FileNotFoundException.
4. После перехвата исключения, программа должна вывести имя файла в консоль и завершить работу.
5. Потоки для чтения из файла должны быть закрыты.
6. Команду "System.exit();" использовать нельзя.
*/

import java.io.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            File file1 = new File(reader.readLine());
            try {
                FileInputStream inStream = new FileInputStream(file1);
                inStream.close();
            } catch (FileNotFoundException e) {
                System.out.println(file1);
                break;
            }


            File file2 = new File(reader.readLine());
            try {
                FileInputStream inStream = new FileInputStream(file2);
                inStream.close();
            } catch (FileNotFoundException e) {
                System.out.println(file2);
                break;
            }

            File file3 = new File(reader.readLine());
            try {
                FileInputStream inStream = new FileInputStream(file3);
                inStream.close();
            } catch (FileNotFoundException e) {
                System.out.println(file3);
                break;
            }
        }
        reader.close();
    }
}
