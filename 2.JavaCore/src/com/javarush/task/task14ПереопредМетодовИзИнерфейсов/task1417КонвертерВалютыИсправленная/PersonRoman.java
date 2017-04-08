package com.javarush.task.task14ПереопредМетодовИзИнерфейсов.task1417КонвертерВалютыИсправленная;

import java.util.ArrayList;
import java.util.List;

public class PersonRoman extends Solution.Person{

    public String name;
    private List<Money> allMoney;

    PersonRoman(String name) {
        super(name);
        this.name = name;
        this.allMoney = new ArrayList<Money>();
        allMoney.add(new USD(50.6));
        allMoney.add(new Ruble(502.16));
        allMoney.add(new Hrivna(540.46));
    }

    public List<Money> getMoneyRoman(){
        return allMoney;
    }
}
