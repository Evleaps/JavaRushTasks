package com.javarush.task.task16_Нити.task1605ВремяРаботыПрограммы2нити;

import java.util.Date;

/* Поговорим о музыке?
1. Измени класс Violin так, чтоб он стал таском для нити. Используй интерфейс MusicalInstrument
2. Реализуй необходимый метод в нити Violin. Реализация должна быть следующей:
2.1. Считай время начала игры — метод startPlaying().
2.2. Подожди 1 секунду — метод sleepNSeconds(int n), где n — количество секунд.
2.3. Считай время окончания игры — метод stopPlaying().
2.4. Выведи на консоль продолжительность игры в миллисекундах.

Пример «Playing 1002 ms«.

Требования:
1. Класс Violin не должен быть унаследован от какого-либо дополнительного класса.
2. Класс Violin должен реализовывать интерфейс MusicalInstrument.
3. Метод run класса SpecialThread должен вызывать метод startPlaying.
4. Метод run класса SpecialThread должен вызывать метод sleepNSeconds с параметром 1 секунда.
5. Метод run класса SpecialThread должен вызывать метод stopPlaying.
6. Метод run класса SpecialThread должен выводить на консоль продолжительность игры в миллисекундах. Используй формат из примера.
*/

public class Solution {
    public static int delay = 1000;

    public static void main(String[] args) {
        Thread violin = new Thread(new Violin("Player"));
        violin.start();
    }
//ждет 1 секунду
    public static void sleepNSeconds(int n) {
        try {
            Thread.sleep(n * delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //интерфейс создает новый поток
    public interface MusicalInstrument extends Runnable {
        Date startPlaying();
        Date stopPlaying();
    }

    public static class Violin implements MusicalInstrument{
        private String owner;
        @Override
        //вот тут запустился новый поток
        public void run() {
            // дата начала равна входу в startPlaying(), который работает и возвращает new Data
            Date date = startPlaying();
            sleepNSeconds(1);
            // дата конца операции равна входу в stopPlaying();, который работает и возвращает new Data
            Date currentDate = stopPlaying();
            long msDalay = currentDate.getTime() - date.getTime();
            System.out.println("Playing " + msDalay +" ms");

        }

        public Violin(String owner) {
            this.owner = owner;
        }

        public Date startPlaying() {
            System.out.println(this.owner + " starts playing");
            return new Date();
        }

        public Date stopPlaying() {
            System.out.println(this.owner + " stops playing");
            return new Date();
        }

    }
}
