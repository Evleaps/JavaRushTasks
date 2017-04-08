package com.javarush.task.task13ПотокиВводаБитваРоботовИсказкаПроРепкуПерегрузка.task1328БитваРоботовСложно;

public abstract class AbstractRobot implements Defensable, Attackable{
    public String name;
    public void Robot(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    private static int hitCount;
    public BodyPart attack() {
        BodyPart attackedBodyPart = null;
        hitCount = hitCount + 1;
        if (hitCount == 1) {
            attackedBodyPart = BodyPart.ARM;
        } else if (hitCount == 2) {
            attackedBodyPart = BodyPart.HEAD;
        } else if (hitCount == 3) {
            attackedBodyPart = BodyPart.CHEST;
        } else if (hitCount == 4) {
            attackedBodyPart = BodyPart.LEG;
            hitCount = 0;
        }
        return attackedBodyPart;
    }
    public BodyPart defense() {
        BodyPart defencedBodyPart = null;
        //  hitCount = hitCount +1;
        if (hitCount == 1) {
            defencedBodyPart = BodyPart.HEAD;
        } else if (hitCount == 2) {
            defencedBodyPart = BodyPart.LEG;
        } else if (hitCount == 3) {
            defencedBodyPart = BodyPart.CHEST;
        } else if (hitCount == 4) {
            defencedBodyPart = BodyPart.ARM;
            hitCount = 2;
        }
        return defencedBodyPart;
    }
}
