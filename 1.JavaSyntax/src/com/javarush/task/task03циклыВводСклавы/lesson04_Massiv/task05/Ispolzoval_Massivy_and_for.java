package com.javarush.task.task03циклыВводСклавы.lesson04_Massiv.task05;

/* Сумма 10 чисел
Вывести на экран сумму чисел от 1 до 10 построчно (должно быть 10 строк):
1
1+2=3
1+2+3=6
1+2+3+4=10
...
Пример вывода:
1
3
6
10
...
*/

public class Ispolzoval_Massivy_and_for
{
    public static void main(String[] args)
    {
        //решил применить массивы
        int[] array = new int [10];//создаем объект и указываем длинну массива (10) в этом случае
        array[0] = 1;//прописываем задания для каждой длины массива
        array[1] = 1+2;
        array[2] = 1+2+3;
        array[3] = 1+2+3+4;
        array[4] = 1+2+3+4+5;
        array[5] = 1+2+3+4+5+6;
        array[6] = 1+2+3+4+5+6+7;
        array[7] = 1+2+3+4+5+6+7+8;
        array[8] = 1+2+3+4+5+6+7+8+9;
        array[9] = 1+2+3+4+5+6+7+8+9+10;// наша длина 10, это последняя точка(коробка) массива

        /*цикл for выводит на экран до тех пор, пака условие выполняется,пока i меньше длины массива,
        .length это команда, которая указывает программе, что нужно сравнивать с i именно длину массива [0 - 10]
        i++ говорит, что если условие выполнено, приступать к массиву на порядок выше предыдущего

        Итак, i=0, условие выполняется.Далее повтор. А на 10 раз i перестанет работать, так как [10] у нас нет
        */
        for (int i=0;i<array.length; i++){
            System.out.println(array[i]);
        }



    }
}