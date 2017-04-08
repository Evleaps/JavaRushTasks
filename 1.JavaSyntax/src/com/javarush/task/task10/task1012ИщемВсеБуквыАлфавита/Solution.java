package com.javarush.task.task10.task1012ИщемВсеБуквыАлфавита;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Количество букв
Ввести с клавиатуры 10 строчек и подсчитать в них количество различных букв (для 33 букв алфавита). Вывести результат на экран.

Пример вывода:
а 5
б 8
в 3
г 7
д 0
…
я 9
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }


        //преобразование в 1 строку всего массива list
        String longString ="";
        for (String s: list)
            longString += s;
        //преобразовал строку в массив
        char[] latter = longString.toCharArray();
        //цикл проверяет каждую букву
        for (int i = 0; i < alphabet.size(); i++) {
            int count = 0;
            for (int j = 0; j < latter.length; j++) {
                if (latter[j] == alphabet.get(i))
                    count++;
            }
            System.out.println(alphabet.get(i) +" "+ count);
        }
    }
}
