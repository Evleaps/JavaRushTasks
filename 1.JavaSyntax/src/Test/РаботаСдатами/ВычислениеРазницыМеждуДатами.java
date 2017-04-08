package Test.РаботаСдатами;


import java.util.Date;

public class ВычислениеРазницыМеждуДатами
{
    public static void main(String[] args) throws Exception
    {
        Date currentTime = new Date();           //получаем текущую дату и время
        Thread.sleep(3000);                      //ждём 3 секунды – 3000 миллисекунд ...программа ждет 3 сек
        Date newTime = new Date();               //получаем новое текущее время

        long msDelay = newTime.getTime() - currentTime.getTime(); //вычисляем разницу
        System.out.println("Time distance is: " + msDelay + " in ms");
    }
}
