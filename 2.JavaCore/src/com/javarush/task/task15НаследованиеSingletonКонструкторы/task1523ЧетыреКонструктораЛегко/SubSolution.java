package com.javarush.task.task15НаследованиеSingletonКонструкторы.task1523ЧетыреКонструктораЛегко;

/**
 * Created by Ромчи on 29.03.2017.
 */
public class SubSolution extends Solution {
     SubSolution(int i) {
        super(i);
    }

    protected SubSolution(boolean i) {
        super(i);
    }

    public SubSolution(byte i) {
        super(i);
    }
}
