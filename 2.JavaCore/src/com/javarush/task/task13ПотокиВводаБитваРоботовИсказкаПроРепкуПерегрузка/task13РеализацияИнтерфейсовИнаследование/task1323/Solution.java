package com.javarush.task.task13ПотокиВводаБитваРоботовИсказкаПроРепкуПерегрузка.task13РеализацияИнтерфейсовИнаследование.task1323;

/* 
Интерфейс Updatable в классе Screen
Интерфейс Updatable в классе Screen
Реализовать интерфейс Updatable в классе Screen.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    interface Selectable {
        void onSelect();
    }

    interface Updatable extends Selectable {
        void refresh();
    }

    abstract class Screen implements Updatable {

    }
}
