package com.javarush.task.task04_ЦиклыТhisМодули.lesson16_ТутЕстьFor.home03_FORcчитаем_сумму_чисел;

import java.io.*;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

public class Solution
{
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


         int summa = 0;//показали  начальную точку
        for (;true;) {
            int a = Integer.parseInt(reader.readLine());
            summa = summa + a; // если ввели -1 он тут все рано учтен, но просто break
            if (a==-1) {
                break;
            }

        }
        System.out.println(summa);//вывод за циклом, там расчеты, тут ответ


    }
}
