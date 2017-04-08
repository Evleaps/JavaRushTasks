package com.javarush.task.task15НаследованиеSingletonКонструкторы.task1521ЛегкаяПерегрузка;

import java.math.BigDecimal;

/* 
ООП - перегрузка
1. В классе Tree перегрузи метод info(Object s) два раза так, чтобы получилось три метода info(Object s), info(Number s), info(String s).
1.1. Разберись в методе info(Object s). Сделай по аналогии функционал новых методов.
1.2. Например, для метода info(Number s) результат может быть таким «Дерево № 123 , метод Number, параметр Short«.
*/

public class Solution {
    public static void main(String[] args) {
        //Блок 2.
        //Вызов для Object
        //тут приведение типа к объекту, по этому весь блок вызовется как object
        new Tree().info((Object)new Integer("4"));
        new Tree().info((Object)new Short("4"));
        new Tree().info((Object)new BigDecimal("4"));

        //Блок 3.
        //Вызов для Number
        // тут объекты, number в общем то все равно какие этио типы
        new Tree().info(new Integer("4"));
        new Tree().info(new Short("4"));
        new Tree().info(new BigDecimal("4"));


        //Блок 4.
        //Вызов для String
        //тут только стринги, а если нет, то toString превратил в стрингу
        new Tree().info(new String("4"));
        new Tree().info(new Integer("4").toString());
        new Tree().info(new Short("4").toString());
        new Tree().info(new BigDecimal("4").toString());
    }
}
