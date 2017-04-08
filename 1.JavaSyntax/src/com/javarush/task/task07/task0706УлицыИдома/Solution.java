package com.javarush.task.task07.task0706УлицыИдома;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] number = new int[15];
        int traffic1 = 0;
        int traffic2 = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 15; i++) {
            number[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i <15; i++) {
            if (i%2==0 || i==0)
                traffic1 = traffic1 + number[i];
            else
                traffic2 = traffic2 + number[i];
        }
        if (traffic1<traffic2) System.out.println("В домах с нечетными номерами проживает больше жителей.");
        else System.out.println("В домах с четными номерами проживает больше жителей.");

    }
}
