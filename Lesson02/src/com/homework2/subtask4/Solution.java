package com.homework2.subtask4;

import java.util.Scanner;

/**
 * 4) Даны 3 целых числа. Найти количество положительных чисел в исходном наборе.
 */

public class Solution {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter 3 numbers either positive, or negative: ");
        int[] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();

        }

        System.out.println(countNumbers(numbers));

    }

    public static String countNumbers(int[] values) {
        int counterPositive = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] > 0) {
                counterPositive++;
            }

        }
        return "We've got " + counterPositive + " positive numbers.";

    }
}
