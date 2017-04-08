package com.javarush.task.task14ПереопредМетодовИзИнерфейсов.task1408БОЛЬШАЯзадачаПроФермуИЯица;

public class UkrainianHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth() {
        return 30;
    }

    @Override
    String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.UKRAINE + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}