package com.javarush.task.task14ПереопредМетодовИзИнерфейсов.task1410СозданыКлассыИвызываемМетодыПоОдномуИзМайна;

/* 
Дегустация вин
1. Создать абстрактный класс Drink с реализованным методом public void taste(), который выводит в консоль «Вкусно«.
2. Создать класс Wine, который наследуется от Drink, с реализованным методом public String getHolidayName(), который возвращает строку «День Рождения«.
3. Создать класс BubblyWine, который наследуется от Wine, с реализованным методом public String getHolidayName(), который возвращает строку «Новый Год«.
4. Написать реализацию методов getDeliciousDrink, getWine, getBubblyWine.
5. Все классы и интерфейс должны находиться в отдельных файлах.
*/

public class Solution {
    public static void main(String[] args) {

        getDeliciousDrink().taste();//выводит "Вкусно" ибо
        System.out.println(getWine().getHolidayName());
        System.out.println(getBubblyWine().getHolidayName());
        System.out.println(getWine().getHolidayName());
    }

    public static Drink getDeliciousDrink(){
        return new Wine();//обо drink в котором taste это интерфейс и пришлось бы переопределять метод, писать super вызов родительскогшо метода.
        //а так у нас вызов wine.taste.
    }

    public static Wine getWine() {//тут тоже new wine, но в майне вызывают метод дня рождения
        return new Wine();
    }

    public static Wine getBubblyWine() { //а вот тут тоже вызввают метод, но в bubblyWine он переопределен на другую фразу
        return new BubblyWine();

    }
}
