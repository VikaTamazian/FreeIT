package com.homework2.task13;

/**
 * Задание 13
 * Создать последовательность случайных чисел, найти и вывести наибольшее из них.
 */

public class Solution2 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        System.out.println("Array created: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 10);
            System.out.print(numbers[i] + ", ");

        }
        System.out.println();
        findMaxValue(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ", ");

        }

        System.out.println("Max value is: " + numbers[numbers.length - 1]);
    }

    public static void findMaxValue(int[] values) {
        for (int i = values.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (values[j] > values[j + 1]) {
                    int temp = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = temp;
                }

            }

        }

    }
}
