package com.javarush.task.task06.level06.lesson11_ещеStaticИсортировкаЧисел.home05Static;

/* Есть новые идеи? Подумаем...
1. В классе СЛОЖНАПИЗДЕЦ создать public статический класс Idea!
2. В классе Idea создать метод public String getDescription(), который будет возвращать любой непустой текст!
3. В классе СЛОЖНАПИЗДЕЦ создайте статический метод public void printIdea(Idea idea), который будет выводить
на экран описание идеи - это то, что возвращает метод getDescription!
*/

public class Solution
{
    public static void main(String[] args)
    {
        printIdea(new Idea());
    }

    static public void printIdea(Idea idea){
        System.out.println(idea.getDescription());
    }

    //Добавьте тут класс Idea
    public static class Idea{

        public String getDescription(){
           return "Моя идея - стать программистом";
        }
    }

}
