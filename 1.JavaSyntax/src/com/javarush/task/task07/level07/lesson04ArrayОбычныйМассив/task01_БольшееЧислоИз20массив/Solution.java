package com.javarush.task.task07.level07.lesson04ArrayОбычныйМассив.task01_БольшееЧислоИз20массив;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Максимальное среди массива на 20 чисел
1. В методе initializeArray():
1.1. Создайте массив на 20 чисел
1.2. Считайте с консоли 20 чисел и заполните ими массив
2. Метод max(int[] array) должен находить максимальное число из элементов массива
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int[] array = initializeArray();//вход в метод инициализации массива
        int max = max(array);// максимальное число равно возвращаемому значению в методе max
        System.out.println(max);
    }
    public static int[] initializeArray() throws IOException {
        //Инициализируйте (создайте и заполните) массив тут
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];//20ячеек

        for (int i = 0; i < array.length; i++)
        {
            array[i]=Integer.parseInt(reader.readLine());//говорим пользовотелю вводить знач ячеек не более длины массива(не более 20)
        }
        return array;//возвращаем результат
    }

    public static int max(int[] array)//прописываем название массива в скобки
    {
        //Найдите максимальное значение в этом методе
        int max = array[0];//это точка начала отсчета
        for (int i = 0; i <array[i]; i++)//там была длина массива, а тут сами ячейки массива
        {
            if (array[i]>max)
                max = array[i]; //тут у нас обманка, магия

        }
        return max;//возвращаем
    }
}
