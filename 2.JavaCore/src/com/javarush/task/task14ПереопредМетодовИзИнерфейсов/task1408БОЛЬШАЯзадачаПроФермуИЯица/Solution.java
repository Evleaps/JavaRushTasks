package com.javarush.task.task14ПереопредМетодовИзИнерфейсов.task1408БОЛЬШАЯзадачаПроФермуИЯица;

/* 
Куриная фабрика
Написать Фабрику(Factory) по производству кур(Hen):

1. Создать класс Hen.!
1.1. Сделать его абстрактным.!
1.2. Добавить в класс абстрактный метод int getCountOfEggsPerMonth().!
1.3. Добавить в класс метод String getDescription(), который возвращает строку «Я — курица.«.!
2. Создать класс RussianHen, который наследуется от Hen.!
3. Создать класс UkrainianHen, который наследуется от Hen.!
4. Создать класс MoldovanHen, который наследуется от Hen.!
5. Создать класс BelarusianHen, который наследуется от Hen.!
6. В каждом из четырех последних классов написать свою реализацию метода getCountOfEggsPerMonth.
Методы должны возвращать количество яиц в месяц от данного типа куриц.!
7. В каждом из четырех последних классов написать свою реализацию метода getDescription.!

Методы должны возвращать строку вида:
<getDescription() родительского класса> + <» Моя страна — Sssss. Я несу N яиц в месяц.»>
где Sssss — название страны
где N — количество яиц в месяц

8. В классе HenFactory реализовать метод getHen, который возвращает соответствующую стране породу кур.
9. Все созданные вами классы должны быть в отдельных файлах.
*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        //создаем класс hen(яица) и присваеваем ссылку на класс(в скобках указали содержимое класса)
        hen.getCountOfEggsPerMonth();//метод который отправляет в класс "кол-во яиц в месяц" ! ЭТУ СТРОКУ МОЖНО НЕ ПИСАТЬ, СТРОКА НИЖЕ ВЫЗЫВАЕТ ОТРАБОТКУ КЛАССА
        System.out.println(hen.getDescription());//вывод результата этого класса
    }

    //тут проверим, что же нам все-таки передали в классе в качестве аргумента
    static class HenFactory {
        //Метод getHen и передаем значение(например назовем country)
        static Hen getHen(String country) {
            //объявим объект
            Hen hen = null;
            //напишите тут ваш код

            //проверка, если выдуманный country содержит то, или иное передаваемое значение, то выполнить
                if (country.equals(Country.UKRAINE))
                    hen = new UkrainianHen();
                if (country.equals(Country.BELARUS))
                    //т.к. Hen hen = HenFactory.getHen(Country.BELARUS); видим что hen = ссулка сюда, а мы по переданному значеню
                    //увидели, что содержит беларус, мы создаем новый класс = new BelarisianHen();
                    //итого у нас получилось :  Hen hen = new BelarisianHen() ; Т.е. мы создали класс белорусских яиц на основе родительского общего класса Яица
                    hen = new BelarusianHen();
                if (country.equals(Country.MOLDOVA))
                    hen = new MoldovanHen();
                if (country.equals(Country.RUSSIA))
                    hen = new RussianHen();

            return hen;
        }
    }

}
