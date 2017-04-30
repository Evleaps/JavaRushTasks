package com.javarush.task.task19.task1922НайтиВстречающиесяВСпискеСлова;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader inStream = new BufferedReader(new FileReader(reader.readLine()));
        reader.close();

        String str;
        while ((str = inStream.readLine()) != null) {
            String[] s = str.split(" ");

            int count = 0;
            for (int i = 0; i < s.length; i++) {
                if (words.contains(s[i])) count++;
            }

            if (count == 2) System.out.println(str);
        }
        inStream.close();
    }
}