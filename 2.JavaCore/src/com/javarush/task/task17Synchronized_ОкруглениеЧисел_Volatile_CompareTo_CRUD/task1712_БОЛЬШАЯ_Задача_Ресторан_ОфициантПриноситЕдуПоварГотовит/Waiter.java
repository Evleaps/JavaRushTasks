package com.javarush.task.task17Synchronized_ОкруглениеЧисел_Volatile_CompareTo_CRUD.task1712_БОЛЬШАЯ_Задача_Ресторан_ОфициантПриноситЕдуПоварГотовит;

public class Waiter implements Runnable {
    //оставновка потока, но можно было бы использовать интеррупт
    public boolean continueWorking = true;

    @Override
    public void run() {
        //в менеджере прорисыны очереди Queue, поведение официанта(II), кол-во столов и
        // методы добавления в очередь
        Manager manager = Manager.getInstance();

        //если поток не остановили, см main , или если есть заказы продолжаем работать
        //1 - если повар положил в очередь готовое блюдо, отнести его.
        //poll() удаляет из очереди и вызывает объект, т.е. dishes равен блюду которое
        // было в очереди, но его уже удалили из очереди. ОЧЕРЕДЬ ТИПА @FIFO
        while (continueWorking || !manager.getDishesQueue().isEmpty()) {
            if (!manager.getDishesQueue().isEmpty()) {       //относим готовый заказ
                Dishes dishes = manager.getDishesQueue().poll(); //удалим заказ из очереди
                System.out.println("Официант отнес заказ для стола №" + dishes.getTableNumber());
            } else {                                         //берем новый заказ
                Table table = manager.getNextTable();
                Order order = table.getOrder();
                System.out.println("Получен заказ от стола №" + order.getTableNumber());
                manager.getOrderQueue().add(order); //добавить в очередь
            }
            try {
                Thread.sleep(100);  //walking to the next table
            } catch (InterruptedException e) {
            }
        }
    }
}
