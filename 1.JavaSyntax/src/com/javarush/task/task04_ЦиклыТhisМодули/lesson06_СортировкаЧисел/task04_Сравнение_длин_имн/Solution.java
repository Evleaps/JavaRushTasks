package com.javarush.task.task04_ЦиклыТhisМодули.lesson06_СортировкаЧисел.task04_Сравнение_длин_имн;

/* Сравнить имена
Ввести с клавиатуры два имени, и если имена одинаковые вывести сообщение «Имена идентичны». Если имена разные, но их длины равны – вывести сообщение – «Длины имен равны».
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        if(name1.equals(name2)) System.out.println("Имена идентичны");
        else if (name1.length()==name2.length()) System.out.println("Длины имен равны");

    }
}
