package com.javarush.task.task17Synchronized_ОкруглениеЧисел_Volatile_CompareTo_CRUD.task1706СинхронизированныйЦарь;

public class OurPresident {
    private static OurPresident president;

    static  {
        synchronized (Solution.class){
          president = new OurPresident();
        }
    }

    private OurPresident() {
    }

    public static OurPresident getOurPresident() {
        return president;
    }
}
