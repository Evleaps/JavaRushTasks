package com.javarush.task.task05ИзучаемКонструкторы.level05ГеттерыСеттеры.lesson12Максимум_из_Nчисел_иВыходСловом.home02СоздКлассИпередатьЗначения;

/* Man and Woman
1. Внутри класса СЛОЖНАПИЗДЕЦ создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        //создай по два объекта каждого класса тут
        Man roman = new Man("Рома",21, "Рокоссовского");
        Man sergey = new Man("Сережа",20, "Воскресенское");
        Woman masha = new Woman("Маша",20, "Васюнина");
        Woman katya = new Woman("Катя",22, "Мещера");

        //выведи их на экран тут
        System.out.println(roman.name+" "+roman.age+" "+roman.address);
        System.out.println(masha.name+" "+masha.age+" "+masha.address);
        System.out.println(katya.name+" "+katya.age+" "+katya.address);
        System.out.println(sergey.name+" "+sergey.age+" "+sergey.address);
    }

    //добавьте тут ваши классы
    public static class Man
    {
        private String name;
        private String address;
        private int age;

        public Man(String name, int age, String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }

    public static class Woman
    {
        private String name;
        private String address;
        private int age;

        public Woman(String name, int age, String address)
        {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
}


   /* public static class Man{
         String name;
         String adress;
         int age;
    }*/


    /*public static class Woman{
       *//* String name;
        String adress;
        int age;*//*
    }
}*/
