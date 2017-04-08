package com.javarush.task.task15НаследованиеSingletonКонструкторы.task1522ПаттернSingleton;


public class Moon implements Planet {
    private static Moon instance;

    public static Moon getInstance() {
        if (instance == null)
            instance = new Moon();
        return instance;
    }

    private Moon() {}
}
