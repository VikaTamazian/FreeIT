package com.task5;

import java.util.HashSet;
import java.util.Set;

/**
 * Дано любое натуральное 4-х значное число.
 * Верно ли, что все цифры числа различны?
 */

public class Solution2 {
    public static void main(String[] args) {
        Set<Integer> list = new HashSet<>();
        String numb = "1401";
        String[] n = numb.split("");
        for (int i = 0; i < n.length; i++) {
            list.add(Integer.parseInt(n[i]));
        }
        if (n.length == list.size()) {
            System.out.println("Цифры различны.");
        } else {
            System.out.println("Есть совпадения.");
        }
    }
}
