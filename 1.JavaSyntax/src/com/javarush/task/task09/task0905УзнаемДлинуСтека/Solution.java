package com.javarush.task.task09.task0905УзнаемДлинуСтека;

/* 
Там, в синих глубинах стек-трейса…
Написать метод, который возвращает результат – глубину его стек-трейса – количество методов в нем (количество элементов в списке).
Это же число метод должен выводить на экран.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int deep = getStackTraceDeep();
    }

    public static int getStackTraceDeep() {
        //напишите тут ваш код
        StackTraceElement[] element = Thread.currentThread().getStackTrace();
        System.out.println(element.length);
        return element.length;

    }
}

