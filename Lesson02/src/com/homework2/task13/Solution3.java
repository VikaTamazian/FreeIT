package com.homework2.task13;

import java.util.Arrays;
import java.util.Collections;

/**
 * Задание 13
 * Создать последовательность случайных чисел, найти и вывести наибольшее из них.
 */

public class Solution3 {
    public static void main(String[] args) {
        Integer[] numbers = new Integer[10];
        System.out.println("Array created: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 1000);
            System.out.print(numbers[i] + ", ");
        }

        Arrays.sort(numbers, Collections.reverseOrder());
        System.out.println("Max value is: " + numbers[0]);


    }
}

