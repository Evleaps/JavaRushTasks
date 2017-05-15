package com.javarush.task.task18_Обертки_CrUD_Округление_ПодсчетСимволов.task1826ЭлементарныйШифр;

/* 
Шифровка
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {

        switch (args[0]) {
            case "-e":
                Encruption(args);
                break;
            case "-d":
                Uncruption(args);
                break;
        }
    }

    public static void Encruption(String[] args) throws IOException {
        FileInputStream inStream = new FileInputStream(args[1]);
        FileOutputStream outStream = new FileOutputStream(args[2]);

        while (inStream.available() > 0){
            int data = inStream.read();
            int cipher = data*2;
            outStream.write(cipher);
        }

        inStream.close();
        outStream.close();
    }

    public static void Uncruption(String[] args) throws IOException {
        FileInputStream inStream = new FileInputStream(args[1]);
        FileOutputStream outStream = new FileOutputStream(args[2]);

        while (inStream.available() > 0){
            int data = inStream.read();
            int cipher = data/2;
            outStream.write((char)cipher);
        }
        inStream.close();
        outStream.close();
    }
}
//http://base.vingrad.ru/view/1940-Kriptografiya-v-JAVA
