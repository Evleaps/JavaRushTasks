package com.javarush.task.task13ПотокиВводаБитваРоботовИсказкаПроРепкуПерегрузка.task13ПотокиВоодаИвывода.task1318ВывестиВКонсольСодержимоеФайла;

import java.io.*;

/* 
Чтение файла
1. Считать с консоли имя файла.
2. Вывести в консоль(на экран) содержимое файла.
C://My programs//Задачи Java//JavaRushTasks//2.JavaCore//src//com//javarush//task//task13ПотокиВводаБитваРоботовИсказкаПроРепкуПерегрузка//task1318ВывестиВКонсольСодержимоеФайла//newText.txt
3. Не забыть освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //add your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        InputStream in = new FileInputStream(br.readLine());

        while (in.available()>0) {
            System.out.print((char)in.read());
        }
        System.out.println();
        in.close();
        br.close();
}}

/* рабочий вариант ! Но задачу необходимо решить только с помощью FileInputStream
русский язык работает нормально!
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader inStream = new BufferedReader(new FileReader(reader.readLine()));
       // InputStream inStream = new FileInputStream(reader.readLine());
        String str;

        while ((str = inStream.readLine()) != null) {
            System.out.println(str);
        }

        inStream.close();
        reader.close();
    }*/

/* ЕЩЕ ОДИН ХОРОШИЙ РАБОЧИЙ ВАРИК!
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(new FileInputStream(reader.readLine()));
        while (scanner.hasNext()) {
            String data = scanner.nextLine();
            System.out.print(data);
        }


        reader.close();
        scanner.close();
}}*/

