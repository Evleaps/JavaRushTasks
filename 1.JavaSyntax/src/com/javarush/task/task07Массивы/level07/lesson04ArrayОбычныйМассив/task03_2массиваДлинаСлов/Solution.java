package com.javarush.task.task07Массивы.level07.lesson04ArrayОбычныйМассив.task03_2массиваДлинаСлов;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 2 массива
1. Создать массив на 10 строк.
2. Создать массив на 10 чисел.
3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
4. В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки которой совпадает с текущим индексом из массива чисел. Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код

        //1
        String[] text = new String[10];

        //2
        int[] number = new int[10];
        //3
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < text.length; i++)
        {
            text[i]=reader.readLine(); //заполнил массив строками
        }
        //4
        for (int i = 0; i < text.length; i++)
        {
            number[i] = text[i].length(); // ячейка чисел равна длине ячейки текста
        }

        for (int i = 0; i < number.length; i++)
        {
            System.out.println(number[i]); // вывод
        }

    }
}
