package com.javarush.task.task05.level05.lesson12Максимум_из_Nчисел_иВыходСловом.home03КлассыИнициализацияКонструктором;

/* Создай классы Dog, Cat, Mouse
Создай классы Dog, Cat, Mouse. Добавь по три поля в каждый класс, на твой выбор. Создай объекты для героев мультика Том и Джерри. Так много, как только вспомнишь.
Пример:
Mouse jerryMouse = new Mouse(“Jerry”, 12 , 5), где 12 - высота в см, 5 - длина хвоста в см.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        Mouse pinki = new Mouse("Пинки",15,8);
        Dog barboss = new Dog("Пес",15,"серый");
        Dog childBarbos = new Dog("Сын",15,"белый");
        Cat tom = new Cat("Том",18,"синий");
        Cat brotherTom = new Cat("Брат",11,"черный");

        //напишите тут ваш код
    }

    public static class Mouse
    {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail)
        {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    //добавьте тут ваши классы
    public static class Dog
{
    private String name;
    private int growth;
    private String color;

    public Dog(String name, int growth, String color)
    {
        this.name = name;
        this.growth = growth;
        this.color = color;
    }

}
    public static class Cat
    {
        private String name;
        private int growth;
        private String color;

        public Cat(String name, int growth, String color)
        {
            this.name = name;
            this.growth = growth;
            this.color = color;
        }

    }

}
