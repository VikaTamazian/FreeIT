package com.homework2.task12;

import java.util.Scanner;

/**
 * Задание 12
 * Найдите сумму первых n целых чисел, которые делятся на 3.
 */

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the number: ");
        int n = scanner.nextInt();

        System.out.println(findSum(n));
    }

    public static int findSum(int value) {

        int sum = 0;
        int count = 0;
        int temp = 1;
        while (count != value) {
            if (temp % 3 == 0 && count < value) {
                sum += temp;
                count++;
            }
            temp++;
        }
        return sum;

    }
}
