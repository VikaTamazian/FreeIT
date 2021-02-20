package com.task4;

import java.util.Scanner;

/**
 * Определить число, полученное выписыванием в обратном порядке цифр
 * любого 4-х значного натурального числа n.
 * Решение третье.
 */
public class Solution3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите четыре цифры вашего числа: ");
        String[] values = new String[1];
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextLine();
        }
        System.out.println("Вы ввели число: ");
        printArray(values);
        System.out.println("Давай выведем его в обратном порядке: ");
        reverseString(values);
    }

    public static void printArray(String[] values) {
        for (String value : values) {
            System.out.println(value);
        }
    }

    public static void reverseString(String[] str) {
        for (int i = 0; i < str.length; i++) {
            char[] array = str[i].toCharArray();
            for (int j = array.length - 1; j >= 0; j--) {
                System.out.print(array[j]);
            }
        }
    }
}
