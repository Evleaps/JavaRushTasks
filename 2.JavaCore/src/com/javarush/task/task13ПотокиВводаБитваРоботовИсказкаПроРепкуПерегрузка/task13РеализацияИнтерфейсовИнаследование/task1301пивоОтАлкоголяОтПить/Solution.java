package com.javarush.task.task13ПотокиВводаБитваРоботовИсказкаПроРепкуПерегрузка.task13РеализацияИнтерфейсовИнаследование.task1301пивоОтАлкоголяОтПить;

/* 
Пиво
Подумай, какой из двух интерфейсов нужно реализовать в классе Beer.
2. Добавь к классу Beer этот интерфейс и реализуй все его методы.
3. Подумай, как связаны переменная READY_TO_GO_HOME и метод isReadyToGoHome.
4. Верни значение переменной READY_TO_GO_HOME в методе isReadyToGoHome.
*/
public class Solution {
    public static void main(String[] args) throws Exception {
    }

    public interface Drink {
        void askMore(String message);

        void sayThankYou();

        boolean isReadyToGoHome();
    }

    public interface Alcohol extends Drink {
        boolean READY_TO_GO_HOME = false;

        void sleepOnTheFloor();
    }

    public static class Beer implements Alcohol{
        public void askMore(String message){}
        public void sayThankYou(){}

        @Override
        public boolean isReadyToGoHome() {
            return READY_TO_GO_HOME;
        }

        public void sleepOnTheFloor(){}

    }
}