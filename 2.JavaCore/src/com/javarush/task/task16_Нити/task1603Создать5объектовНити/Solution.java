package com.javarush.task.task16_Нити.task1603Создать5объектовНити;

import java.util.ArrayList;
import java.util.List;

/* 
Список и нити
В методе main добавить в статический объект list 5 нитей. Каждая нить должна быть новым объектом класса Thread,
работающим со своим объектом класса SpecialThread.


Требования:
1. В методе main создай 5 объектов типа SpecialThread.
2. В методе main создай 5 объектов типа Thread.
3. Добавь 5 разных нитей в список list.
4. Каждая нить из списка list должна работать со своим объектом класса SpecialThread.
5. Метод run класса SpecialThread должен выводить "it's a run method inside SpecialThread".
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        //Add your code here - добавьте свой код тут
        SpecialThread oneST = new SpecialThread();
        SpecialThread twoST = new SpecialThread();
        SpecialThread threeST = new SpecialThread();
        SpecialThread fourST = new SpecialThread();
        SpecialThread fiveST = new SpecialThread();

        Thread oneT = new Thread(oneST);
        Thread twoT = new Thread(threeST);
        Thread threeT = new Thread(twoST);
        Thread fourT = new Thread(fourST);
        Thread fiveT = new Thread(fiveST);

        list.add(oneT);
        list.add(twoT);
        list.add(threeT);
        list.add(fourT);
        list.add(fiveT);
    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}
