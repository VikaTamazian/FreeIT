package com.homework2.task14;

import java.util.Arrays;

/**
 * Задание 14
 * Создать массив оценок произвольной длины, вывести максимальную и
 * минимальную оценку, её (их) номера.
 */

public class Solution {
    public static void main(String[] args) {
        int index = (int) (Math.random() * 50);
        Integer[] marks = new Integer[index];
        System.out.println("List of marks: ");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = (int) (Math.random() * 10);
            System.out.print(marks[i] + ", ");
        }
        sortNumbers(marks);
        int minMark = marks[0];
        int maxMark = marks[marks.length - 1];
        System.out.println("Minimal mark is: " + minMark);
        System.out.println("It's position is: " + Arrays.asList(marks).indexOf(minMark));
        System.out.println("Highest mark is: " + maxMark);
        System.out.println("It's position is: " + Arrays.asList(marks).indexOf(maxMark));

    }

    public static void sortNumbers(Integer[] values) {
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
