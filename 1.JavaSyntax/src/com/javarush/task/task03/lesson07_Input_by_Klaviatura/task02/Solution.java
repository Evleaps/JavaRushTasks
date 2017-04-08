package com.javarush.task.task03.lesson07_Input_by_Klaviatura.task02;

/* Зарплата через 5 лет
Ввести с клавиатуры отдельно Имя, число1, число2. Вывести надпись:
«Имя» получает «число1» через «число2» лет.
Пример: Коля получает 3000 через 5 лет.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();
        String zp = reader.readLine();
        String old = reader.readLine();
        System.out.println(name + " получает " + zp + " через " + old + " лет.");

    }
}