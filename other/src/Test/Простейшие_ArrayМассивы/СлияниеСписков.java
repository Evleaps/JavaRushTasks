package Test.Простейшие_ArrayМассивы;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class СлияниеСписков
{
    public static void main(String[] args) throws IOException
    {
        ArrayList<Integer> list1 = new ArrayList<Integer>();   //создание списка
        Collections.addAll(list1, 1, 5, 6, 11, 3, 15, 7, 8);   //заполнение списка

        ArrayList<Integer> list2 = new ArrayList<Integer>();
        Collections.addAll(list2, 1, 8, 6, 21, 53, 5, 67, 18);

        ArrayList<Integer> result = new ArrayList<Integer>();

        result.addAll(list1);   //добавление всех значений из одного списка в другой
        result.addAll(list2);

        for (Integer x : result)   //быстрый for по всем элементам, только для коллекций
        {
            System.out.println(x);
        }
    }
}
