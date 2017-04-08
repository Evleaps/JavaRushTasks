package com.javarush.task.task07.task0712КакаяСтрочкаПерваяДлиннИлиКороткая;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
 Создай список строк.
2. Добавь в него 10 строчек с клавиатуры.
3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
Если таких строк несколько, то должны быть учтены самые первые из них.
4. Выведи на экран строку из п.3.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }
        //блок находит минимум и максимум слова
        int max = 0;
        int min = list.get(0).length();//равно длине первого слова
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() > max)
                max = list.get(i).length();
            else if (list.get(i).length() < max & list.get(i).length() < min)
                min = list.get(i).length();
        }
            //находим что появится раньше
            for (int j = 0; j < list.size(); j++) {

                if (list.get(j).length() == max) {
                    System.out.println(list.get(j));
                    break;
                }
                else if (list.get(j).length() == min){
                    System.out.println(list.get(j));
                    break;
                }


        }
    }
}
