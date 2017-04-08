package com.javarush.task.task14ПереопредМетодовИзИнерфейсов.task1417КонвертерВалютыПерегрузкаВызовИзРазныхФайлов;

public class USD extends Money {
    private double amount;
    public USD(double amount) {
        super(amount);
        this.amount = amount;
    }

    @Override
    public double getAmount() {
        return amount;
    }

    @Override
    public String getCurrencyName() {
        return "USD";
    }
}
