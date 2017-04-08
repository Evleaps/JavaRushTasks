package com.javarush.task.task14ПереопредМетодовИзИнерфейсов.task1410СозданыКлассыИвызываемМетодыПоОдномуИзМайна;

/**
 * Created by Ромчи on 22.03.2017.
 */
//2. Создать класс Wine, который наследуется от Drink, с реализованным методом public String getHolidayName(), который возвращает строку «День Рождения«.
public class Wine extends Drink{
    public String getHolidayName(){
        return "День Рождения";
    }
}
