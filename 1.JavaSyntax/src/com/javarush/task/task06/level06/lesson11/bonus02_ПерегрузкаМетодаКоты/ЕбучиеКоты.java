package com.javarush.task.task06.level06.lesson11.bonus02_ПерегрузкаМетодаКоты;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Нужно добавить в программу новую функциональность
Задача: У каждой кошки есть имя и кошка-мама. Создать класс, который бы описывал данную ситуацию. Создать два объекта: кошку-дочь и кошку-маму. Вывести их на экран.
Новая задача: У каждой кошки есть имя, кошка-папа и кошка-мама. Изменить класс Cat так, чтобы он мог описать данную ситуацию.
Создать 6 объектов: дедушку(папин папа), бабушку(мамина мама), папу, маму, сына, дочь.
Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.

Пример ввода:
дедушка Вася
бабушка Мурка
папа Котофей
мама Василиса
сын Мурчик
дочь Пушинка

Пример вывода:
Cat name is дедушка Вася, no mother, no father
Cat name is бабушка Мурка, no mother, no father
Cat name is папа Котофей, no mother, father is дедушка Вася
Cat name is мама Василиса, mother is бабушка Мурка, no father
Cat name is сын Мурчик, mother is мама Василиса, father is папа Котофей
Cat name is дочь Пушинка, mother is мама Василиса, father is папа Котофей
*/

public class ЕбучиеКоты
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        /*String motherName = reader.readLine();
        Cat catMother = new Cat(motherName);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother);

        System.out.println(catMother);
        System.out.println(catDaughter);*/


        String grandParentName = reader.readLine();
        String grandParentWName = reader.readLine();
        String parentMname = reader.readLine();
        String parentWname = reader.readLine();
        String sonName = reader.readLine();
        String daughterName = reader.readLine();

        Cat catGrandParentM = new Cat(grandParentName);// дед, имеет имя
        Cat catGrandParentW = new Cat(grandParentWName);//бабка, имеет имя
        Cat catParentM = new Cat( parentMname,catGrandParentM,null);//батя, имеет имя и деда
        Cat catParentW = new Cat(parentWname ,null,catGrandParentW);//мама, имеет имя и бабку
        Cat catSon = new Cat(sonName, catParentM ,catParentW);//сын, имеет батю и маму
        Cat catDaughter = new Cat(daughterName, catParentM ,catParentW);//доч, имеет маму и папу



        System.out.println(catGrandParentM);
        System.out.println(catGrandParentW);
        System.out.println(catParentM);
        System.out.println(catParentW);
        System.out.println(catSon);
        System.out.print(catDaughter);

/*
        Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
        Имя: Катя, пол: женский, возраст: 55
        Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
*/
    }

    public static class Cat
    {
        private String name;
        private Cat father;
        private Cat mother;

        Cat(String name)
        {
            this.name = name;
        }

        Cat(String name, Cat father,Cat mother)
        {
            this.name = name;
            this.father = father;
            this.mother = mother;
        }

        @Override
        public String toString()
        {
            return "Cat name is " + name +
                    ((mother!=null) ? ", mother is "+ mother.name : ", no mother") +
                    ((father!=null) ? ", father is "+ father.name : ", no father");

        }
    }

}
