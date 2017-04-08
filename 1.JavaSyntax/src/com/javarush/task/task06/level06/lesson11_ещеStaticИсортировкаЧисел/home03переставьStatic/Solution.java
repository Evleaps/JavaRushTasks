package com.javarush.task.task06.level06.lesson11_ещеStaticИсортировкаЧисел.home03переставьStatic;

/* Переставь один модификатор static
Переставь один модификатор static, чтобы пример скомпилировался.
*/

public class Solution
{

    public  static int A = 5;
    public int B = 2;
    public int C = A*B;

    public static void main(String[] args)
    {
        A = 15;
    }

}

