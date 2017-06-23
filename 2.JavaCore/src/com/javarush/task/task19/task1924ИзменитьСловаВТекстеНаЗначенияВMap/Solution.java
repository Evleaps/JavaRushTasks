package com.javarush.task.task19.task1924ИзменитьСловаВТекстеНаЗначенияВMap;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
/* Замена чисел
Замена чисел
1. В статическом блоке инициализировать словарь map парами [число-слово] от 0 до 12 включительно.
Например, 0 — «ноль«, 1 — «один«, 2 — «два»
2. Считать с консоли имя файла, считать содержимое файла.
3. Заменить все числа на слова используя словарь map.
4. Результат вывести на экран.
5. Закрыть потоки.

Пример данных в файле:
Это стоит 1 бакс, а вот это - 12 .
Переменная имеет имя file1.
110 - это число.

Пример вывода в консоль:
Это стоит один бакс, а вот это - двенадцать .
Переменная имеет имя file1.
110 - это число.

Требования:
1. Класс Solution должен содержать публичное статическое поле map типа MapClass, которое должно быть сразу проинициализировано.
2. Программа должна считывать имя файла с консоли (используй BufferedReader).
3. BufferedReader для считывания данных с консоли должен быть закрыт.
4. Программа должна считывать содержимое файла (используй FileReader).
5. Поток чтения из файла (FileReader) должен быть закрыт.
6. Программа должна выводить в консоль все строки из файла, но числа должны быть заменены на слова из словаря map.
7. Класс Solution должен содержать статический блок, в котором добавляются в map тринадцать пар.
*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();

    static {
        map.put(0, "ноль");
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(4, "четыре");
        map.put(5, "пять");
        map.put(6, "шесть");
        map.put(7, "семь");
        map.put(8, "восемь");
        map.put(9, "девять");
        map.put(10, "десять");
        map.put(11, "одиннадцать");
        map.put(12, "двенадцать");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader inStream = new BufferedReader(new FileReader(reader.readLine()));

        String str;
        while ((str = inStream.readLine()) != null) {
            for (Map.Entry<Integer, String> entry : map.entrySet()) {
                // \\b - означает границу слова, т.е. мы даем понять, что getKey является всем словом, а не его частью.
                // соотвественно, убрав вторую \\b будет означать, что getKey это начало слова
                str = str.replaceAll(  "\\b" + entry.getKey()+"\\b",entry.getValue());
            }
            System.out.println(str);
        }
        reader.close();
        inStream.close();
    }
}

/*    Медленная реализвация через регулярки и вообще,
всяк решивший это юзать, копрофил!
    String str;
        while ((str = inStream.readLine()) != null) {
            String[] s = str.split(" ");
            for (String e : s) {
                if (e.matches("[1-12]+"))
                    for (int i = map.size()-1; i > 0 ; i--) {
                        e = e.replace(i+"",map.get(i));
                    }
                System.out.print(e + " ");
            }
            System.out.println();
        }*/
