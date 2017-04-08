package com.javarush.task.task08.task0812СамаяДлиннПоследователЧисел;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }

        int count = 1;
        int max = 1;
        for (int i=0; i<list.size()-1;i++)
        {
            if (list.get(i) == list.get(i + 1))
            {
                count++;
                if (max < count)
                    max = count;
            }
            else
                count=1;
        }
        System.out.println(max);



        /*int max = 0;
        int doo = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j)==list.get(i))
                {
                    doo = doo + 1;
                    if (doo>max) max = doo;
                }
                else if (list.get(j)!=list.get(i)) doo = 0;
            }
        }
        System.out.println(max);*/
    }
}