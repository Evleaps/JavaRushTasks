package com.javarush.task.task15НаследованиеSingletonКонструкторы.task1521ЛегкаяПерегрузка;

public class Tree {
    public static int globalNumber;
    public int number;

    public Tree() {
        //будет вызываться каждый раз, когда вызовут info. А так-же счетчик ++
        this.number = ++globalNumber;
    }

    public void info(Object s) {//Передаваемые значения s
        System.out.println(String.format("Дерево № %d , метод Object, параметр %s", /*%d*/number,
                /*%s*/s.getClass().getSimpleName()));
    }
    public void info(Number s) {//Передаваемые значения s
        System.out.println(String.format("Дерево № %d , метод Number, параметр %s", /*%d*/number,
                /*%s*/s.getClass().getSimpleName()));
    }
    public void info(String s) {//Передаваемые значения s
        System.out.println(String.format("Дерево № %d , метод String, параметр %s", /*%d*/number,
                /*%s*/s.getClass().getSimpleName()));
    }

}
