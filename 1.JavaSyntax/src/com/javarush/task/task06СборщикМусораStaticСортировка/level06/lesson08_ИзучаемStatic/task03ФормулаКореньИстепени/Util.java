package com.javarush.task.task06СборщикМусораStaticСортировка.level06.lesson08_ИзучаемStatic.task03ФормулаКореньИстепени;

/* Класс Util
Реализовать статический метод double getDistance(x1, y1, x2, y2). Он должен вычислять расстояние между точками.
Используй метод double Math.sqrt(double a), который вычисляет квадратный корень переданного параметра
*/

public class Util
{
    public static double getDistance(int x1, int y1, int x2, int y2)
    {
        //напишите тут ваш код

         double a = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
         return a;

         //Смотри ебучую математику, формала расстояния между двумя точками в прямоугольной
        //системе координат --- d=корень((х2-х1)в квадрате+(у2-у1)в квадрате)
    }
}
