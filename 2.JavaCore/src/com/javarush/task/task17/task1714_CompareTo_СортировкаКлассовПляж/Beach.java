package com.javarush.task.task17.task1714_CompareTo_СортировкаКлассовПляж;

/* 
Comparable
Реализуйте интерфейс Comparable<Beach> в классе Beach. Пляжи(Beach) будут использоваться нитями, поэтому позаботьтесь, чтобы все методы были синхронизированы.
Реализовать метод compareTo так, чтобы он при сравнении двух пляжей выдавал число, которое показывает что первый пляж лучше(позитивное число)
или второй пляж лучше (негативное число),и насколько он лучше.


Требования:
1. Класс Beach должен содержать три поля: String name, float distance, int quality.
2. Класс Beach должен реализовывать интерфейс Comparable.
3. Метод compareTo класса Beach как минимум должен учитывать качество пляжа и дистанцию.
4. Все методы класса Beach, кроме метода main, должны быть синхронизированы.
*/

public class Beach implements Comparable<Beach> {
    private String name;      //название
    private float distance;   //расстояние
    private int quality;    //качество

    public Beach(String name, float distance, int quality) {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }

    @Override
    public synchronized int compareTo(Beach o) {
        int result = 0; //итог, 1 - лучше действующий (о) пляж, -1 лучше другой, сравниваемый пляж
        float price = distance/quality;
        float priceTo = o.distance/o.quality;

        result = Float.compare(price,priceTo);


        //ЭТА реализация учитывает по факту, если дальше очка не получил, если качество выше - получил очко ИБО качество необъективный показатель
        //
        /*int resultDistance; //Чем больше дистанция - тем хуже пляж.
        int resultQuality;//Чем выше качество - тем лучше пляж.*/

       /* resultDistance = Float.compare(distance, o.distance);
        System.out.println(" дистанция " + resultDistance);
        resultQuality = Integer.compare(quality, o.quality);
        System.out.println(" качество " + resultQuality);

        if (resultDistance == -1 & (resultQuality == 1 || resultQuality == 0)) result = 1;//если близко, качесво лучше или такое же
        else if (resultDistance == 1 & (resultQuality == 0 || resultQuality == -1)) result = -1; //если далеко и качество такое-же или хуже
        else result = 0;*/

        return result;
    }

    public synchronized String getName() {
        return name;
    }

    public synchronized void setName(String name) {
        this.name = name;
    }

    public synchronized float getDistance() {
        return distance;
    }

    public synchronized void setDistance(float distance) {
        this.distance = distance;
    }

    public synchronized int getQuality() {
        return quality;
    }

    public synchronized void setQuality(int quality) {
        this.quality = quality;
    }

    public static void main(String[] args) {
        System.out.println(" результат " + new Beach("майами",2500,10).compareTo(new Beach("кузнечиха",3,1)));

        System.out.println(" new beach");
        System.out.println();
        Beach beach1 = new Beach("beach1", 123.6f, 7);
        Beach beach2 = new Beach("beach2", 124.6f, 8);
        Beach beach3 = new Beach("beach3", 124.6f, 8);
        System.out.println(" пляж 1 = " + beach1.compareTo(beach1));
        System.out.println();
        System.out.println(" пляж 2 = " + beach1.compareTo(beach3));
        System.out.println();
        System.out.println(" пляж 3 = " + beach2.compareTo(beach3));


    }


}
