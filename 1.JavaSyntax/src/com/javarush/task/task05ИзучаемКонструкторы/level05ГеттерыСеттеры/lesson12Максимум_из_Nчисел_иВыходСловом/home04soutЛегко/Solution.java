package com.javarush.task.task05ИзучаемКонструкторы.level05ГеттерыСеттеры.lesson12Максимум_из_Nчисел_иВыходСловом.home04soutЛегко;

/* Вывести на экран сегодняшнюю дату
Вывести на экран текущую дату в аналогичном виде "21 02 2014".
*/

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Solution
{
    public static void main(String[] args) throws ParseException {
        //напишите тут ваш код
        Date d = new Date();
        SimpleDateFormat f = new SimpleDateFormat("dd MM yyy", Locale.ENGLISH);
        System.out.println(f.format(d));
        Date m = f.parse("12 12 1996");
        String s = String.valueOf(m);
        System.out.println(s);
        SimpleDateFormat format = new SimpleDateFormat("EEE MMM dd hh:mm:ss zzz yyyy", Locale.ENGLISH);
        Date m1 = format.parse(s);
    }
}
