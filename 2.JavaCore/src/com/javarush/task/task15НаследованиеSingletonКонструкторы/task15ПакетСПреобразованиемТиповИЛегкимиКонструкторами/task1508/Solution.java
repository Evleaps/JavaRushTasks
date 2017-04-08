package com.javarush.task.task15НаследованиеSingletonКонструкторы.task15ПакетСПреобразованиемТиповИЛегкимиКонструкторами.task1508;

/* 
ООП - Перегрузка - убираем лишнее
1. Подумайте, какая из реализаций метода print будет вызвана.
2. Удалите все лишние реализации метода print.
*/

public class Solution {
    public static void main(String[] args) {
        print(1);
    }




    public static void print(long l) {
        System.out.println("Я буду Java прогером!");
    }




}
