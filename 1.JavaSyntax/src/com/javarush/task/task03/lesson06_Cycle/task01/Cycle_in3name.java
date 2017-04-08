package com.javarush.task.task03.lesson06_Cycle.task01;

/* Мама мыла раму
Вывести на экран все возможные комбинации слов «Мама», «Мыла», «Раму».
Подсказка: их 6 штук. Каждую комбинацию вывести с новой строки. Слова не разделять. Пример:
МылаРамуМама
РамуМамаМыла
...
*/

public class Cycle_in3name
{
    public static void main(String[] args)
    {
        String a = "Мама";
        String b = "Мыла";
        String c = "Раму";
        String cycle;
        for (int i=0;i<3;i++)
        {
            cycle = a; a = b; b = cycle; // цикл епта
            System.out.println(a+b+c);
            cycle = b; b = c; c = cycle;
            System.out.println(a+b+c);
        }

        /*
        String a1 = "Мама";
        String a2 = "Мыла";
        String a3 = "Раму";
        String b;
        for (int i = 0; i < 3; i++)
        {
            b = a1; a1 = a2; a2 = b;
            System.out.println(a1 + a2 + a3);
            b = a2; a2 = a3; a3 = b;
            System.out.println(a1 + a2 + a3);*/
    }
}