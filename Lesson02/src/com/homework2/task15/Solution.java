package com.homework2.task15;

import java.util.Arrays;
import java.util.Collections;

/**
 * Задание 15
 * Создать массив, заполнить его случайными элементами, распечатать,
 * перевернуть, и снова распечатать (при переворачивании нежелательно создавать
 * еще один массив).
 */

public class Solution {
    public static void main(String[] args) {
        Integer[] numbers = new Integer[10];
        System.out.println("Array created: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 1000);
        }

        Arrays.sort(numbers);
        for (Integer number : numbers) {
            System.out.print(number + ", ");
        }
        System.out.println();

        Arrays.sort(numbers, Collections.reverseOrder());
        for (Integer number : numbers) {
            System.out.print(number + ", ");

        }


    }
}
