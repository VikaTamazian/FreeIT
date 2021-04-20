package com.homework6.tasks.task28;

/**
 * Задание 28
 * Написать класс, который умеет хранить в себе массив любых типов данных (int, long etc.).
 * Реализовать метод get(int index), который возвращает любой элемент массива по индексу.
 */

public class Solution {
    public static void main(String[] args) {
        MyList<Double> doubleMyList = new MyList<>(5);
        doubleMyList.add(1.2);
        doubleMyList.add(3.2);
        doubleMyList.add(4.1);
        doubleMyList.add(15.3);
        doubleMyList.add(9.8);

        Double value = doubleMyList.get(3);
        System.out.println(value);

    }
}
