package com.javarush.task.task17.task1701НитиВыполняютсяНеСинхронизированно;

import java.util.ArrayList;
import java.util.List;

/* 
Заметки
Асинхронность выполнения нитей.
1. Класс Note будет использоваться нитями.
2. Создай public static нить NoteThread (Runnable не является нитью), которая в методе run 1000 раз
(index = 0-999) сделает следующие действия:
2.1. Используя метод addNote добавит заметку с именем [getName() + «-Note» + index], например, при index=4
«Thread-0-Note4»
2.2. Используя метод removeNote удалит заметку
2.3. В качестве параметра в removeNote передай имя нити — метод getName()


Требования:
1. Класс Solution должен содержать public static класс NoteThread.
2. Класс NoteThread должен быть нитью.
3. В методе run класса NoteThread должен быть цикл.
4. Метод run класса NoteThread должен 1000 раз вызывать метод addNote c параметром (getName() + "-Note" + index).
5. Метод run класса NoteThread должен 1000 раз вызывать метод removeNote c параметром (getName()).
*/

public class Solution {
    public static void main(String[] args) {
        //запустили нити
        new NoteThread().start();
        new NoteThread().start();
    }

    public static class Note {
        public static final List<String> notes = new ArrayList<String>();
        //метод засовывает в лист (см Run) note = "getName() + "-Note" + index"
        public static void addNote(String note) {
            notes.add(0, note);
        }

        public static void removeNote(String threadName) {
            //удаление, сначала проверка, если абы кабы, то ..
            String note = notes.remove(0);
            if (note == null) {
                System.out.println("Другая нить удалила нашу заметку");
            } else if (!note.startsWith(threadName)) {
                System.out.println("Нить [" + threadName + "] удалила чужую заметку [" + note + "]");
            }
        }
    }
    public static class NoteThread extends Thread {
        @Override
        //вызываем методы и передаем параметры
        public void run() {
            for (int index = 0; index <= 999; index++) {
                Note.addNote(getName() + "-Note" + index);
                Note.removeNote(getName());
            }
        }
    }
}
