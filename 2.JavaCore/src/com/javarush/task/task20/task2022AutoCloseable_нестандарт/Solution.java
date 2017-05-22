package com.javarush.task.task20.task2022AutoCloseable_нестандарт;

import java.io.*;

/* 
Переопределение сериализации в потоке
Сериализация/десериализация Solution не работает.
Исправь ошибки не меняя сигнатуры методов и класса.
Метод main не участвует в тестировании.

Написать код проверки самостоятельно в методе main:
1) создать экземпляр класса Solution
2) записать в него данные — writeObject
3) сериализовать класс Solution — writeObject(ObjectOutputStream out)
4) десериализовать, получаем новый объект
5) записать в новый объект данные — writeObject
6) проверить, что в файле есть данные из п.2 и п.5


Требования:
1. Поле stream должно быть объявлено с модификатором transient.
2. В методе writeObject(ObjectOutputStream out) не должен быть вызван метод close у потока полученного в качестве параметра.
3. В методе readObject(ObjectInputStream in) не должен быть вызван метод close у потока полученного в качестве параметра.
4. В методе readObject(ObjectInputStream in) поле stream должно быть инициализировано новым объектом типа FileOutputStream с параметрами(fileName, true).
5. В конструкторе класса Solution поле stream должно быть инициализировано новым объектом типа FileOutputStream с параметром(fileName).
*/
public class Solution implements Serializable, AutoCloseable {
    transient private FileOutputStream stream;
    String filename;

    public Solution(String fileName) throws FileNotFoundException {
        this.stream = new FileOutputStream(fileName);
        this.filename = fileName;
    }

    public void writeObject(String string) throws IOException {
        stream.write(string.getBytes());
        stream.write("\n".getBytes());
        stream.flush();
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
       // out.close();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        stream = new FileOutputStream(this.filename,true);
     //   in.close();
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing everything!");
        stream.close();
    }

    public static void main(String[] args) throws Exception {
        Solution solution = new Solution("d:/1.txt");
        solution.writeObject("Плоха та страна, в которой и в мирное время есть герои");
        solution.close();

        FileOutputStream fos = new FileOutputStream("d:/1.txt");
        ObjectOutputStream outputStream = new ObjectOutputStream(fos);
        outputStream.writeObject(solution);
        fos.close();
        outputStream.close();

        FileInputStream fis = new FileInputStream("d:/1.txt");
        ObjectInputStream inputStream = new ObjectInputStream(fis);

        Solution loadObj = (Solution) inputStream.readObject();
        inputStream.close();
        fis.close();
    }
}
