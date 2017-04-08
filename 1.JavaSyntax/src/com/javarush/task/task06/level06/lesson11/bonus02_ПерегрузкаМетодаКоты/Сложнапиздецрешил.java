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

public class Сложнапиздецрешил
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandParentName = reader.readLine();
        String grandParentWName = reader.readLine();
        String parentMname = reader.readLine();
        String parentWname = reader.readLine();
        String sonName = reader.readLine();
        String daughterName = reader.readLine();

        Cat catGrandParentM = new Cat(grandParentName);// дед, имеет имя
        Cat catGrandParentW = new Cat(grandParentWName);//бабка, имеет имя
        Cat catParentM = new Cat( catGrandParentM,parentMname,null);//батя, имеет имя и деда
        Cat catParentW = new Cat(null ,parentWname,catGrandParentW);//мама, имеет имя и бабку
        Cat catSon = new Cat(sonName, catParentM ,catParentW);//сын, имеет батю и маму
        Cat catDaughter = new Cat(daughterName, catParentM ,catParentW);//доч, имеет маму и папу



        System.out.println(catGrandParentM);
        System.out.println(catGrandParentW);
        System.out.println(catParentM);
        System.out.println(catParentW);
        System.out.println(catSon);
        System.out.print(catDaughter);
    }

    public static class Cat
    {
        private String name;
        private Cat catParentM;
        private Cat catParentW;
        private Cat catGrandParentM;
        private Cat catGrandParentW;

        Cat(String name)
        {
            this.name = name;
        }


        Cat( Cat catGrandParentM,String name, Cat catGrandParentW )
        {
            this.catGrandParentM = catGrandParentM;
            this.catGrandParentW = catGrandParentW;
            this.name = name;

        }

        Cat(String name, Cat catParentM ,Cat catParentW)
        {
            this.name = name;
            this.catParentM = catParentM;
            this.catParentW = catParentW;
        }



        @Override
        public String toString()
        {
            if (catGrandParentW==null & catGrandParentM == null & catParentM == null & catParentW == null)
                return "Cat name is " + name + ", no mother, no father";

            if (catParentW==null & catParentM==null & catGrandParentW==null)
                return "Cat name is " + name + ", no mother, father is" + catGrandParentM.name;
            if (catParentW==null & catParentM==null & catGrandParentM==null)
                return "Cat name is " + name + ", mother is " + catGrandParentW.name + ", no father";
            else
                return "Cat name is " + name + ", mother is " + catParentW.name + ", father is" + catParentM.name;
        }


    }

}
