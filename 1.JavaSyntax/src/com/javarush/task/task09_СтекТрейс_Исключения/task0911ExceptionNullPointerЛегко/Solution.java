package com.javarush.task.task09_СтекТрейс_Исключения.task0911ExceptionNullPointerЛегко;

import java.util.HashMap;

/* 
Исключение при работе с коллекциями Map
Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
HashMap<String, String> map = new HashMap<String, String>(null);
map.put(null, null);
map.remove(null);
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        try {

            HashMap<String, String> map = new HashMap<String, String>(null);
            map.put(null, null);
            map.remove(null);
        }
        catch (NullPointerException e){
            System.out.println(e);
        }

        //напишите тут ваш код
    }
}
