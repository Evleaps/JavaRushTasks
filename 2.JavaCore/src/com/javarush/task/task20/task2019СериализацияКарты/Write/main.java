package com.javarush.task.task20.task2019СериализацияКарты.Write;

import com.javarush.task.task20.task2019СериализацияКарты.Load.LoadStack;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Stack;

import static com.javarush.task.task20.task2019СериализацияКарты.Write.Karta.map;


public class main {
    public static void main(String[] args) throws InterruptedException {

        try {
            FileOutputStream fileOutput = new FileOutputStream("C://My programs//Coding//JavaRushTasks//2.JavaCore//src//com//javarush//task//task20//task2019СериализацияКарты//map.txt");
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutput);

            new Karta();
            //сохранил стек!
            outputStream.writeObject(map);

            fileOutput.close();
            outputStream.close();
            System.out.println("Я закончил!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // этот класс в другой папке должен восстановить стек
        new LoadStack();
    }
}
