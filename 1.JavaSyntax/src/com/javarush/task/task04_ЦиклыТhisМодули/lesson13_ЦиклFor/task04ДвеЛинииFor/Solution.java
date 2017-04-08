package com.javarush.task.task04_ЦиклыТhisМодули.lesson13_ЦиклFor.task04ДвеЛинииFor;

/* Рисуем линии
Используя цикл for вывести на экран:
- горизонтальную линию из 10 восьмёрок
- вертикальную линию из 10 восьмёрок.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
//        //напишите тут ваш код
//        for (int c=0;c<10;c++)
//        for (int i=0;i<10;i++)
//        {
//            if (i == 0 || c == 0) System.out.println("8");
//        }
//        System.out.println();
//
//    }
//
//}
        //напишите тут ваш код
        for(int i=0;i<=10;i++)
        {
            for(int k=0;k<10;k++)
            {       if(i==0 || k==0 )
                System.out.print("8");
            }
            System.out.println();
        }
    }
}
