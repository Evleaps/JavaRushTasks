package com.javarush.task.task05ИзучаемКонструкторы.task0508;

/* 
Геттеры и сеттеры для класса PersonСоздать class Person.
 человека должно быть имя String name, возраст int age, пол char sex.
Создайте геттеры и сеттеры для всех переменных класса Person.
*/

public class Person {
    //напишите тут ваш ко
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    int age;
    char sex;

    public static void main(String[] args) {

    }
}
