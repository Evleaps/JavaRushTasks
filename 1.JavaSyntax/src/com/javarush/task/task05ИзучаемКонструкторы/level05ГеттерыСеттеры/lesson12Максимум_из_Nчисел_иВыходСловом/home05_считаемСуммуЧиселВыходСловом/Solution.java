package com.javarush.task.task05ИзучаемКонструкторы.level05ГеттерыСеттеры.lesson12Максимум_из_Nчисел_иВыходСловом.home05_считаемСуммуЧиселВыходСловом;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

         int sum = 0;
         for (;true;){
             String b = reader.readLine();
             if (b.equals("сумма"))
                 break;
             int a = Integer.parseInt(b);
             sum = sum+a;
         }
        System.out.println(sum);
    }
}
