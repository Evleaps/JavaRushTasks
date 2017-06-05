package com.javarush.task.task15НаследованиеSingletonКонструкторы.task1531НахождениеФакториалаBigInteger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/* 
Факториал
Написать метод, который вычисляет факториал — произведение всех чисел от 1 до введенного числа включая его.

Пример: 4! = factorial(4) = 1*2*3*4 = 24
1. Ввести с консоли число меньше либо равно 150.
2. Реализовать функцию factorial.
3. Если введенное число меньше 0, то вывести 0.
0! = 1

Требования:
1. Программа должна считывать данные с клавиатуры.
2. Программа должна выводить на экран факториал введенного числа.
3. Метод factorial должен возвращать строковое представление факториала числа переданного ему в качестве параметра.
4. Метод factorial должен принимать один параметр типа int.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //ввели значение и закрыли поток чтения с клавы
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        long input = Integer.parseInt(reader.readLine());
        reader.close();

        System.out.println(factorialRecursion(BigInteger.valueOf(input)));
        System.out.println(factorialNotRecursion(input));
        System.out.println(factorialRecursion(BigInteger.valueOf(input)).equals(factorialNotRecursion(input)));
    }
//тут рекурсивное решение, BigInteger нужен потому, что int слишком быстро переполняется
    public static BigInteger factorialRecursion(BigInteger n) {
        if (n == BigInteger.ZERO) return BigInteger.ONE;
        return n.multiply(factorialRecursion(n.subtract(BigInteger.ONE)));
    }

    public static BigInteger factorialNotRecursion(long n) {
        BigInteger reg = BigInteger.ONE;
        if (n == 0) return reg;
        for (int i = 1; i <= n; i++) reg = reg.multiply(BigInteger.valueOf(i));
        return reg;
    }
}
