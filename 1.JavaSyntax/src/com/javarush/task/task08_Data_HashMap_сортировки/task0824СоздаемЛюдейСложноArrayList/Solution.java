package com.javarush.task.task08_Data_HashMap_сортировки.task0824СоздаемЛюдейСложноArrayList;

/* 
Собираем семейство
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human children1 =new Human("Петя",true,12,null);//ребенок, у него нет детей
        Human children2 =new Human("Кирилл",true,12,null);//ребенок, у него нет детей
        Human children3 =new Human("Вася",true,12,null);//ребенок, у него нет детей
        Human father = new Human("Анатолий",true,47,children1,children2,children3);//и у мамы 3 сына
        Human mother = new Human("Надежда",false,40,children1,children2,children3);//у бати 3 сына
        Human grandFatherM = new Human("Николай", true,77,father);//есть ребенок, папа(анатолий)
        Human grandFatherW = new Human("Рая", false,66,mother);//есть ребенок, мама(надежда)
        Human grandMotherM = new Human("Владимир", true,98,father);//есть ребенок, папа(анатолий)
        Human grandMotherW = new Human("Люся", false,70,mother);//есть ребенок, мама(надежда)

//Если бы я создавал не новые объекты, а создал список в который бы зосовывал объекты с переданными значениями,
        //то можно бы было сделать foreach и съэкономить строки на выводе
        System.out.println(grandFatherM);
        System.out.println(grandFatherW);
        System.out.println(grandMotherM);
        System.out.println(grandMotherW);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(children1);
        System.out.println(children2);
        System.out.println(children3);
    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();



       public Human(String name, boolean sex, int age, Human... child) {//...означает, что позиций Human может быть много
           this.name = name;
           this.sex = sex;
           this.age = age;
           /*если ЧИЛД позиция не существует, то foreach который говорит, в этот список добавить ту позицуию,
           которую передали в объявлении нового объекта  */
           if (child != null){
               for (Human s : child)
                   this.children.add(s);

           }

       }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
