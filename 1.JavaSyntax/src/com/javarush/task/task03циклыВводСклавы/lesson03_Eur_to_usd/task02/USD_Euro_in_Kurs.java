package com.javarush.task.task03циклыВводСклавы.lesson03_Eur_to_usd.task02;

/* Конвертер валют
Реализуйте метод convertEurToUsd, переводящий евро в доллары по заданному курсу.
Вызовите его дважды в методе main с любыми параметрами. Результаты выведите на экран, каждый раз с новой строки.
Подсказка:
Расчет выполняется по формуле: долларСША = евро * курс
*/
public class USD_Euro_in_Kurs
{
    public static void main (String[]args){
        /* можно сделать так
        double usd = convertEurToUsd(100,1.15);
        System.out.println(usd);*/
        //А можно выполнить сокращенную форму
        System.out.println(convertEurToUsd(100,1.15));
        System.out.println(convertEurToUsd(200,1.15));

    }
    static double convertEurToUsd (int eur, double course){ //обратить внимания на последнюю переменную
        double operation = eur * course; // послед.переменную и высчитываем, а не int
        return  operation;

    }
}