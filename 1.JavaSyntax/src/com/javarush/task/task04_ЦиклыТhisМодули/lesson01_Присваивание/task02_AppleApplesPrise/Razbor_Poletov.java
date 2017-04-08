package com.javarush.task.task04_ЦиклыТhisМодули.lesson01_Присваивание.task02_AppleApplesPrise;

/* Реализовать метод addPrice
Реализовать метод addPrice(int applesPrice), чтобы при его вызове суммарная стоимость яблок увеличивалось на переданное значение.
За суммарную стоимость яблок отвечает переменная public static int applesPrice.
*/
public class Razbor_Poletov
{
    public static void main(String[] args) {
        /*Тут объекты которым присвоил значения */
        Apple apple = new Apple();
        Apple.addPrice(50); //прописал параметры в программе
        Apple apple2 = new Apple();
        Apple.addPrice(100);//все они относятся к переменной класса
        Apple apple3 = new Apple();
        Apple.addPrice(150);
        System.out.println("Apples price is " + Apple.applesPrice);//обращаемся "название класса.название переменной"
    }

    public static class Apple{
        public static int applesPrice = 500;//(1) обращаемся "название класса.название переменной"

        public static void addPrice(int applesPrice){ //обращаемся, что хотим установить новое значение переменной класса
            Apple.applesPrice/*новое значение(2)*/= Apple.applesPrice/*старое знач.(1)*/+ applesPrice/*блок main в которых прописаны все параметры*/;


            //ваш войд метод (переменная int x)
            //переменная класса = переменная класса + переменная int x; //обратиться к ***статической*** переменной класса можно через "Название класса".переменная.
        }
    }
}
