package com.javarush.task.task15НаследованиеSingletonКонструкторы.task1522ПаттернSingleton;

public class Earth implements Planet{
    private static Earth instance;

    public static Earth getInstance() {
        if (instance == null)
            instance = new Earth();
        return instance;
    }

    private Earth() {}
}
