package com.javarush.task.task14ПереопредМетодовИзИнерфейсов.task1417КонвертерВалютыПерегрузкаВызовИзРазныхФайлов;

public class Hrivna extends Money {
    private double amount1;
    public Hrivna(double amount) {
        super(amount);
        amount1 = amount;
    }

    @Override
    public double getAmount() {
        return amount1;
    }

    @Override
    public String getCurrencyName() {
        return "HRN";
    }
}
