package com.tasks.task31;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Задание 31
 * Создать список оценок учеников с помощью ArrayList, заполнить случайными
 * оценками. Найти самую высокую оценку с использованием итератора.
 */

public class Solution {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        System.out.println(addMarks(list));
        System.out.println(findMaxMark(list));

    }

    private static List<Integer> addMarks(List<Integer> list) {

        for (int i = 1; i < 10; i++) {
            list.add((int) (1 + Math.random() * 10));
        }

        return list;
    }

    private static Integer findMaxMark(List<Integer> list) {
        Iterator<Integer> iterator = list.iterator();
        Integer result = 0;
        while (iterator.hasNext()) {
            Integer value = iterator.next();
            if (result < value) {
                result = value;
            }
        }

        return result;
    }
}
