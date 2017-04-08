package com.javarush.task.task14ПереопредМетодовИзИнерфейсов.task1408БОЛЬШАЯзадачаПроФермуИЯица;

public  class BelarusianHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth() {
        return 50;
    }


    @Override
    String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.BELARUS + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}