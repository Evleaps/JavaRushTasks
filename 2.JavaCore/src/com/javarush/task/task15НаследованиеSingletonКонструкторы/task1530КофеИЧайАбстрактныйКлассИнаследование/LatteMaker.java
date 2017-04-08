package com.javarush.task.task15НаследованиеSingletonКонструкторы.task1530КофеИЧайАбстрактныйКлассИнаследование;

/**
 * Created by Ромчи on 29.03.2017.
 */
public  class LatteMaker extends DrinkMaker {
    @Override
    void putIngredient() {
        System.out.println("Делаем кофе");
    }

    @Override
    void pour() {
        System.out.println("Заливаем молоком с пенкой");
    }

    @Override
    void getRightCup() {
        System.out.println("Берем чашку для латте");
    }

    @Override
    void makeDrink() {
        super.makeDrink();
    }
}
