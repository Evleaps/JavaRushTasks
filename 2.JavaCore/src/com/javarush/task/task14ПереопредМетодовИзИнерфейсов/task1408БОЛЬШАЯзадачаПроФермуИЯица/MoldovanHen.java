package com.javarush.task.task14ПереопредМетодовИзИнерфейсов.task1408БОЛЬШАЯзадачаПроФермуИЯица;

public class MoldovanHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth() {
        return 40;
    }

    @Override
    String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.MOLDOVA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}