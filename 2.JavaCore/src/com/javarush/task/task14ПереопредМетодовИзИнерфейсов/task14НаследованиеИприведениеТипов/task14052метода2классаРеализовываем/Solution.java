package com.javarush.task.task14ПереопредМетодовИзИнерфейсов.task14НаследованиеИприведениеТипов.task14052метода2классаРеализовываем;

/* 
Food
1. Реализовать интерфейс Selectable в классе Food.
2. Метод onSelect() должен выводить на экран фразу «food was selected«.
3. Подумай, какие методы можно вызвать для переменной food и какие для selectable.
4. В методе foodMethods вызови методы onSelect, eat, если это возможно.
5. В методе selectableMethods вызови методы onSelect, eat, если это возможно.
6. Явное приведение типов не использовать.
*/

public class Solution {
    public static void main(String[] args) {
        //создали объект
        Food food = new Food();
        Selectable selectable = new Food();
        //хз зачем понизили степень, если это удалить - ничего не изменится
        Food newFood = (Food) selectable;

        foodMethods(food);
        selectableMethods(selectable);
    }

    public static void foodMethods(Food food) {
        //тут добавьте вызов методов для переменной food
        food.eat();//1 ОДИН
        food.onSelect();//1 ОДИН
    }

    public static void selectableMethods(Selectable selectable) {
        //тут добавьте вызов методов для переменной selectable
        selectable.onSelect();//2 ДЖВА!!
    }

    //интерфейс и класс описываю, что могут делать методы
    interface Selectable {
         void onSelect();
    }

    static class Food implements Selectable{
        public void onSelect(){
            System.out.println("food was selected");
        }
        public void eat() {
            System.out.println("food was eaten");
        }
    }
}
