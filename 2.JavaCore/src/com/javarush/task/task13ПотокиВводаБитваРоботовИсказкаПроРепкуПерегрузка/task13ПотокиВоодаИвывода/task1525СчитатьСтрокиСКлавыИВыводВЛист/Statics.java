package com.javarush.task.task13ПотокиВводаБитваРоботовИсказкаПроРепкуПерегрузка.task13ПотокиВоодаИвывода.task1525СчитатьСтрокиСКлавыИВыводВЛист;

public class Statics {
    public static String FILE_NAME = "C:/My programs/Задачи Java/JavaRushTasks/" +
            "2.JavaCore/src/com/javarush/task/task15НаследованиеSingletonКонструкторы/task1525СчитатьСтрокиСКлавыИВыводВЛист/file.txt";

}

/*Отсюда не работает, нужно в метод отделоьный выносить
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

