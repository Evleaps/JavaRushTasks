package com.javarush.task.task14ПереопредМетодовИзИнерфейсов.task1408БОЛЬШАЯзадачаПроФермуИЯица;


public class RussianHen extends Hen {

    @Override
    public int getCountOfEggsPerMonth() {
        return 20;
    }

    @Override
    String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.RUSSIA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }


}
