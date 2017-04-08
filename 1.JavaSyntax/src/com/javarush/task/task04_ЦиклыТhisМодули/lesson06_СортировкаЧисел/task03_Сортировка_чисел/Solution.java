package com.javarush.task.task04_ЦиклыТhisМодули.lesson06_СортировкаЧисел.task03_Сортировка_чисел;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;//для throws Exception
import java.util.*; //для Arrays.sort

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a1 = Integer.parseInt(reader.readLine());
        int b1 = Integer.parseInt(reader.readLine());
        int c1 = Integer.parseInt(reader.readLine());

        // А ВОТ ТАК НАДО БЫЛО СРАЗУ!!!!!
        Integer[] array = new Integer[3]; //для сортировки по убыванию нужно именно Integer, для увеличения можно int
        array[0] = a1;
        array[1] = b1;
        array[2] = c1;

        //Сортируем массив
        /*Для уменьшения - Arrays.sort(array, Collections.reverseOrder());
        * Для увеличения  Arrays.sort(array);
        * Для Имен/названий от А до Я -  Arrays.sort(name);*/

        Arrays.sort(array, Collections.reverseOrder());

        //Выводим отсортированный массив на консоль.
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]+" ");
        }

       /* *//*РАБОЧИЙ КОД, НО ДАУНА, А НЕ ПРОГРАММИСТА*//*
        if (a1>=b1 && a1>=c1 && c1>=b1) System.out.println(a1+" "+c1+" "+b1);
        if (a1>=b1 && a1>=c1 && b1>=c1) System.out.println(a1+" "+b1+" "+c1);
        if (b1>=a1 && b1>=c1 && c1>=a1) System.out.println(b1+" "+c1+" "+a1);
        if (b1>=a1 && b1>=c1 && a1>=c1) System.out.println(b1+" "+a1+" "+c1);
        if (c1>=a1 && c1>=b1 && a1>=b1) System.out.println(c1+" "+a1+" "+b1);
        if (c1>=a1 && c1>=b1 && b1>=a1) System.out.println(b1+" "+a1+" "+c1);*/

        //ПИШЕМ НОРМ КОД, тоже кал, не работает вообще
        /*if (a1<b1){
             z=a1; a1=b1; b1= z; }
        if (a1<c1){
            z=a1; a1=b1; b1= z; }
        if (c1<b1){
            z=c1; c1=b1; b1= z; }
        System.out.println(a+" "+b+" "+c);*/





    }
}
