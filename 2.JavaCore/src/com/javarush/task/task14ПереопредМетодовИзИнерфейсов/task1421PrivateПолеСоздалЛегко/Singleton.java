package com.javarush.task.task14ПереопредМетодовИзИнерфейсов.task1421PrivateПолеСоздалЛегко;

abstract class Singleton {
    private static Singleton instance;

    private  Singleton(Singleton instance) {
        this.instance = instance;
    }

      public static Singleton getInstance(){
        return instance;
    }
}
