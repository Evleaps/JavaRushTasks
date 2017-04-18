package com.javarush.task.task08_Data_HashMap_сортировки.task0820Pets_RemoveAll_Cats;

import java.util.HashSet;
import java.util.Set;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> result = new HashSet<Cat>();

        //добавл котов
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        result.add(cat1);
        result.add(cat2);
        result.add(cat3);
        result.add(cat4);


        return result;
    }

    public static Set<Dog> createDogs() {
        //добавил собак
        HashSet<Dog> boxDog = new HashSet<>();
        boxDog.add(new Dog());
        boxDog.add(new Dog());
        boxDog.add(new Dog());
        return boxDog;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        //напишите тут ваш код
        HashSet<Object> pets = new HashSet<Object>();
        pets.addAll(cats);
        pets.addAll(dogs);
        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //удаляем всех котов из pets которые есть в cats
        pets.removeAll(cats);
        }


    public static void printPets(Set<Object> pets) {
        //напишите тут ваш код
        for (Object s:pets)
        System.out.println(s);
    }

    //создал классы
    public static class Cat{
    }
    public static class Dog{
    }
}
