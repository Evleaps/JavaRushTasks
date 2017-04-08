package com.javarush.task.task07.level07.lesson12.home06ПерегрузкаМетодЛюдиСложная;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Human grandfatherM = new Human("Эмбер", true,82,null,null);
        Human grandfatherW = new Human("Рая",false,75,null,null);
        Human grandmotherM = new Human("Владимир",true,81,null,null);
        Human grandmotherW = new Human("Людмила",false,70,null,null);
        Human father = new Human("Анатолий",true,47,grandfatherM,grandmotherM);
        Human woomen = new Human("Надежда",false,40,grandfatherW,grandmotherW);
        Human children1 = new Human("Роман",true,20,father,woomen);
        Human children2 = new Human("Лера",false,5,father,woomen);
        Human children3 = new Human("Долбаеб",true,2,father,woomen);


        System.out.println(grandfatherM);
        System.out.println(grandfatherW);
        System.out.println(grandmotherM);
        System.out.println(grandmotherW);
        System.out.println(father);
        System.out.println(woomen);
        System.out.println(children1);
        System.out.println(children2);
        System.out.println(children3);
    }

    public static class Human
    {
        //напишите тут ваш код
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        Human(String name,boolean sex, int age,Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }


        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
