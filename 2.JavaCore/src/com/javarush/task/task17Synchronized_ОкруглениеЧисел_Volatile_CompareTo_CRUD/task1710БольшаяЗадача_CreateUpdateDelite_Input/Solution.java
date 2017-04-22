package com.javarush.task.task17Synchronized_ОкруглениеЧисел_Volatile_CompareTo_CRUD.task1710БольшаяЗадача_CreateUpdateDelite_Input;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
/*
CrUD — Create, Update, Delete

Программа запускается с одним из следующих наборов параметров:
-c name sex bd
-u id name sex bd
-d id
-i id

Значения параметров:
name — имя, String
sex — пол, «м» или «ж», одна буква
bd — дата рождения в следующем формате 15/04/1990
-c — добавляет человека с заданными параметрами в конец allPeople, выводит id (index) на экран
-u — обновляет данные человека с данным id
-d — производит логическое удаление человека с id, заменяет все его данные на null
-i — выводит на экран информацию о человеке с id: name sex (м/ж) bd (формат 15-Apr-1990)
id соответствует индексу в списке

Все люди должны храниться в allPeople
Используйте Locale.ENGLISH в качестве второго параметра для SimpleDateFormat

Пример параметров:
-c Миронов м 15/04/1990

Пример вывода для параметра -і:
Миронов м 15-Apr-1990

Требования:
1. Класс Solution должен содержать public static поле allPeople типа List.
2. Класс Solution должен содержать статический блок, в котором добавляются два человека в список allPeople.
3. При запуске программы с параметром -с программа должна добавлять человека с заданными параметрами в конец списка allPeople, и выводить id (index) на экран.
4. При запуске программы с параметром -u программа должна обновлять данные человека с заданным id в списке allPeople.
5. При запуске программы с параметром -d программа должна логически удалять человека с заданным id в списке allPeople.
6. При запуске программы с параметром -i программа должна выводить на экран данные о человеке с заданным id по формату указанному в задании.
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        //свитч ищет совпадения в переданном аргументе.
        String argument = args[0];
        switch (argument) {
            case "-c":
                Create(args[1], args[2], args[3]);
                break;
            case "-u":
                Update(args[1], args[2], args[3], args[4]);
                break;
            case "-d":
                Delite(args[1]);
                break;
            case "-i":
                input(args[1]);
            default:
        }

    }

    public static void Create(String name, String sex, String date) throws ParseException {
        Date newFormat = new SimpleDateFormat("dd/MM/yyyy").parse(date);
        allPeople.add(sex.equals("м") ? Person.createMale(name, newFormat) : Person.createFemale(name, newFormat));
        System.out.println(allPeople.size() - 1);
    }

    public static void Update(String id, String name, String sex, String date) throws ParseException {
        Date newFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(date);
        Person person = allPeople.get(Integer.parseInt(id));
        person.setBirthDay(newFormat);
        person.setName(name);
        person.setSex(sex.equals("м") ? Sex.MALE : Sex.FEMALE);
    }

    public static void Delite(String id) {
        //логическое удаление, удалять именно строку из списка не нужно.
        Person person = allPeople.get(Integer.parseInt(id));
        person.setBirthDay(null);
        person.setSex(null);
        person.setName(null);
    }

    public static void input(String id) throws ParseException {
        Person person = allPeople.get(Integer.parseInt(id));
        SimpleDateFormat date = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        String gender = person.getSex() == Sex.MALE ? "м" : "ж";
        System.out.println(person.getName() + " " + gender +" " + date.format(person.getBirthDay()));
    }
}
