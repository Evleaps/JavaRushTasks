package com.javarush.task.task19.task1921ФИО_ДатаРождения;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
/* 
Хуан Хуанович
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя день месяц год
где [имя] — может состоять из нескольких слов, разделенных пробелами, и имеет тип String.
[день] — int, [месяц] — int, [год] — int
данные разделены пробелами.

Заполнить список PEOPLE используя данные из файла.
Закрыть потоки.

Пример входного файла:
Иванов Иван Иванович 31 12 1987
Вася 15 5 2013


Требования:
1. Класс Solution должен содержать публичную константу PEOPLE типа List, которая должна быть сразу проинициализирована.
2. Программа НЕ должна считывать данные с консоли.
3. Программа должна считывать содержимое файла (используй FileReader).
4. Поток чтения из файла (FileReader) должен быть закрыт.
5. Программа должна заполнить список PEOPLE данными из файла.
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        String str;
        while ((str = reader.readLine()) != null) {
            String[] s = str.split(" ");

            String name = s[0];
            for (int i = 1; i < s.length - 3; i++) {
                name = name + " " + s[i];
            }

            String day = (s[s.length - 3]) + " " + (s[s.length - 2]) + " " + (s[s.length-1]);
            SimpleDateFormat format = new SimpleDateFormat("dd MM yyyy", Locale.ENGLISH);
            Date date = format.parse(day);

            PEOPLE.add(new Person(name,date));
        }
        reader.close();

        for (Person p : PEOPLE) {
            System.out.println(p.getName() + " " + p.getBirthday());
        }
    }
}
