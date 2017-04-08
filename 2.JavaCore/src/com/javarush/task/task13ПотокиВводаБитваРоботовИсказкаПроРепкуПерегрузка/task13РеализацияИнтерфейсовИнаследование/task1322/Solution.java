package com.javarush.task.task13ПотокиВводаБитваРоботовИсказкаПроРепкуПерегрузка.task13РеализацияИнтерфейсовИнаследование.task1322;

/* 
Интерфейс SimpleObject
1. Создай класс StringObject.
2. В классе StringObject реализуй интерфейс SimpleObject с параметром типа String.
3. Программа должна компилироваться.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        SimpleObject<String> stringObject = new StringObject<Object>();
    }

     static class StringObject<Object> implements SimpleObject<String>{
        public SimpleObject<String> getInstance(){
            return this;
        }
     }


    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }

}
