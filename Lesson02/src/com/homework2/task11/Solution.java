package com.homework2.task11;

import java.util.Scanner;

/**
 * Задание 11
 * Имеется целое число, определить является ли это число простым, т.е.
 * делится без остатка только на 1 и себя.
 */

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the number: ");
        int value = scanner.nextInt();
        System.out.println("Random number is: " + value);
        defineIfPrime(value);

    }

    public static void defineIfPrime(int value) {
        int temp = 2;
        if (value > 1) {
            if (value % temp != 0) {
                temp++;
                System.out.println("The number is prime.");
            } else {
                System.out.println("Nothing interesting about this number.");
            }
        }
    }
}
