package com.javarush.task.task17Synchronized_ОкруглениеЧисел_Volatile_CompareTo_CRUD.task1721ЧтениеИзаписьУдалениеОдинакогоКонтентаВФайлах;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
Сделать метод joinData транзакционным, т.е. если произошел сбой, то данные не должны быть изменены.
1. Считать с консоли 2 имени файла
2. Считать построчно данные из файлов. Из первого файла — в allLines, из второго — в forRemoveLines
В методе joinData:
3. Если список allLines содержит все строки из forRemoveLines, то удалить из списка allLines все строки, которые есть в forRemoveLines
4. Если условие из п.3 не выполнено, то:
4.1. очистить allLines от данных
4.2. выбросить исключение CorruptedDataException
Метод joinData должен вызываться в main. Все исключения обработайте в методе main.
Не забудь закрыть потоки.


Требования:
1. Класс Solution должен содержать public static поле allLines типа List.
2. Класс Solution должен содержать public static поле forRemoveLines типа List.
3. Класс Solution должен содержать public void метод joinData() который может бросать исключение CorruptedDataException.
4. Программа должна считывать c консоли имена двух файлов.
5. Программа должна считывать построчно данные из первого файла в список allLines.
6. Программа должна считывать построчно данные из второго файла в список forRemoveLines.
7. Метод joinData должен удалить в списке allLines все строки из списка forRemoveLines, если в allLines содержаться все строки из списка forRemoveLines.
8. Метод joinData должен очистить список allLines и выбросить исключение CorruptedDataException, если в allLines не содержаться все строки из списка forRemoveLines.
9. Метод joinData должен вызываться в main.
*/

public class Solution {
    //создадим листы
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
        //введем имя файлов
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String FileName1 = reader.readLine();
        String FileName2 = reader.readLine();
        reader.close();

//пускаем в работу наш метод
        entryInList(FileName1, allLines);
        entryInList(FileName2, forRemoveLines);


        //т.к. не метод не static, нужно указать откуда взять метод
        new Solution().joinData();

    }

    //метод считывает инфу из файла и добавляет в соответствующий лист
    // метод передаем название файла и название листа, после чего выполняем с этим некие операции
    public static void entryInList(String file, List<String> list) throws IOException {
        //прочитаем файлы
        BufferedReader inStrem = new BufferedReader(new FileReader(file));
        //добаваим файлы в списоки
        String str;
        while ((str = inStrem.readLine()) != null) {
            list.add(str);
        }
        inStrem.close();
    }
//если allLines  содержитВСЕ из forRemoveLines
    //то из ... удалитьВСЕ что содержится в ...
    public void joinData() throws CorruptedDataException, IOException {
        if (allLines.containsAll(forRemoveLines))
            allLines.removeAll(forRemoveLines);
        else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
