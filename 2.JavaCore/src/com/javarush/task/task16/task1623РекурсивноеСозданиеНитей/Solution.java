package com.javarush.task.task16.task1623РекурсивноеСозданиеНитей;

/* 
Рекурсивное создание нитей
1. Измени класс GenerateThread так, чтобы он стал нитью.
2. Создай конструктор GenerateThread, который должен:
2.1. Вызвать конструктор суперкласса с параметром String — номером созданной нити. Используй countCreatedThreads.
2.2. Запустить текущую нить.
2.3. Номер первой нити должен начинается с 1.
3. Переопредели метод toString, для этого внутри GenerateThread нажми Alt+Insert -> Override Methods.
 Начни печатать toString.
3.1. Метод toString должен возвращать № текущей нити и слово « created«. Используй getName().

Пример: «8 created»

4. Пока количество созданных нитей меньше Solution.count метод run должен:
4.1. Создавать новую нить типа GenerateThread.
4.2. Выводить в консоль созданную в пункте 4.1. нить.
5. В итоге должно быть выведено в консоль 15 строк.


Требования:
1. Класс GenerateThread должен быть унаследован от Thread.
2. В классе GenerateThread должен быть открытый конструктор без параметров.
3. Конструктор класса GenerateThread должен увеличивать значение countCreatedThreads и
 передавать его в виде строки в конструктор суперкласса.
4. Конструктор класса GenerateThread должен запускать нить.
5. Метод toString класса GenerateThread должен возвращать имя нити и слово " created". Пример: "8 created".
6. Если количество созданных нитей меньше Solution.count, метод run должен создать новую нить типа GenerateThread.
7. Если количество созданных нитей меньше Solution.count, метод run должен вывести созданную нить в консоль.
8. Вывод программы должен соответствовать заданию, показывать, что все 15 нитей были созданы.
*/

public class Solution {
    //есть две переменные, одна равна 15, другая 0
    static int count = 15;
    static volatile int countCreatedThreads ;

    //мейны выводит класс
    public static void main(String[] args) {
        System.out.println(new GenerateThread());
    }

    //прога идет сюда, и видит что это нить.
    public static class GenerateThread extends Thread {
        //toString определяет вывод на экран
        @Override
        public String toString() {
            return getName() + " created";
        }

        public GenerateThread() {
            //тут мы задаем, а что же у нас будет getName, тк имя у нас String
            // сначала преабразуем в строку, потом скажем, что она равна 1
            super(String.valueOf(++countCreatedThreads));
            //запустим нить в работу, включим run
            start();
        }

        @Override
        public void run() {
            //run включился, а тут условие, если меньше, то создать себя же еще раз!
            //а тут рекурсия, ибо опять toString, опять ++, опять если условие не выполнено, создать нить
            if (countCreatedThreads < count)
                System.out.println(new GenerateThread());
        }





    }
}
