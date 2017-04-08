package com.javarush.task.task14ПереопредМетодовИзИнерфейсов.task1420НайтиНаибольшийОбщийДЕлительЧисел;

public class GCD {
    public static  int calc(int a , int b){
        while (b != 0){
            int tmp = a%b;
            a=b;
            b = tmp;
        }
        return a;
    }


}
