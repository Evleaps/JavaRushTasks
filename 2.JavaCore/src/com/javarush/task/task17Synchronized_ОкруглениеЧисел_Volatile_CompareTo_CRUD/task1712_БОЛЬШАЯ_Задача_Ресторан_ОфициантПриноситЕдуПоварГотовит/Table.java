package com.javarush.task.task17Synchronized_ОкруглениеЧисел_Volatile_CompareTo_CRUD.task1712_БОЛЬШАЯ_Задача_Ресторан_ОфициантПриноситЕдуПоварГотовит;

public class Table {
    private static byte tableNumber;
    private byte number = ++tableNumber;

    public Order getOrder () {
        return new Order(number);
    }
}
