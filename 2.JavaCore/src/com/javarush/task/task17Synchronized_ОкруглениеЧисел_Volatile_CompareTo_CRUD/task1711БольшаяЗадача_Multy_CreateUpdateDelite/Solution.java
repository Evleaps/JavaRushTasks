package com.javarush.task.task17Synchronized_ОкруглениеЧисел_Volatile_CompareTo_CRUD.task1711БольшаяЗадача_Multy_CreateUpdateDelite;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/*
-c Имя1 м 15/11/1996 Имя2 ж 18/12/1997 Имя3 ж 12/12/1974
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {

        switch (args[0]) {
            case "-c":
                synchronized (allPeople) {Create(args);break;}
            case "-u":
                synchronized (allPeople) {Update(args);break;}
            case "-d":
                synchronized (allPeople) {Delite(args);break;}
            case "-i":
                synchronized (allPeople) {Input(args);break;}
        }
    }




    public static void Create(String[] args) throws ParseException {
        int count = 1;
        while (true) {
            Date date = new SimpleDateFormat("dd/MM/yyyy").parse(args[count + 2]);
            allPeople.add(args[count + 1].equals("м") ? Person.createMale(args[count], date) : Person.createFemale(args[count], date));
            System.out.println(allPeople.size() - 1);
            try {
                if (args[count + 4] != null)
                    count = count + 3;
            } catch (ArrayIndexOutOfBoundsException e) {
                break;
            }
        }
    }



    public static void Update(String[] args) throws ParseException {
        int countU = 1;
        while (true) {
            Date date = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[countU + 3]);
            Person person = allPeople.get(Integer.parseInt(args[countU]));
            person.setBirthDay(date);
            person.setName(args[countU + 1]);
            person.setSex(args[countU + 2].equals("м") ? Sex.MALE : Sex.FEMALE);
            try {
                if (args[countU + 5] != null)
                    countU = countU + 4;
            } catch (ArrayIndexOutOfBoundsException e) {
                break;
            }
        }
    }



    public static void Delite(String[] args) throws ParseException {
        int countD = 1;
        while (true) {
            Person person = allPeople.get(Integer.parseInt(args[countD]));
            person.setSex(null);
            person.setName(null);
            person.setBirthDay(null);
            try {
                if (args[countD + 1] != null)
                    countD++;
            } catch (ArrayIndexOutOfBoundsException e) {
                break;
            }
        }
    }



    public static void Input(String[] args) throws ParseException {
        int countI = 1;
        while (true) {
            Person person = allPeople.get(Integer.parseInt(args[countI]));
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
            String date = dateFormat.format(person.getBirthDay());
            String gender = person.getSex() == Sex.MALE ? "м" : "ж";
            System.out.println(person.getName() + " " + gender + " " + date);
            try {
                if (args[countI + 1] != null)
                    countI++;
            } catch (ArrayIndexOutOfBoundsException e) {
                break;
            }
        }
    }
}

