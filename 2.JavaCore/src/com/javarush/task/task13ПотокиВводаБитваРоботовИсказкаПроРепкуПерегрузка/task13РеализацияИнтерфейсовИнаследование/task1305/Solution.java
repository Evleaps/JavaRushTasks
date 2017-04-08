package com.javarush.task.task13ПотокиВводаБитваРоботовИсказкаПроРепкуПерегрузка.task13РеализацияИнтерфейсовИнаследование.task1305;

/* 
4 ошибки
Исправь 4 ошибки в программе, чтобы она компилировалась.
*/

public class Solution {

    public static void main(String[] args) throws Exception {

        //System.out.println(new Dream().HOBBIE.toString());
        System.out.println(new Hobbie().toString());
    }

    interface Desire {}

    interface Dream {
       public static  Hobbie HOBBIE = new Hobbie();
    }

    public static class Hobbie  implements Desire , Dream {
         public static int INDEX = 1;

        @Override
        public String toString() {
            INDEX++;
            return "" + INDEX;
        }
    }

}
