package com.javarush.task.task18_Обертки_CrUD_Округление_ПодсчетСимволов.task1815ОберткаИнтерфейса;

import java.util.List;

/* 
Таблица
Измени класс TableInterfaceWrapper так, чтобы он стал Wrapper-ом для ATableInterface.
Метод setModel должен вывести в консоль количество элементов в новом листе перед обновлением модели.
Метод getHeaderText должен возвращать текст в верхнем регистре — используйте метод toUpperCase().

Требования:
1. Класс TableInterfaceWrapper должен реализовывать интерфейс ATableInterface.
2. Класс TableInterfaceWrapper должен инициализировать в конструкторе поле типа ATableInterface.
3. Метод setModel() должен вывести в консоль количество элементов в новом листе перед обновлением модели.
4. Метод getHeaderText() должен возвращать текст в верхнем регистре.
5. Метод setHeaderText() должен устанавливать текст для заголовка без изменений.
*/

public class Solution {
    public class TableInterfaceWrapper implements ATableInterface {
        private ATableInterface original;

        public TableInterfaceWrapper(ATableInterface original) {
            this.original = original;
        }

        @Override
        public void setModel(List rows) {
            System.out.println(rows.size());
            this.original.setModel(rows);
        }

        @Override
        public String getHeaderText() {
            return this.original.getHeaderText().toUpperCase();
        }

        @Override
        public void setHeaderText(String newHeaderText) {
            this.original.setHeaderText(newHeaderText);
        }
    }

    public interface ATableInterface {
        void setModel(List rows);

        String getHeaderText();

        void setHeaderText(String newHeaderText);
    }

    public static void main(String[] args) {
    }
}