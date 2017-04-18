package com.javarush.task.task05ИзучаемКонструкторы.level05ГеттерыСеттеры.lesson07Инициализация.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью инициализаторами:
- Имя,!
- Имя, вес, возраст!
- Имя, возраст (вес стандартный)!
- вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)!
- вес, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным. Например, если вес неизвестен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    //напишите тут ваш код
    private String name;
    private String weight;
    private int age;
    private String color;
    private String adress;

    public void initialize(String name){
        this.name = name;
    }

    public void initialize(String name,int age,String weight){
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public void initialize(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void initialize(String color,String weight){
        this.color = color;
        this.weight = weight;
    }

    public void initialize(String weight,String color, String adress){
        this.weight = weight;
        this.color = color;
        this.adress = adress;
    }



}
