package com.javarush.task.task05.level05.lesson05ГеттерСеттер.task02ДракаКотов;

/* Реализовать метод fight
Реализовать метод boolean fight(Cat anotherCat):
реализовать механизм драки котов в зависимости от их веса, возраста и силы.
Зависимость придумать самому. Метод должен определять, выиграли ли мы (this) бой или нет,
т.е. возвращать true, если выиграли и false - если нет.
Должно выполняться условие:
если cat1.fight(cat2) = true , то cat2.fight(cat1) = false
*/

public class Cat
{
    public String name;//указал параметры кисы
    public int age;
    public int weight;
    public int strength;

    public static void main(String[] args)
    {
        Cat cat1 = new Cat();//параметры котиков
        cat1.age = 3;
        cat1.weight = 5;
        cat1.strength = 7;


        Cat cat2 = new Cat();
        cat2.age = 4;
        cat2.weight = 6;
        cat2.strength = 8;
    }

    public Cat()
    {
//хз зачем это
        this.age = age;
        this.weight = weight;
        this.strength = strength;

    }

    public boolean fight(Cat anotherCat) {

        //напишите тут ваш код
        //магия
        if (this.age>anotherCat.age) return true;
        return false;
    }
}
