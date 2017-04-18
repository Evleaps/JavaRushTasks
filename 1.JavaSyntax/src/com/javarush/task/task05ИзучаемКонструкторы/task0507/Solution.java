package com.javarush.task.task05ИзучаемКонструкторы.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();

        double max = 0;
        while (true){
            //double nu = Double.parseDouble(reader.readLine());
            int nu = Integer.parseInt(reader.readLine());
            if (nu!=-1)
            {
                max = nu + max;
                list.add(nu);
            }
            else break;

        }

            double kek = max/list.size();
        System.out.println(kek);

        }

    }

