package com.javarush.task.task15НаследованиеSingletonКонструкторы.task1530КофеИЧайАбстрактныйКлассИнаследование;

/**
 * Created by Ромчи on 29.03.2017.
 */
public abstract class DrinkMaker {
    abstract void getRightCup();
    abstract void putIngredient();
    abstract void pour();

     void makeDrink(){
        getRightCup();
        putIngredient();
        pour();
    }
}
