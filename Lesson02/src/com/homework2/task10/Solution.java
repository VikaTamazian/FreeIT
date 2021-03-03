package com.homework2.task10;

/**
 * Задание 10
 * Посчитать факториал числа в границах от 10 до 15 (не используя рекурсию).
 */

public class Solution {
    public static void main(String[] args) {

        System.out.println(findFactorial(10, 15));

    }

    public static String findFactorial(int value1, int value2) {
        int result = 1;
        while (value1 <= value2) {
            result *= value1;
            value1++;
        }
        return ("Factorial between numbers 10 and 15 is: " + result);
    }
}
