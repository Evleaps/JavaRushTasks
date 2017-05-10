package com.javarush.task.task20.task2000СохранениеМассиваОбъектов;

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        class Cat {
            public String name;
            public int age;
            public int weight;

            public void save(OutputStream outputStream) throws Exception {
                PrintWriter printWriter = new PrintWriter(outputStream);
                printWriter.println(name);
                printWriter.println(age);
                printWriter.println(weight);
                printWriter.flush();
            }

            public void load(InputStream inputStream) throws Exception {
                BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
                name = reader.readLine();
                age = Integer.parseInt(reader.readLine());
                weight = Integer.parseInt(reader.readLine());
            }
        }

        class Dog {
            public String name;
            public int age;

            public void save(OutputStream outputStream) throws Exception {
                PrintWriter printWriter = new PrintWriter(outputStream);
                printWriter.println(name);
                printWriter.println(age);
                printWriter.flush();
            }

            public void load(InputStream inputStream) throws Exception {
                BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
                name = reader.readLine();
                age = Integer.parseInt(reader.readLine());
            }
        }

        class Human {
            public Cat cat;
            public Dog dog;

            public void save(OutputStream outputStream) throws Exception {
                PrintWriter writer = new PrintWriter(outputStream);

                String isCatPresent = cat != null ? "yes" : "no";
                writer.print(isCatPresent);

                if (cat != null)
                    cat.save(outputStream);

                String isDogPresent = dog != null ? "yes" : "no";
                writer.print(isDogPresent);

                if (dog != null)
                    dog.save(outputStream);
            }

            public void load(InputStream inputStream) throws Exception {
                BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

                String isCatPresent = reader.readLine();
                if (isCatPresent.equals("yes")) {
                    cat = new Cat();
                    cat.load(inputStream);
                }

                String isDogPresent = reader.readLine();
                if (isDogPresent.equals("yes")) {
                    dog = new Dog();
                    dog.load(inputStream);
                }
            }
        }
    }
}
