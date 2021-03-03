package com.homework2.subtask14;

/**
 * 14)Напишите программу, определяющую сумму всех нечетных чисел от 1 до 99
 */

public class Solution {
    public static void main(String[] args) {
        System.out.println(getSum());

    }

    public static int getSum() {
        int result = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                result += i;
            }

        }

        return result;
    }
}
