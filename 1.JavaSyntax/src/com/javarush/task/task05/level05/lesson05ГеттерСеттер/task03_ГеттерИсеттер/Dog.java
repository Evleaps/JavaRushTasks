package com.javarush.task.task05.level05.lesson05ГеттерСеттер.task03_ГеттерИсеттер;

/* Геттеры и сеттеры для класса Dog
Создать class Dog. У собаки должна быть кличка String name и возраст int age.
Создайте геттеры и сеттеры для всех переменных класса Dog.
*/

public class Dog {
    //добавьте тут переменные класса

    private int age;
    private String name;



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

    void say(){
        System.out.println("Гав");
    }
}
 class Main{
    static Dog dog = new Dog();

     public static void main(String[] args)
     {
         dog.setAge(15);
         dog.setName("Бобик");

         System.out.println(dog);
         dog.say();
     }

}
