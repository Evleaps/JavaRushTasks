package com.javarush.task.task16.task1610ВсеКотятаВКорзинке_2нитиМудреная;

/* 
Расставь вызовы методов join()
1. Разберись, что делает программа.
2. Расставь вызовы методов join() так, чтобы для каждой кошки выполнялось следующее:
2.1. Сначала кошка рожает котят.
2.2. Потом все котята вылазят из корзинки в произвольном порядке.
2.3. В конце кошка собирает их назад в корзинку.
2.4. Все события для одной кошки могут быть перемешаны с событиями для другой кошки.
2.5. Добавить сон котят (200 мс) в investigateWorld.

Требования:
1. У каждого котенка (объекта типа Kitten) должен быть вызван метод join.
2. Метод investigateWorld должен обеспечивать сон котенка на 200 мс. Используй метод Thread.sleep(200).
3. Программа должна создавать две кошки и четыре котенка.
4. Методы, которые отвечают за вывод в консоль, не изменять.
5. Вывод программы должен отображать выполнение требований условия.
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        Cat cat1 = new Cat("Мурка");
        Cat cat2 = new Cat("Пушинка");
    }

    //ждет 0.2 секунды
    private static void investigateWorld() throws InterruptedException {
        Thread.sleep(200);
    }

    public static class Cat extends Thread {
        protected Kitten kitten1;
        protected Kitten kitten2;

        public Cat(String name) {
            super(name);//= переданному значению
            kitten1 = new Kitten("Котенок 1, мама - " + getName());
            kitten2 = new Kitten("Котенок 2, мама - " + getName());
            start();
        }

        public void run() {
            //1. сначала отработает cat 1, затем сразу cat 2
            System.out.println(getName() + " родила 2 котенка");
            try {
                initAllKitten();
            } catch (InterruptedException e) {}

            //initAllKitten(); для всех выполнен и по этому выполняем для каждого cat из майна финальный соуп
            System.out.println(getName() + ": Все котята в корзинке. " + getName() + " собрала их назад");
        }

        private void initAllKitten() throws InterruptedException {
            //Т.к. Cat унаследован от Thread, мы даем старт
            kitten1.start();
            //kitten1 отрабоатывает (переданное значение "Котенок 1, мама - Мурка, вылез из корзинки"
            //Ибо класс Kitten тоже новая нить, имеет свой конструктор, свой run.
            //Примечательно, что сначала отрабатывают все классы  Cat в майне.
            kitten1.join();
            //А уже потом, после того как мы дождались операции, вызывается второй метод kitten2
            kitten2.start();
            kitten2.join();
        }
    }

    public static class Kitten extends Thread {
        public Kitten(String name) {
            super(name);
        }

        public void run() {
            System.out.println(getName() + ", вылез из корзинки");
            try {
                investigateWorld();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
