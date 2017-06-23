package com.javarush.task.task20.task2019СериализацияКарты.Load;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

public class LoadStack {
    public LoadStack() {
        try {
            //loading
            System.out.println("А я начал!");
            FileInputStream fiStream = new FileInputStream("C://My programs//Coding//JavaRushTasks//2.JavaCore//src//com//javarush//task//task20//task2019СериализацияКарты//map.txt");
            ObjectInputStream objectStream = new ObjectInputStream(fiStream);

            //Вылетает ОШИБКА
           // Stack<Karta> load = (Stack<Karta>) objectStream.readObject();
            HashMap<String,String> load = (HashMap<String,String>) objectStream.readObject();

            fiStream.close();
            objectStream.close();

            //Attention!!
            System.out.println(load.size());//ВЕРНО показывает 2
            for (Map.Entry<String, String> e : load.entrySet()) {
                System.out.println(e.getKey() + " " + e.getValue());
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
