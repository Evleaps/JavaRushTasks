package com.javarush.task.task14ПереопредМетодовИзИнерфейсов.task1413ВызовМетодовИКлассовИгеттеровПерегрузка;

/**
 * Created by Ромчи on 22.03.2017.
 */
public class Keyboard implements CompItem {
    @Override
    public String getName() {
        //возвращаем имя простого класса
        return getClass().getSimpleName();
    }
}
