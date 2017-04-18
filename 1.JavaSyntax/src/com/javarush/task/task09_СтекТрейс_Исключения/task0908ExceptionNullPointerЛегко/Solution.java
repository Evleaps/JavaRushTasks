package com.javarush.task.task09_СтекТрейс_Исключения.task0908ExceptionNullPointerЛегко;

/* 
Исключение при работе со строками
Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
String s = null;
String m = s.toLowerCase();
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        try {
            String s = null;
            String m = s.toLowerCase();
        }
        catch (NullPointerException a){
            System.out.println(a);
        }

        //напишите тут ваш код
    }
}
