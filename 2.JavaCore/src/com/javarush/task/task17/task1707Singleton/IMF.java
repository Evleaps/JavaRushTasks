package com.javarush.task.task17.task1707Singleton;


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
