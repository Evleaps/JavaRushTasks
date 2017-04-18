package com.javarush.task.task09_СтекТрейс_Исключения.task0920ОбратныйОтсчетСзадержкой;

/* 
Обратный отсчёт
Написать в цикле обратный отсчёт от 10 до 0. Для задержки использовать Thread.sleep(100);
Обернуть вызов sleep в try..catch.
*/

public class Solution {
    public static void main(String[] args) {
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);

            //без блока тру-кетч тут была бы ошибка, но так и правда с задержкой все работает:)
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException e){

            }
        }
    }
}
