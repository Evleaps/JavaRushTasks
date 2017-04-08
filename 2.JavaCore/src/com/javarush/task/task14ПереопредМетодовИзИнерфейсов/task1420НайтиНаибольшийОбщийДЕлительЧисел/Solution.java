package com.javarush.task.task14ПереопредМетодовИзИнерфейсов.task1420НайтиНаибольшийОбщийДЕлительЧисел;

/* 
НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args)throws Exception  {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int e = 0;
        int f = 0;

            e = Integer.parseInt(reader.readLine());
            f = Integer.parseInt(reader.readLine());
            if (e <= 0) throw new Exception();
            if (f <= 0) throw new Exception();


        System.out.println(GCD.calc(e,f));
    }
     //что-бы найти НОД от числа, по алгоритму Евклида восполдьзуемся рекурентной формулой
        //необходимо поделить большее число на меньшее, вычесть из него остаток. После чего поделить это число на еще раз. Это и будет ответ!
}

