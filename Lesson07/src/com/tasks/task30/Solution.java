package com.tasks.task30;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * * Задание 30
 * * Создать коллекцию, наполнить ее случайными числами. Удалить повторяющиеся
 * * числа.
 */

public class Solution {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        System.out.println(addValues(values));
        System.out.println(findUnique(values));
    }

    private static List<Integer> addValues(List<Integer> list) {
        for (int i = 0; i < 10; i++) {
            list.add((int) (1 + Math.random() * 10));
        }
        return list;
    }

    private static HashSet<Integer> findUnique(List<Integer> list) {
        return new HashSet<>(list);

    }
}
