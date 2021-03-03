package com.homework2.subtask5;

import java.util.Scanner;

/**
 * 5) Даны 3 целых числа. Найти количество положительных и отрицательных чисел в исходном наборе.
 */

public class Solution {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter 3 numbers either positive, or negative: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        System.out.println(countNumbers(number1, number2, number3));

    }

    public static String countNumbers(int value1, int value2, int value3) {
        int counterPositive = 0;
        int counterNegative = 0;
        if (value1 < 0) {
            counterNegative++;
        } else if (value1 > 0) {
            counterPositive++;
        }
        if (value2 < 0) {
            counterNegative++;
        } else if (value2 > 0) {
            counterPositive++;
        }
        if (value3 < 0) {
            counterNegative++;
        } else if (value3 > 0) {
            counterPositive++;
        }
        return "We've got " + counterPositive + " positive numbers and " + counterNegative + " negative numbers.";

    }
}
