package com.javarush.task.task15НаследованиеSingletonКонструкторы.task1504АвторИназваниеКниги;

import java.util.LinkedList;
import java.util.List;

/* 
ООП - книги
 Создайте public static класс MarkTwainBook, который наследуется от Book. Имя автора [Mark Twain].!
Параметр конструктора — название книги (title).!
2. В классе MarkTwainBook реализуйте все абстрактные методы.!
3. Для метода getBook измените тип возвращаемого значения на более подходящий.
4. Создайте по аналогии AgathaChristieBook. Имя автора [Agatha Christie].
5. В классе Book реализуйте тело метода getOutputByBookType так, чтобы он возвращал:
5.1. agathaChristieOutput для книг Агаты Кристи;
5.2. markTwainOutput для книг Марка Твена.
*/

public class Solution {
    public static void main(String[] args) {
        //создал лист содержащий книги и название книги
        List<Book> books = new LinkedList<Book>();
        //заполнил объектами, книга тома соера и книга агаты кристи
        books.add(new MarkTwainBook("Tom Sawyer"));
        books.add(new AgathaChristieBook("Hercule Poirot"));
        System.out.println(books);
    }

    //опишем поведение книги
    abstract static class Book {
        //переменная АВТОР
       public String author;
       //конструктор АВТОР
        public Book(String author) {
            this.author = author;
        }// книга и Название книги
        public abstract Book getBook();
        public abstract String getTitle();
//поведение, вывести
        private String getOutputByBookType() {
            //АВТОР +
            String agathaChristieOutput = author + ", " + getBook().getTitle() + " is a detective";
            String markTwainOutput = getBook().getTitle() + " book was written by " + author;
            String output = "output";
            //Add your code here
            if (this instanceof MarkTwainBook) output = markTwainOutput;
            else output = agathaChristieOutput;
            return output;
        }
        public String toString() {//Эсли это убрать, то будет только ссылка на метод, а не такст который он возвращает
            return getOutputByBookType();
        }
    }
    public static class MarkTwainBook extends Book{
        //тут мы говорим, что есть название
        public String title;
        public MarkTwainBook(String title) {
            //автор, мы поменяли author на имя Автора, если бы вернули родит.класс он бы вывел Переданное
            //значение "Tom Sawyer"
            super("Mark Twain");
            this.title = title;
        }

        @Override//Не могу понять зачем, если удалить, норм работает
        public MarkTwainBook getBook() {
            return this;
        }

        @Override
        public String getTitle() {
            return this.title;
        }
    }

    public static class AgathaChristieBook extends Book{
       private String title;
        public AgathaChristieBook(String title) {
            super("Agatha Christie");
            this.title = title;
        }

        @Override
        public AgathaChristieBook getBook() {
            return this;
        }

        @Override
        public String getTitle() {
            return this.title;
        }
    }
}
