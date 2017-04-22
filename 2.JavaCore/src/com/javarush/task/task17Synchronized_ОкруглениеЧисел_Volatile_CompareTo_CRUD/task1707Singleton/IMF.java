package com.javarush.task.task17Synchronized_ОкруглениеЧисел_Volatile_CompareTo_CRUD.task1707Singleton;


public class IMF {

    private static IMF imf;

    public static IMF getFund() {
        //add your code here - добавь код тут
        synchronized (new IMF()) {
            if (imf == null)
            imf = new IMF();
        }
        return imf;
    }

    private IMF() {
    }
}
