package com.javarush.task.task07.level07.lesson04ArrayОбычныйМассив.task05_ПоловинаМассиваТудаПоловинаСюда;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {

        /*ЕЩЕ ОДИН НОРМ КОД НО НЕ ПРИНИМАЕТ НА СЕРВЕРЕ
        //создание и заполнение массива
        int[] number = new int[20];
        for (int i = 0; i < number.length; i++)
        {
            //заполнение массива
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            number[i] = Integer.parseInt(reader.readLine());
        }
                //копируем значения из массива
        //1. copyOF(откуда копируем, до какого значения копируем)
        //2. copyOFRange(откуда копируем, от , до)
            int[] number2 = Arrays.copyOf(number,10);
            int[] number3 = Arrays.copyOfRange(number,10,20);


        for (int i = 0; i < number3.length; i++)
        {
            System.out.println(number3[i]);
        }*/

       /* //МОЙ КОД РАБОЧИЙ

        //напишите тут ваш код
        //1
        int[] number = new int[20];
        //2
        for (int i = 0; i < number.length; i++)
        {
             BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            number[i] = Integer.parseInt(reader.readLine());
        }
        //3
        int[] number2 = new int[10];
        int[] number3 = new int[10];
        //4
        for (int i = 0; i < number3.length; i++)
        {
            number2[i]= number[i];
            number3[i]=number[i+10];
            //5
            System.out.println(number3[i+10]);
        }*/
 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] list = new int[20];
        int[] mal1 = new int[10];
        int[] mal2 = new int[10];


        for(int i = 0; i < list.length; i++)
        {
            list[i] = Integer.parseInt(reader.readLine());

            if(i < 10)
            {
                mal1[i] = list[i];
            }
            else
            {
                mal2[i - 10] = list[i];
                System.out.println(mal2[i - 10]);
            }
        }
    }
}
