package com.javarush.task.task08_Data_HashMap_сортировки.task0819_SetЗасовываемОбъектВмассив;

import java.util.HashSet;
import java.util.Set;

/* 
Set из котов
. Внутри класса ПереставитьОператоры создать public static класс кот – Cat.
2. Реализовать метод createCats, он должен создавать множество (Set) котов и добавлять в него 3 кота.
3. В методе main удалите одного кота из Set cats.
4. Реализовать метод printCats, он должен вывести на экран всех котов, которые остались во множестве.
Каждый кот с новой строки.
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats(); //это мы взывали массив из метода createCats
        //напишите тут ваш код. step 3 - пункт 3
        cats.remove(0);




        printCats(cats);
    }

    public static Set<Cat> createCats() {
        //напишите тут ваш код. step 2 - пункт 2
        Set<Cat> cateyka = new HashSet<>(); //чтобы создать котов, нужно объявить их массив

        Cat cat1 = new Cat();//создаем котов
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();

        cateyka.add(cat1);//добовляем котов
        cateyka.add(cat2);
        cateyka.add(cat3);


        return cateyka; //ы
    }

    public static void printCats(Set<Cat> cats) {
        // step 4 - пункт 4
        for (Cat s : cats) {
            System.out.println(s);
        }
    }

    // step 1 - пункт 1
    public static class Cat{
    }
}
