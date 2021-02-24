package com.task5;

import java.util.HashSet;
import java.util.Set;

/**
 * Дано любое натуральное 4-х значное число.
 * Верно ли, что все цифры числа различны?
 */

public class Solution1 {
    public static void main(String[] args) {

        int value = 5647;
        int lengthOfValue = String.valueOf(value).length();
        Set<Integer> set = new HashSet<>();
        while (value > 0) {
            set.add(value % 10);
            value = value / 10;
        }

        if (lengthOfValue == set.size()) {
            System.out.println("Цифры различны.");
        } else {
            System.out.println("Есть совпадения.");
        }
        System.out.println(set);
    }
}
