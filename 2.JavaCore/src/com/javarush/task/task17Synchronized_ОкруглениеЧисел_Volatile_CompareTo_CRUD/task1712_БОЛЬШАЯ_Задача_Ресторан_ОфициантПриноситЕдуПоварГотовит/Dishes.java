package com.javarush.task.task17Synchronized_ОкруглениеЧисел_Volatile_CompareTo_CRUD.task1712_БОЛЬШАЯ_Задача_Ресторан_ОфициантПриноситЕдуПоварГотовит;

public class Dishes {
    private byte tableNumber;

    public Dishes(byte tableNumber) {
        this.tableNumber = tableNumber;
    }

    public byte getTableNumber() {
        return tableNumber;
    }
}
