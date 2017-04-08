package com.javarush.task.task15НаследованиеSingletonКонструкторы.task1530КофеИЧайАбстрактныйКлассИнаследование;

/**
 * Created by Ромчи on 29.03.2017.
 */
public class TeaMaker extends DrinkMaker {
    @Override
    void putIngredient() {
        System.out.println("Насыпаем чай");
    }

    @Override
    void pour() {
        System.out.println("Заливаем кипятком");
    }

    @Override
    void getRightCup() {
        System.out.println("Берем чашку для чая");
    }

    @Override
    void makeDrink() {
        super.makeDrink();
    }
}