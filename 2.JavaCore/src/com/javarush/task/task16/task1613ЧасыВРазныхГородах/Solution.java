package com.javarush.task.task16.task1613ЧасыВРазныхГородах;

/* 
Big Ben clock
1. Разберись, что делает программа.
2. Реализуй логику метода printTime так, чтобы каждую секунду выдавалось время начиная с
установленного в конструкторе

Пример:
В г. Лондон сейчас 23:59:58!
В г. Лондон сейчас 23:59:59!
В г. Лондон сейчас полночь!
В г. Лондон сейчас 0:0:1!

Требования:
1. Метод printTime должен работать примерно секунду.
2. Метод printTime должен увеличивать (инкрементировать) количество секунд, хранимое в переменной seconds.
3. Секунд, после икрементирования времени, не может быть больше 59. Должно увеличиться количество минут.
4. Минут, после икрементирования времени, не может быть больше 59. Должно увеличиться количество часов.
5. Часов, после икрементирования времени, не может быть больше 23.
*/

public class Solution {
    public static volatile boolean isStopped = false;

    public static void main(String[] args) throws InterruptedException {
        //тут передано время, можем добавить еще несколько городов
        Clock clock = new Clock("Лондон", 23, 59, 57);
//это первый и основной поток, до того как дойти до команды ОСТАНОВИТЬ пройдет 4 сек
        Thread.sleep(4000);
        isStopped = true;
    }

    public static class Clock extends Thread {//тк clock это новый поток, его работа начнется сейчас же!
        private String cityName;
        private int hours;
        private int minutes;
        private int seconds;

        public Clock(String cityName, int hours, int minutes, int seconds) {
            this.cityName = cityName;
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
            start();//А трочнее, вот сейчас мы разрешили работать методу run()
        }

        public void run() {
            try {
                while (!isStopped) {
                    printTime();
                    //АГА, если стоп false то выполнить метод printTime()!!!
                }
            } catch (InterruptedException e) {
            }
        }

        private void printTime() throws InterruptedException {
            //add your code here - добавь код тут


                Thread.sleep(1000);
                seconds++;
                if (seconds == 60) {
                    minutes++;
                    seconds = 0;
                }
                if (minutes == 60) {
                    hours++;
                    minutes = 0;
                }
                if (hours == 24) {
                    hours = 0;
                }


                if (hours == 0 && minutes == 0 && seconds == 0) {
                    System.out.println(String.format("В г. %s сейчас полночь!", cityName));
                } else {
                    System.out.println(String.format("В г. %s сейчас %d:%d:%d!", cityName, hours, minutes, seconds));
                }

        }
    }
}
