package com.javarush.task.task14ПереопредМетодовИзИнерфейсов.task1417КонвертерВалютыИсправленная;

public class Ruble extends Money {

    public double amount;
    public Ruble(double amount) {
        this.amount = amount;
    }

    @Override
    public double getAmount() {
        return amount;
    }

    @Override
    public String getCurrencyName() {
        return "RUB";
    }

}
