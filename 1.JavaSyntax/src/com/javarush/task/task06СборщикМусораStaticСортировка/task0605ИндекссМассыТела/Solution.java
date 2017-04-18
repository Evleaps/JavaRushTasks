package com.javarush.task.task06СборщикМусораStaticСортировка.task0605ИндекссМассыТела;


import java.io.*;

/* 
Контролируем массу тела
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(bis.readLine());
        double height = Double.parseDouble(bis.readLine());

        Body.massIndex(weight, height);
    }

    public static class Body {
        public static void massIndex(double weight, double height) {
            //напишите тут ваш код
            double index = weight/Math.pow(height, 2);
            if (index<18.5) System.out.println("Недовес: меньше чем 18.5");
            if (index>18.5 & index<24.9) System.out.println("Нормальный: между 18.5 и 24.9");
            if (index>24.9 & index<29.9) System.out.println("Избыточный вес: между 25 и 29.9");
            if (index>=30) System.out.println("Ожирение: 30 или больше");
        }
    }
}
