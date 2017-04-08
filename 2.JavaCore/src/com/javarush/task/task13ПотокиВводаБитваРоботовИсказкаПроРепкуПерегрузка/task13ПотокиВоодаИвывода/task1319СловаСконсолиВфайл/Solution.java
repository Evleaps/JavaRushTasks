package com.javarush.task.task13ПотокиВводаБитваРоботовИсказкаПроРепкуПерегрузка.task13ПотокиВоодаИвывода.task1319СловаСконсолиВфайл;

import java.io.*;

/* 
Запись в файл с консоли
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку «exit«.
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter write = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(reader.readLine())));

        while(true){
            String s = reader.readLine();
            if(s.equals("exit")) break;
            write.write(s);
            write.newLine();
        }

        reader.close();
        write.close();
    }
}

/*ЕЩЕ ОДИН АБСОЛЮТНО ЗДОРОВЫЙ КОД
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
BufferedWriter writer = new BufferedWriter((new FileWriter("C://My programs/Задачи Java/JavaRushTasks/2.JavaCore/src/com/javarush/task/task13ПотокиВводаБитваРоботовИсказкаПроРепкуПерегрузка/task1319СловаСконсолиВфайл/textYoba.txt")));

            while (true){
                String s = reader.readLine();
                writer.write(s);
                if (s.equals("exit"))break;
                writer.newLine();
            }
        reader.close();
        writer.close();
    }*/

/*// РАБОЧИЙ КОД, НО РАША СКАЗАЛ ЧТО Я ВСЕ СЛОМАЛ, ННЕЛЬЗЯ ТАК:)
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        //создал экземпляр файла
        File file = new File("fileName");
        String s;
         while (true)
         {
             s = reader.readLine();
             if (s.equals("exit")) break;
             else list.add(s);
         }


        //проверка, существует ли файл, если нет - создаем
         if (!file.exists()) file.createNewFile();

         //метод для записи в файл
        PrintWriter out = new PrintWriter(file.getAbsoluteFile());
        for (int i = 0; i < list.size(); i++) {
            //записываем в файл содержимое листа
            out.println(list.get(i));
        }
        //закрываем потоки
        out.close();
        reader.close();

    }*/
