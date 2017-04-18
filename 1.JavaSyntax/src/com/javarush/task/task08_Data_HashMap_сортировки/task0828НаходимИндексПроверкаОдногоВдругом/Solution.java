package com.javarush.task.task08_Data_HashMap_сортировки.task0828НаходимИндексПроверкаОдногоВдругом;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
Используйте коллекции.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       ArrayList<String> array = new ArrayList<>();
            array.add("January");
            array.add("February");
            array.add("March");
            array.add("April");
            array.add("May");
            array.add("June");
            array.add("July");
            array.add("August");
            array.add("September");
            array.add("October");
            array.add("November");
            array.add("December");

            String in = reader.readLine();

            if ((array.contains(in)))//если array содержит in
                System.out.println(in + " is " + (array.indexOf(in)+1) +" month");
    }
}
