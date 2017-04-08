package com.javarush.task.task04_ЦиклыТhisМодули.lesson02_This_.task03ЧерезКласс;

/* Реализовать метод setCatsCount
Реализовать метод setCatsCount так, чтобы с его помощью можно было устанавливать значение переменной catsCount равное переданному параметру.
*/

 class Cat {
    private static int catsCount = 0;

     static void setCatsCount(int catsCount) {
        Cat.catsCount = catsCount; //тут static, а значит this нельзя, нужно указать название переменной
        System.out.println(catsCount);
    }
}
/*
class Print{
    public static void main(String[] args) {
        Cat.setCatsCount(int catsCount);
    }
}
/*public class Cat {
    private String name;

    public void setName(String name) {//мы создаем внутри класса метод, который задает имя.
        //напишите тут ваш код
        this.name = name;//this.name обозначет, что мы берем переменную name именно того объекта, с которым в данный момент работаем, и присваиваем ей значение, которое мы указали в скобках чуть выше.

        Каждому объекту (в нашем случае коту), который ты в нем создашь, нужны характеристики.
        Потому мы берем и в теле Класса создаем переменную String name, которая будет отдельно
        задаваться для каждого нового объекта и содержать имя кота.
    }
            }*/
