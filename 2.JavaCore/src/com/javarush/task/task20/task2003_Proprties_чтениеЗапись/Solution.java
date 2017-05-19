package com.javarush.task.task20.task2003_Proprties_чтениеЗапись;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/* 
Знакомство с properties
В методе fillInPropertiesMap считайте имя файла с консоли и заполни карту properties данными из файла.
Про .properties почитать тут — http://ru.wikipedia.org/wiki/.properties
Реализуй логику записи в файл и чтения из файла для карты properties.


Требования:
1. Метод fillInPropertiesMap должен считывать данные с консоли.!
2. Метод fillInPropertiesMap должен создавать FileInputStream, передавая считанную строку в качестве параметра.!
3. Метод fillInPropertiesMap должен вызывать метод load передавая только что созданный FileInputStream в качестве параметра.!
4. Метод save должен сохранять карту properties в полученный в качестве параметра объект типа OutputStream.
5. Метод load должен восстанавливать состояние карты properties из полученного в качестве параметра объекта типа InputStream.
*/

/*1. Читаем имя файла в котором лежат наши конфиги
* 2. Отправляем в загрузку, загрузка создает класс Properties в который мы загружаем .load(поток с нашим файлом)
* 3. Заполняем лист данными из класса Properties
* 4. В майне вызываем метод save, он должен сохранить содержимое карты в файл.
* 4.1. Класс Properties отлично добавляет данные методом putAll() и записывает в какай-либо файл методом store()
*
* По большому счеты мы перевели текст из одного файла.txt в другой.txt*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();

    public void fillInPropertiesMap() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        load(inputStream);
        reader.close();
    }

    public void save(OutputStream outputStream) throws Exception {
        Properties propert = new Properties();
        propert.putAll(properties);
        propert.store(outputStream,"");

    }
    //загружает из файла в карту properties
    public void load(InputStream inputStream) throws Exception {
        Properties propert = new Properties();
        propert.load(inputStream);

        Set<String> list = propert.stringPropertyNames();
        for (String empty : list) {
            properties.put(empty, propert.getProperty(empty));
        }
    }

    public static void main(String[] args) throws Exception {
        Solution s = new Solution();
        s.fillInPropertiesMap();
        FileOutputStream outputStream = new FileOutputStream("C://My programs//Coding//JavaRushTasks//2.JavaCore//src//com//javarush//task//task20//task2003_Proprties_чтениеЗапись//save.txt");
        s.save(outputStream);
    }
}