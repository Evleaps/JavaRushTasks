package com.javarush.task.task16.task1627Игра3хИгроков4потока;
import java.util.ArrayList;
import java.util.List;
/*Три человека играют в игру. Каждый игрок(Gamer) характеризуется двумя параметрами: фамилией(name)
и количеством действий в секунду (rating).
Нужно вывести в консоль ход игры и определить победителя и проигравших.
Итак…
1. Разберись, что делает программа.
1.1. List<String> steps хранит последовательность действий, которое каждый игрок выполняет от 0 до последнего.
1.2. isWinnerFound показывает, найден победитель или нет.
1.3. Метод sleep выбрасывает InterruptedException и принимает параметр типа long.
1.4. Игроки играют независимо друг от друга.
2. Реализуй логику метода run так, чтобы для каждого игрока:
2.1. Через равные интервалы времени (1000ms / rating) выводились в консоль действия, описанные в steps.
2.2. Любой текст должен начинаться с фамилии игрока (метод getName()), потом следовать двоеточие, а затем сам текст.

Пример: [Ivanov:Начало игры].

2.3. Когда игрок выполнит все действия из steps, то он считается победителем. Выведите [getName() + «:победитель!»].
2.4. Когда найден победитель, то игра останавливается, и остальные игроки считаются побежденными. Выведите для них
[getName() + «:проиграл»].


Требования:
1. Метод run класса Gamer через равные интервалы времени (1000ms / rating) должен выводить в консоль фамилию игрока
(метод getName()), потом двоеточие, а затем текст из OnlineGame.steps. Пример: [Ivanov:Начало игры].
2. Когда все игровые шаги будут выполнены, а победитель еще не найден, метод run должен установить флаг
OnlineGame.isWinnerFound в true (сообщить остальным, что он победитель).
3. Если игрок стал победителем, его метод run должен вывести надпись [getName() + :победитель!]. Например:
[Sidorov:победитель!].
4. Методы run всех игроков которые не стали победителями (были прерваны), должны вывести надписи
[getName() + :проиграл]. Например:[Petrov:проиграл]
5. Метод run не должен кидать исключение при прерывании.*/
public class Solution {
    public static void main(String[] args) throws InterruptedException {
        //Создали поток, хз зачем, без него норм бы работало
        OnlineGame onlineGame = new OnlineGame();
        onlineGame.start();
    }

    public static class OnlineGame extends Thread {
        //проверка, есть ли победитель
        public static volatile boolean isWinnerFound = false;

        //сюда мы засунули возможности игры(стадии)
        public static List<String> steps = new ArrayList<String>();
        static {
            steps.add("Начало игры");
            steps.add("Сбор ресурсов");
            steps.add("Рост экономики");
            steps.add("Убийство врагов");
        }

        //Добавили игроков, имя и их скорость, стоит заметить, это все новые потоки!Работают параллельно
        protected Gamer gamer1 = new Gamer("Ivanov", 3);
        protected Gamer gamer2 = new Gamer("Petrov", 1);
        protected Gamer gamer3 = new Gamer("Sidorov", 5);

        public void run() {
//запустили наши потоки в работу, начал исполняться ран
            gamer1.start();
            gamer2.start();
            gamer3.start();

            //как только найден победитель, закрыть все к черту
            while (!isWinnerFound) {
            }
            gamer1.interrupt();
            gamer2.interrupt();
            gamer3.interrupt();
        }
    }

    //напишем профили наших игроков
    public static class Gamer extends Thread {
        //скорость мы добавим
        private int rating;
//в конструкторе указаны параметры которые мы хотим принять
        public Gamer(String name, int rating) {
            super(name);//это потоки, если использовать this то выведет threed1, по этому родителя зовем
            this.rating = rating;
        }

        @Override
        public void run() {
            //вкуснятина
            try {
                //цикл равный массиву
                //ждем секунду, игроки играют
                //выводим действия
                //эжели закончился массив, проверим, не победил ли кто раньше чем мы!
                //нет? ну тогда скажем всем что мы победили
                    for (int i = 0; i < OnlineGame.steps.size(); i++) {
                        Thread.sleep(1000 / rating);
                        System.out.println(getName() + ":" + OnlineGame.steps.get(i));
                        if (i == OnlineGame.steps.size()-1) {
                            if (!OnlineGame.isWinnerFound) {
                                System.out.println(getName() + ":победитель!");
                                OnlineGame.isWinnerFound = true;
                            }
                        }
                    }
            } catch (InterruptedException e) {
                //хехехе
                System.out.println(getName() + ":проиграл");
            }

            //Add your code here - добавь код тут
        }
    }
}
