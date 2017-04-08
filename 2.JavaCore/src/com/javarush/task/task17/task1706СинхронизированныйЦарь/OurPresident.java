package com.javarush.task.task17.task1706СинхронизированныйЦарь;

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
