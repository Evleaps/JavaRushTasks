package com.javarush.task.task07Массивы.level07.lesson04ArrayОбычныйМассив.task04_ВВодСклавыВмассив;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        //1
        int[] number = new int[10];
        //2
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < number.length; i++)
        {
            number[i] = Integer.parseInt(reader.readLine());
        }
        //3
        for (int i = number.length-1; i > -1; i--)
        {
            System.out.println(number[i]);
        }

    }
}
