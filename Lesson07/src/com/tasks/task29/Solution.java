package com.tasks.task29;

import java.util.ArrayList;
import java.util.List;

/**
 * Задание 29
 * Создать список оценок учеников с помощью ArrayList, заполнить случайными
 * оценками. Удалить неудовлетворительные оценки из списка.
 */

public class Solution {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        System.out.println(addMarks(list));
        System.out.println(removeMarks(list));

    }

    private static List<Integer> addMarks(List<Integer> list) {

        for (int i = 1; i < 10; i++) {
            list.add((int) (1 + Math.random() * 10));
        }

        return list;
    }

    private static List<Integer> removeMarks(List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        int negative = 3;
        for (Integer value : list) {
            if (value > negative) {
                result.add(value);
            }
        }
        return result;
    }
}
