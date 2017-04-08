package com.javarush.task.task07.level07.lesson04ArrayОбычныйМассив.task02_Массив_изСтрочек;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Массив из строчек в обратном порядке
1. Создать массив на 10 строчек.
2. Ввести с клавиатуры 8 строчек и сохранить их в массив.
3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //1
        String[] text = new String[10];

        //2
        for (int i = 0; i < 8; i++)
        {
            text[i] = reader.readLine(); //заполняем массив
        }
        //3
        for (int i = text.length - 1; i > -1; i--) // длина массива-1, ибо 10 ячейки не существует(от 0 до 9)
        {
            System.out.println(text[i]);
        }
    }
}