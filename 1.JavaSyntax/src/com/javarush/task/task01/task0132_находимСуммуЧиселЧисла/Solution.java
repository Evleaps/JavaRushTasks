package com.javarush.task.task01.task0132_находимСуммуЧиселЧисла;

/* 
Сумма цифр трехзначного числа
Реализуй метод sumDigitsInNumber(int number).
Метод на вход принимает целое трехзначное число.
 Нужно посчитать сумму цифр этого числа, и вернуть эту сумму.

Пример:
Метод sumDigitsInNumber вызывается с параметром 546.

Пример вывода:
15
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        //напишите тут ваш код
        String number1 = Integer.toString(number);
        char[] array = number1.toCharArray();

        int sum = 0;
        for (char n : array) {
            if (!Character.isDigit(n))
                throw new IllegalArgumentException();
            sum = sum + Character.getNumericValue(n);
        }
        return  sum;
    }
}