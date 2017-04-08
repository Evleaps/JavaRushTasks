package com.javarush.task.task14ПереопредМетодовИзИнерфейсов.task14НаследованиеИприведениеТипов.task1406ПриведениеКлассаКдругомуКлассу;

/* 
Без ошибок
Инициализировать объект obj таким классом, чтобы метод main выполнился без ошибок.
*/

public class Solution {
    public static void main(String[] args) {
        Object obj = new Jerry();

        //это значит, mouse то-же, что и obj\ а греймаус это маус, а джери - греймаус который в свою очередь маус, а тот obj/ джери это obj
        Mouse mouse = (Mouse) obj;
        GreyMouse greyMouse = (GreyMouse) mouse;
        Jerry jerry = (Jerry) greyMouse;

        printClasses(obj, mouse, greyMouse, jerry);

    }

    public static void printClasses(Object obj, Mouse mouse, GreyMouse greyMouse, Jerry jerry) {
        System.out.println(jerry.getClass().getSimpleName());
        System.out.println(greyMouse.getClass().getSimpleName());
        System.out.println(mouse.getClass().getSimpleName());
        System.out.println(obj.getClass().getSimpleName()); //принт - Класс.ВызватьКласс.ВызваетИмяКласса
    }

    static class Mouse {
    }

    static class GreyMouse extends Mouse {
    }

    static class Jerry extends GreyMouse {
    }
}
