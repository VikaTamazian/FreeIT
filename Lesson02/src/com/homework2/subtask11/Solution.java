package com.homework2.subtask11;

import java.util.Scanner;

/**
 * 11)Составьте программу, вычисляющую A*B, не пользуясь операцией умножения.
 */

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter number 1: ");
        int number1 = scanner.nextInt();
        System.out.println("Please, enter number 2: ");
        int number2 = scanner.nextInt();

        System.out.println(getIncrease(number1, number2));

    }

    public static int getIncrease(int value1, int value2) {
        int result = 0;
        for (int i = 0; i < value1; i++) {
            result += value2;
        }

        return result;
    }
}
