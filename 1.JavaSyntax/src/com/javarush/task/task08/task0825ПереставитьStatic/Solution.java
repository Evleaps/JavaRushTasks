package com.javarush.task.task08.task0825ПереставитьStatic;

/* 
Модификатор запутался
*/

public class Solution {
    public static int A = 5; //статические переменные
    public static int B = 2;

    public int C = A * B;
    public static int D = B * A; // если int статический, то только статические переменные может перемножать

    public static void main(String[] args) {
    }

    public int getValue() {
        return D;
    }

    public int getValue2() {
        return C;
    }
}

