package com.javarush.task.task17.task1713МетодыИнтерфейсаЛИСТ;

import java.util.*;

/* 
Общий список
1. Изменить класс Solution так, чтобы он стал списком. (Необходимо реализовать интерфейс java.util.List).
2. Список Solution должен работать только с целыми числами Long.
3. Воспользуйтесь полем original.
4. Список будет использоваться нитями, поэтому позаботьтесь, чтобы все методы были синхронизированы.


Требования:
1. Класс Solution должен реализовывать интерфейс List.
2. Класс Solution должен содержать private поле original типа ArrayList.
3. Все переопределенные методы интерфейса List должны делегировать полномочия методам объекта original.
4. Все методы класса Solution, кроме метода main, должны быть синхронизированы.
*/

public class Solution implements List<Long> {
    private ArrayList<Long> original = new ArrayList<Long>();

    public static void main(String[] args) {

    }

    @Override
    public synchronized int size() {
        return original.size();
    }

    @Override
    public synchronized boolean isEmpty() {
        return original.isEmpty();
    }

    @Override
    public synchronized boolean contains(Object o) {
        return original.contains(o);
    }

    @Override
    public synchronized Iterator iterator() {
        return original.iterator();
    }

    @Override
    public synchronized Object[] toArray() {
        return original.toArray();
    }

    @Override
    public synchronized boolean add(Long aLong) {
        return original.add(aLong);
    }

    /*@Override
    public boolean add(Object o) {
        return original.add((Long)o);
    }*/

    @Override
    public synchronized boolean remove(Object o) {
        return original.remove(o);
    }

    @Override
    public synchronized boolean addAll(Collection c) {
        return original.addAll(c);
    }

    @Override
    public synchronized boolean addAll(int index, Collection c) {
        return original.addAll(index,c);
    }

    @Override
    public synchronized void clear() {
        original.clear();
    }

    @Override
    public synchronized Long get(int index) {
        return original.get(index);
    }

    @Override
    public synchronized Long set(int index, Long element) {
        return original.set(index,element);
    }

    @Override
    public synchronized void add(int index, Long element) {
original.add(index,element);
    }

    /*@Override
    public Object set(int index, Object element) {
        return original.set(index,(long)element);
    }*/

    /*@Override
    public void add(int index, Object element) {
        original.add(index, (long)element);
    }*/

    @Override
    public synchronized Long remove(int index) {
        return original.remove(index);
    }

    @Override
    public synchronized int indexOf(Object o) {
        return original.indexOf(o);
    }

    @Override
    public synchronized int lastIndexOf(Object o) {
        return original.lastIndexOf(o);
    }

    @Override
    public synchronized ListIterator listIterator() {
        return original.listIterator();
    }

    @Override
    public synchronized ListIterator listIterator(int index) { // - переводит на позицию
        return original.listIterator(index);
    }

    @Override
    public synchronized List subList(int fromIndex, int toIndex) { //выделяет элементы с fromI до toI.
        // someList.subList(3, 7).clear(); - В данном примере из списка someList будут удалены четыре элемента, с третьего по седьмой (не включительно).
        return original.subList(fromIndex,toIndex);
    }

    @Override
    public synchronized boolean retainAll(Collection c) {
        /*
        Предположим у меня есть коллекция:

ArrayList<String> listFirst = new ArrayList<String>();
listFirst .add("White");
listFirst .add("Black");
listFirst .add("Red");

и вторая:
ArrayList<String> listSecond = new ArrayList<String>();

listSecond .add("Green");
listSecond .add("Red");
listSecond .add("White");

Тогда после listFirst .retainAll(listSecond ) в listFirst останется:
"White"
"Red"
*/
        return original.retainAll(c);
    }

    @Override
    public synchronized boolean removeAll(Collection c) {
        return original.removeAll(c);
    }

    @Override
    public synchronized boolean containsAll(Collection c) {
        return original.containsAll(c);
    }

    @Override
    public synchronized Object[] toArray(Object[] a) {
        return original.toArray(a);
    }
}
