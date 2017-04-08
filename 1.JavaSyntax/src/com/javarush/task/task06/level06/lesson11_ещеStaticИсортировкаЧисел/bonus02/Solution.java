package com.javarush.task.task06.level06.lesson11_ещеStaticИсортировкаЧисел.bonus02;

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

/*public class СЛОЖНАПИЗДЕЦ
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //вводим имена героев программы
        String dedaName = reader.readLine();
        String babkaName = reader.readLine();
        String fatherName = reader.readLine();
        String motherName = reader.readLine();
        String sonName = reader.readLine();
        String daughterName = reader.readLine();

        //новый объект(человек), в скобках то, какие значения использовать при выводе
        Cat catDeda = new Cat(dedaName);
        Cat catBabka = new Cat(babkaName);
        Cat catFather = new Cat(fatherName, catDeda);
        Cat catMother = new Cat(motherName, catBabka);
        Cat catSon = new Cat(sonName, catMother, catFather);
        Cat catDaughter = new Cat(daughterName, catMother, catFather);


        //вывод в хронологии от деда к дочери
        System.out.println(catDeda);
        System.out.println(catBabka);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat
    {
        private String name;
        private Cat parentMother;
        private Cat parentFather;

        Cat(String name, Cat parentMother, Cat parentFather)
        {
            this.name = name;
            this.parentMother = parentMother;
            this.parentFather = parentFather;
        }

        @Override
        public String toString()
        {
            return "Cat name is " + name +
                    ((parentMother != null) ? ", mother is " + parentMother.name : ", no mother") +
                    ((parentFather != null) ? ", father is " + parentFather.name : ", no father");

        }
    }
}
*/