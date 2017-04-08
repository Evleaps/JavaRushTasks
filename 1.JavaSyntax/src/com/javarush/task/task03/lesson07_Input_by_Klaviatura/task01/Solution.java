package com.javarush.task.task03.lesson07_Input_by_Klaviatura.task01;

/* Как захватить мир
Ввести с клавиатуры число и имя, вывести на экран строку:
«имя» захватит мир через «число» лет. Му-ха-ха!
Пример: Вася захватит мир через 8 лет. Му-ха-ха!

Последовательность вводимых данных имеет большое значение.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //А ТУТ ЧЕРЕЗ БУФРИДЕР
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sAge = reader.readLine();
        String name = reader.readLine();
        int nAge = Integer.parseInt(sAge);
        System.out.println(name + " захватит мир через " + nAge + " лет. Му-ха-ха!");


        /* НЕ ЧИТАЙ
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = scanner.nextInt();
        System.out.println(name + " захватит мир через " + age + " лет. Му-ха-ха!");
       /* ЭТО РАБОТАЮЩИЙ КОД МЕТОДА СКАННЕР!
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Имя");
        String name = scanner.nextLine();
        System.out.println("Введите кол-во лет, через которое захватитHе мир");
        int age = scanner.nextInt();
        System.out.println(name + " захватит мир через " + age + " лет. Му-ха-ха!");
        */





    }
}