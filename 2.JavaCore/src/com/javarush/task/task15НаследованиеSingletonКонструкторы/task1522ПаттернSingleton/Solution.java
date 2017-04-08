package com.javarush.task.task15НаследованиеSingletonКонструкторы.task1522ПаттернSingleton;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
Закрепляем Singleton pattern
. Найти пример реализации паттерна Singleton с ленивой реализацией(lazy initialization).
Используй свой любимый поисковик(например google).
2. По образу и подобию в отдельных файлах создай три класса синглтона Sun, Moon, Earth.
3. Реализуй интерфейс Planet в классах Sun, Moon, Earth.
4. В статическом блоке класса Solution вызови метод readKeyFromConsoleAndInitPlanet.
5. Реализуй функционал метода readKeyFromConsoleAndInitPlanet:
5.1. С консоли считай один параметр типа String.
5.2. Если параметр равен одной из констант интерфейса Planet, создай соответствующий объект и присвой его
 Planet thePlanet, иначе обнулить Planet thePlanet.
*/

public class Solution {
    public static void main(String[] args) {}

    public static Planet thePlanet;

    static {
        try {
            readKeyFromConsoleAndInitPlanet();
        } catch (IOException e) {

        }
    }
    //add static block here - добавьте статический блок тут

    public static void readKeyFromConsoleAndInitPlanet() throws IOException {

         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         String read = reader.readLine();

         if (read.equals(Planet.SUN)) thePlanet = Sun.getInstance();
         else if (read.equals(Planet.MOON)) thePlanet = Moon.getInstance();
         else if (read.equals(Planet.EARTH)) thePlanet = Earth.getInstance();
         else thePlanet = null;
    }
}
