package com.javarush.task.task13ПотокиВводаБитваРоботовИсказкаПроРепкуПерегрузка.task13РеализацияИнтерфейсовИнаследование.task1320toStringРеализацияИнтерфейса;

/* 
Neo
1. Реализовать интерфейс DBObject в классе User.
2. Реализовать метод initializeIdAndName так, чтобы программа работала и выводила на экран «User has name Neo, id = 1«.
3. Метод toString и метод main менять нельзя.
4. Подумай, что должен возвращать метод initializeIdAndName в классе User.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        System.out.println(Matrix.NEO);
    }

    //объект DBObject содержит новый ЮЗЕР с инициализацией
    static  class Matrix {
        public static DBObject NEO = new User().initializeIdAndName(1, "Neo");
    }

    //описывает параметры инициализации
    interface DBObject   {
        DBObject initializeIdAndName(long id, String name);
    }

    //МАГИЯ
    static class User implements DBObject {
        public User initializeIdAndName(long id, String name){
            this.name = name;
            this.id = id;
            return this;
        }
        long id;
        String name;

        @Override
        public String toString() {
            return String.format("User has name %s, id = %d", name, id);
        }
    }
}
