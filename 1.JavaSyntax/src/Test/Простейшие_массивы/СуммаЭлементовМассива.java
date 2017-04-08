package Test.Простейшие_массивы;

import java.io.IOException;

/**
 * Created by Ромчи on 01.02.2017.
 */
public class СуммаЭлементовМассива
{
    public static void main(String[] args) throws IOException
    {
        //это статическая инициализация
        int[] list = {5, 6, 7, 8, 1, 2, 5, -7, -9, 2, 0};

        //подсчёт суммы элементов
        int sum = 0;
        for (int i = 0; i < list.length; i++)
            sum = list[i] + sum;

        System.out.println("Sum is " + sum);
    }
}
