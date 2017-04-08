package com.javarush.task.task14ПереопредМетодовИзИнерфейсов.task1411ЕслиВвелСловоТоСделатьДействиеИзИнтерфейса;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
User, Looser, Coder and Proger
1. Ввести [в цикле] с клавиатуры несколько строк (ключей).
Строки(ключи) могут быть такими: «user«, «loser«, «coder«, «proger«.
Ввод окончен, когда строка не совпадает ни с одной из выше указанных.

2. Для каждой введенной строки нужно:
2.1. Создать соответствующий объект [см. Person.java], например, для строки «user» нужно создать объект класса User.
2.2. Передать этот объект в метод doWork.

3. Написать реализацию метода doWork, который:
3.1. Вызывает метод live() у переданного обекта, если этот объект (person) имеет тип User.
3.2. Вызывает метод doNothing(), если person имеет тип Loser.
3.3. Вызывает метод coding(), если person имеет тип Coder.
3.4. Вызывает метод enjoy(), если person имеет тип Proger.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //вынес переменные за цикл
        Person person = null;
        String key = null;

        //тут цикл по чтению ключей, пункт 1
        while (true){
            key = reader.readLine();
            //если содержит нужное слово то создаю объект, классы описаны в интерфейсе. А Потом сразу вызываю метод doWork чтоб что-то сделать
            if (key.equals("user")){ person = new Person.User(); doWork(person);}
            else if (key.equals("loser")){ person = new Person.Loser(); doWork(person);}
            else if (key.equals("coder")){ person = new Person.Coder(); doWork(person);}
            else if (key.equals("proger")){ person = new Person.Proger(); doWork(person);}
            else break;
        }

    }

    public static void doWork(Person person) {
        // пункт 3
        //если принадлежит, то понижаем степень person и вызываем переменную которую содержит наш класс, который в интерфейсе зачем то находится
        if (person instanceof Person.User) ((Person.User) person).live();
        if (person instanceof Person.Loser) ((Person.Loser) person).doNothing();
        if (person instanceof Person.Coder) ((Person.Coder) person).coding();
        if (person instanceof Person.Proger) ((Person.Proger) person).enjoy();
    }
}
