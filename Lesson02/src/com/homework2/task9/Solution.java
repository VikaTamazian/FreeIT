package com.homework2.task9;

/**
 * Задание 9
 * Изменить пример с суммой чисел таким образом, чтобы рассчитывалась не сумма, а
 * произведение, т.е. факториал числа.
 */

public class Solution {
    public static void main(String[] args) {

        int x = (int) (Math.random() * 20);
        System.out.println("Random number is: " + x);
        System.out.println(findFactorial(x));

    }

    public static String findFactorial(int value) {
        int result = 1;
        int i = 1;
        while (i <= value) {
            result *= i;
            i++;
        }
        return ("Factorial of the number is: " + result);
    }
}
