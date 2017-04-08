package com.javarush.task.task04_ЦиклыТhisМодули.lesson02_This_.task02_присваивание;

/* Реализовать метод addNewCat
Реализовать метод addNewCat, чтобы при его вызове (т.е. добавлении нового кота), количество котов увеличивалось на 1. За количество котов отвечает переменная catsCount.
*/

class Cat
{
    private static int catsCount = 0; //коты


     static void addNewCat() { //метод, на него ссылаемся
        catsCount++; //увеличивает кол-во котов на 1
        catsCount++; //увеличивает кол-во котов еще на 1
        System.out.println(catsCount);


    }
}
class Print {//создаем
    public static void main(String[] args) {//spvm
        Cat.addNewCat();//имя класса.имя переменной
    }
}