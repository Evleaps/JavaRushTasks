package com.javarush.task.task03циклыВводСклавы.lesson03_Eur_to_usd.task03;

/* 10 процентов
Реализуйте метод addTenPercent, который увеличивает переданное целое число на 10%.
Исправьте ошибку в сигнатуре метода.
Подсказка: подумайте, какие у этого метода входные и выходные данные.
*/
public class Solution
{
     static double addTenPercent(int i) {
        //напишите тут ваш код
        double a = i + i * 0.1;
        return a;
    }

    public static void main(String[] args) {
        System.out.println(addTenPercent(10));
    }
}
