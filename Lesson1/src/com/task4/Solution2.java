package com.task4;

import java.util.Scanner;

/**
 * Определить число, полученное выписыванием в обратном порядке цифр
 * любого 4-х значного натурального числа n.
 * Решение второе.
 */
public class Solution2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите четыре цифры вашего числа: ");
        int[] values = new int[4];
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }

        System.out.println("Вы ввели число: ");
        printArray(values);
        System.out.println("Давай выведем его в обратном порядке: ");
        printReversArray(values);
    }

    public static void printArray(int[] values) {
        for (int value : values) {
            System.out.println(value);
        }
        System.out.println();
    }

    public static void printReversArray(int[] values) {
        for (int i = values.length - 1; i >= 0; i--) {
            System.out.println(values[i]);
        }
        System.out.println();
    }


}
