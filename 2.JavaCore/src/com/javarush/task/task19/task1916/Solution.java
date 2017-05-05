package com.javarush.task.task19.task1916;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
см условие
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader1 = new BufferedReader(new FileReader(reader.readLine()));
        BufferedReader reader2 = new BufferedReader(new FileReader(reader.readLine()));
        sorted1(reader1, reader2);
        reader.close();

        for (LineItem e : lines) {
            System.out.println(e.type + " " + e.line);
        }
        reader1.close();
        reader2.close();
    }

    public static void sorted1(BufferedReader reader1, BufferedReader reader2) throws IOException {
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        while (reader1.ready()) {
            list1.add(reader1.readLine());
        }
        while (reader2.ready()) {
            list2.add(reader2.readLine());
        }

        int f1 = 0;
        int f2 = 0;

        while (list1.size() > f1 && list2.size() > f2) {
            //Если значения равны
            if (list1.get(f1).equals(list2.get(f2))) {
                lines.add(new LineItem(Type.SAME, list1.get(f1)));
                f1++;
                f2++;
            }//если в первом файле существует след.строка и эта след.строка равна текущей во втором файле
            else if (list1.size() > f1 + 1 && list1.get(f1 + 1).equals(list2.get(f2))) {
                lines.add(new LineItem(Type.REMOVED, list1.get(f1)));
                f1++;
            }//если во втором файле существует след.строка и эта след.строка равна текущей в первом файле
            else if (list2.size() > f2 + 1 && list2.get(f2 + 1).equals(list1.get(f1))) {
                lines.add(new LineItem(Type.ADDED, list2.get(f2)));
                f2++;
            }
        }
        for (int k = f2; k < list2.size(); k++) {
            lines.add(new LineItem(Type.ADDED, list2.get(k)));
        }
        for (int k = f1; k < list1.size(); k++) {
            lines.add(new LineItem(Type.REMOVED, list1.get(f1)));
        }
    }

    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
/*                                               ТОЖЕ НОРМАЛЬНЫЙ РАБОЧИЙ КОД
         int j = 0;
        for (int i = 0; i < list1.size(); i++) {
            try {//если строки равны, лист2 по величине такой же как лист1, иначе, если он меньше, значит из 1-го удалили строки(см кетч1)
                if (list1.get(i).equals(list2.get(j))) {
                    lines.add(new LineItem(Type.SAME, list1.get(i)));
                    j++;
                } else {//если не равны, то если след строка в 2 списке существует, то значит добавили строку
                    try {//если j+1 не существует, а в лист 1 строка была, значит ее удалили.
                        if (list1.get(i).equals(list2.get(j + 1))) {
                            lines.add(new LineItem(Type.ADDED, list2.get(j)));
                            j++;
                            i--;
                        } else//если след строка не равна нужной, т.е. ее нет в списке вообще, значит удалили
                            lines.add(new LineItem(Type.REMOVED, list1.get(i)));
                    } catch (IndexOutOfBoundsException e) {
                        lines.add(new LineItem(Type.REMOVED, list1.get(i)));
                        break;
                    }
                }
            } catch (IndexOutOfBoundsException e) {//кетч1
                lines.add(new LineItem(Type.REMOVED, list1.get(i)));
            }
        }
//т.к. 2 список может быть больше, это значит в него добавили много строк, отобразим это
        for (int k = j; k < list2.size(); k++) {
            lines.add(new LineItem(Type.ADDED, list2.get(k)));
        }*/