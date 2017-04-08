package Test.Простейшие_массивы;

import java.io.IOException;

/**
 * Created by Ромчи on 01.02.2017.
 */

public class Вывод_от1_до_9
{
    public static void main(String[] args) throws IOException
    {
        int[] list = new int[10];

        //заполнение массива
        for (int i = 0; i < list.length; i++)
            list[i] = i;

        //вывод на экран
        for (int i = 0; i < list.length; i++)
            System.out.println(list[i]);
    }
}