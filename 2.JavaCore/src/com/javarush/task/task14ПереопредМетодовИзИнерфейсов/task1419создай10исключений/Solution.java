package com.javarush.task.task14ПереопредМетодовИзИнерфейсов.task1419создай10исключений;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Нашествие исключений
Заполни список exceptions десятью(10) различными исключениями.
Первое исключение уже реализовано в методе initExceptions.
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) throws IOException {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() throws IOException {   //it's first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            int[] i3 = new int[4];
            for (int i = 0; i < 5; i++) {
                i3[i] = i+1;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            exceptions.add(e);
        }
        try {
            String kek4 = "c:dfd";
            InputStream inputStreamReader = new FileInputStream(kek4);

        } catch (FileNotFoundException e) {
            exceptions.add(e);
        }

        try {
            Object[] objArr = new Object[2];
            objArr[0] = "kek5";
            objArr[1] = 1;
            objArr[1] = true;
            String [] strArr = Arrays.copyOf(objArr, objArr.length, String[].class);
        } catch (ArrayStoreException e) {
            exceptions.add(e);
        }
        try {
            ArrayList<String> list = new ArrayList<String>();
            ArrayList<String> spisok = new ArrayList<String>();
            int longest = list.get(0).length();
            for (int i = 0; i < list.size(); i++)
            {
                if (longest < list.get(i).length())
                {
                    longest = list.get(i).length();
                    spisok.add(list.get(i));
                    for (int j = 0; j < spisok.size(); j++)
                    {
                        if (spisok.get(j).length() < list.get(i).length())
                            spisok.remove(j);
                        else
                        {}
                    }
                }
                else {}
            }

        } catch (IndexOutOfBoundsException e) {
            exceptions.add(e);
        }
        try {
            int[] kek6 = new int[-1];
        } catch (NegativeArraySizeException e) {
            exceptions.add(e);
        }

        try {

        } catch (ArrayStoreException e) {
            exceptions.add(e);
        }

        Object ch = new Character('*');
        try {
            System.out.println((Byte)ch);
        } catch(Exception e) {
            exceptions.add(e);
        }


        int[] nNulArray = new int[5];
        nNulArray = null;
        try {
           int i = nNulArray.length;
        } catch(Exception e) {
            exceptions.add(e);
        }


        String szShortString = "123";
        try {
            char chr = szShortString.charAt(10);
        } catch(Exception e) {
            exceptions.add(e);
        }

        try {
            throw new SecurityException();
        } catch (SecurityException e) {
            exceptions.add(e);
        }



    }
}


        //напишите тут ваш код



