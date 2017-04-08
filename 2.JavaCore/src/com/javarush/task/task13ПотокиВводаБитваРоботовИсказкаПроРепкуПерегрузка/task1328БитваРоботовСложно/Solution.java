package com.javarush.task.task13ПотокиВводаБитваРоботовИсказкаПроРепкуПерегрузка.task1328БитваРоботовСложно;

/* 
Битва роботов
6. Изменить код согласно новой архитектуре и добавить новую логику:
6.1. Сделать класс AbstractRobot абстрактным, вынести логику атаки и защиты из Robot в AbstractRobot.
6.2. Отредактировать класс Robot учитывая AbstractRobot.
6.3. Расширить класс BodyPart новой частью тела BodyPart.CHEST(«грудь«).
6.4. Добавить новую часть тела в реализацию интерфейсов Attackable и Defensable (в классе AbstractRobot).
*/

public class Solution {
    public static void main(String[] args) {
        Robot amigo = new Robot("Амиго");
        Robot enemy = new Robot("Сгибальщик-02");

        doMove(amigo, enemy);
        doMove(amigo, enemy);
        doMove(enemy, amigo);
        doMove(amigo, enemy);
        doMove(enemy, amigo);
        doMove(amigo, enemy);
        doMove(enemy, amigo);
        doMove(amigo, enemy);
    }

    public static void doMove(Robot robotFirst, Robot robotSecond) {
        BodyPart attacked = robotFirst.attack();
        BodyPart defenced = robotFirst.defense();
        System.out.println(String.format("%s атаковал робота %s, атакована %s, защищена %s",
                robotFirst.getName(), robotSecond.getName(), attacked, defenced));
    }
}
