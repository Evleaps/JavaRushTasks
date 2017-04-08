package com.javarush.task.task14ПереопредМетодовИзИнерфейсов.task1417КонвертерВалютыПерегрузкаВызовИзРазныхФайлов;

import java.util.ArrayList;
import java.util.List;

/* 
Валюты
Расширить функциональность программы, которая позволит производить манипуляции с валютами.

1. В абстрактном классе Money создай приватное поле amount типа double.
2. Создай публичный геттер для поля amount(public double getAmount()),
чтобы к этому полю можно было получить доступ извне класса Money.
3. В отдельном файле создай классы Hrivna, Ruble и USD, которые будут являться
потомками класса Money.
4. В классах Hrivna, Ruble и USD реализуй метод getCurrencyName который будет
возвращать название соответствующей валюты(строку) в виде аббревиатуры(USD, HRN, RUB).!
5. В классах Hrivna, Ruble и USD реализуй публичный(public) конструктор, который
принимает один параметр и вызывает конструктор базового класса(super) с этим параметром.
6. Заполни список allMoney объектами всех возможных, в рамках условия задачи и функциональности программы, валют.
*/

public class Solution {
    public static void main(String[] args) {
        //Создать имечко, человечка
        Person ivan = new Person("Иван");
        for (Money money : ivan.getAllMoney()) {
            System.out.println(ivan.name + " имеет заначку в размере " + money.getAmount() + " " + money.getCurrencyName());
        }
    }

    static class Person {
        public String name;
        private List<Money> allMoney;

        public List<Money> getAllMoney() {
            return allMoney;//создали лист getAllMoney и придумали переменную-ссылку
        }

        Person(String name) {
            //указали, что существует имя
            //а вот сюда пришла ссылка, она равна new ArrayList<>();
            this.name = name;
            this.allMoney = new ArrayList<Money>();/*ТУТ ПРОГРАММА УХОДИТ В КЛАСС MONEY*/
            //добавил классы
            allMoney.add(new USD(50));
            allMoney.add(new Ruble(20000.0));
            allMoney.add(new Hrivna(100));
            }



    }
}
