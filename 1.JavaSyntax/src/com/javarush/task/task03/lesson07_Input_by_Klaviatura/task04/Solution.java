package com.javarush.task.task03.lesson07_Input_by_Klaviatura.task04;

/* Спонсор - это звучит гордо
Ввести с клавиатуры два имени и вывести надпись:
name1 проспонсировал name2, и она стала известной певицей.
Пример:
Коля проспонсировал Лену, и она стала известной певицей.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sponsor = reader.readLine();
        String nasosala = reader.readLine();
        System.out.println(sponsor + " проспонсировал " + nasosala + ", и она стала известной певицей.");

    }
}