package com.javarush.task.task13ПотокиВводаБитваРоботовИсказкаПроРепкуПерегрузка.task13ПотокиВоодаИвывода.task1525СчитатьСтрокиСКлавыИВыводВЛист;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* 
Файл в статическом блоке
1. Инициализируй переменную Statics.FILE_NAME полным путем к файлу с данными, который содержит несколько строк.
2. В статическом блоке считай из файла с именем Statics.FILE_NAME все строки и добавь их по-отдельности в List lines.
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();

    static {
        try( BufferedReader reader = new BufferedReader(new FileReader(Statics.FILE_NAME));)
        {
            String str;
            while ((str = reader.readLine()) != null )
                Solution.lines.add(str);
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }

     /* ЛИБО, тоже отличный вариант
      try {
            Scanner scanner = new Scanner(new FileInputStream(FILE_NAME));

            while (scanner.hasNext()) {
                String data = scanner.nextLine();
                Solution.lines.add(data);
                System.out.println(data);
                scanner.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }*/

    public static void main(String[] args){
        System.out.println(lines);

    }
}
