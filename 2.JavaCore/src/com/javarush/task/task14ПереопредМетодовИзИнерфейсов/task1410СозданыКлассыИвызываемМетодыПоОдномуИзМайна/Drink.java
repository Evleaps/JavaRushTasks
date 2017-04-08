package com.javarush.task.task14ПереопредМетодовИзИнерфейсов.task1410СозданыКлассыИвызываемМетодыПоОдномуИзМайна;

/**
 * Created by Ромчи on 22.03.2017.
 */
//. Создать абстрактный класс Drink с реализованным методом public void taste(), который выводит в консоль «Вкусно«.
public abstract class Drink {
    public void taste(){
        System.out.println("Вкусно");
    }
}
