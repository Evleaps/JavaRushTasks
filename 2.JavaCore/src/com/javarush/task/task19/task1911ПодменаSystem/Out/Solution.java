package com.javarush.task.task19.task1911ПодменаSystem.Out;

/* 
Ридер обертка
В методе main подмени объект System.out написанной тобой ридер-оберткой по аналогии с лекцией.
Твоя ридер-обертка должна преобразовывать весь текст в заглавные буквы.
Вызови готовый метод printSomething(), воспользуйся testString.
Верни переменной System.out первоначальный поток.
Выведи модифицированную строку в консоль.


Требования:
1. Класс Solution должен содержать класс TestString.
2. Класс Solution должен содержать публичное статическое поле testString типа TestString, которое сразу проинициализировано.
3. Класс TestString должен содержать публичный void метод printSomething().
4. Метод printSomething() класса TestString должен выводить на экран строку "it's a text for testing".
5. Метод main(String[] args) класса Solution должен создавать поток PrintStream (используй PrintStream c параметром конструктора ByteArrayOutputStream).
6. Метод main(String[] args) класса Solution должен подменять и восстанавливать поток вывода в консоль объекта System.out.
7. Метод main(String[] args) класса Solution должен вызывать метод printSomething(),объекта testString.
8. Метод main(String[] args) класса Solution должен модифицировать строку выведенную методом printSomething() согласно заданию, и выводить её в консоль
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        //запоминаем настоящий printStream
        PrintStream consoleStream = System.out;


        ByteArrayOutputStream  outputStream = new ByteArrayOutputStream();
        //создал адаптер для printStream
        PrintStream stream = new PrintStream(outputStream);
        //Установить как текущий Sysrem.out
        System.setOut(stream);

        testString.printSomething(); //вместо вывода, наш sout записал в ByteArray данные

        //Преобразовываем записанные в наш ByteArray данные в строку
        String result = outputStream.toString();
        //изменим данные как хотим
        StringBuilder stringBuilder = new StringBuilder(result);
        String UpperString = stringBuilder.toString().toUpperCase();
        //возвращаем system.in как было
        System.setOut(consoleStream);

        //вместо вывода, мы записали в массив. Изменили строку, потом вернули sustem.out и сейчас вызовем модифицированную строку.
        System.out.println(UpperString);



    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
