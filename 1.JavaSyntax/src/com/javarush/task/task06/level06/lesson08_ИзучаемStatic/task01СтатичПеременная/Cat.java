package com.javarush.task.task06.level06.lesson08_ИзучаемStatic.task01СтатичПеременная;

/* Класс Cat и статическая переменная catCount
Создать статическую переменную int catCount в классе Cat. Создай конструктор [public Cat()], в котором увеличивай данную переменную на 1.
*/

public class Cat
{
    //напишите тут ваш код
    public static int catCount = 0;//задаем нт
    public Cat(){
       Cat.catCount++;//так как метод мтатический, используем полное имя
    }


}
