package com.javarush.task.task15НаследованиеSingletonКонструкторы.task15ПакетСПреобразованиемТиповИЛегкимиКонструкторами.task1516;

/* 
Значения по-умолчанию
1. Создать 7 public полей класса. Убедитесь, что они инициализируются дефолтными значениями.
intVar типа int
doubleVar типа double
DoubleVar типа Double
booleanVar типа boolean
ObjectVar типа Object
ExceptionVar типа Exception
StringVar типа String
2. В методе main вывести их значения в заданном порядке.
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().intVar);
        System.out.println(new Solution().doubleVar);
        System.out.println(new Solution().DoubleVar);
        System.out.println(new Solution().booleanVar);
        System.out.println(new Solution().ObjectVar);
        System.out.println(new Solution().ExceptionVar);
        System.out.println(new Solution().StringVar);

    }

        int intVar;
        double doubleVar;
        Double DoubleVar;
        boolean booleanVar;
        Object ObjectVar;
        Exception ExceptionVar;
        String StringVar;

}
