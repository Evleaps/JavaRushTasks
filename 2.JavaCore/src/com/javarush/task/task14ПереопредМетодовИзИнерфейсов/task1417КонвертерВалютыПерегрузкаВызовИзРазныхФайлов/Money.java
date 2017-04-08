package com.javarush.task.task14ПереопредМетодовИзИнерфейсов.task1417КонвертерВалютыПерегрузкаВызовИзРазныхФайлов;

public abstract class Money {
    //поле amount
    private double amount;
    //КОНСТРУКТОР!!!!
    //Класс money с параметром amount типа double
    public Money(double amount) {
        this.amount = amount;
    }

    public  double getAmount(){
        return amount;
    }
    public abstract String getCurrencyName();
}

