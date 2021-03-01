package com.homework2.task13;

/**
 * Задание 13
 * Создать последовательность случайных чисел, найти и вывести наибольшее из них.
 */

public class Solution1 {
    public static void main(String[] args) {

        int[] numbers = new int[10];
        System.out.println("Array created: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);
            System.out.print(numbers[i] + ", ");

        }
        System.out.println();
        System.out.println("Sorted numbers: ");
        findMaxValue(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ", ");

        }
        System.out.println("Max value is: " + numbers[numbers.length - 1]);

    }

    public static void findMaxValue(int[] values) {
        for (int i = 0; i < values.length; i++) {
            int minValue = values[i];
            int minIndex = i;
            for (int j = i + 1; j < values.length; j++) {
                if (values[j] < minValue) {
                    minValue = values[j];
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                int tmp = values[i];
                values[i] = values[minIndex];
                values[minIndex] = tmp;
            }
        }
    }
}
