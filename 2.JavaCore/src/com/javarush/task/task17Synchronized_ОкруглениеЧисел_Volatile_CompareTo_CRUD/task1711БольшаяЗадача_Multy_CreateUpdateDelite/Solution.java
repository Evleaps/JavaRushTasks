package com.javarush.task.task17Synchronized_ОкруглениеЧисел_Volatile_CompareTo_CRUD.task1711БольшаяЗадача_Multy_CreateUpdateDelite;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/*
CRUD 2
CrUD Batch - multiple Creation, Updates, Deletion

Программа запускается с одним из следующих наборов параметров:
-c name1 sex1 bd1 name2 sex2 bd2 ...
-u id1 name1 sex1 bd1 id2 name2 sex2 bd2 ...
-d id1 id2 id3 id4 ...
-i id1 id2 id3 id4 ...
Значения параметров:
name - имя, String
sex - пол, "м" или "ж", одна буква
bd - дата рождения в следующем формате 15/04/1990
-с - добавляет всех людей с заданными параметрами в конец allPeople, выводит id (index) на экран в соответствующем порядке
-u - обновляет соответствующие данные людей с заданными id
-d - производит логическое удаление человека с id, заменяет все его данные на null
-i - выводит на экран информацию о всех людях с заданными id: name sex bd

id соответствует индексу в списке
Формат вывода даты рождения 15-Apr-1990
Все люди должны храниться в allPeople
Порядок вывода данных соответствует вводу данных
Обеспечить корректную работу с данными для множества нитей (чтоб не было затирания данных)
Используйте Locale.ENGLISH в качестве второго параметра для SimpleDateFormat

Пример вывода для параметра -і с двумя id:
Миронов м 15-Apr-1990
Миронова ж 25-Apr-1997
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
                synchronized (allPeople) {
                    Create(args);
                    break;
                }
            case "-u":
                synchronized (allPeople) {
                    Update(args);
                    break;
                }
            case "-d":
                synchronized (allPeople) {
                    Delite(args);
                    break;
                }
            case "-i":
                synchronized (allPeople) {
                    Input(args);
                    break;
                }
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