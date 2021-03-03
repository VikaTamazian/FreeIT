package com.homework2.subtask1;

import java.util.Random;

/**
 * В переменную записываем число. Надо вывести на экран сколько в этом числе цифр
 * и положительное оно или отрицательное. Например, "это однозначное положительное число".
 * Достаточно будет определить, является ли число однозначным, "двухзначным или трехзначным и более.
 */

public class Solution {
    public static void main(String[] args) {

        int test = -1;
        specifyNumber(test);
        countOfDigits(test);

    }

    public static void specifyNumber(int value) {

        if (--value > 0) {
            System.out.println("Positive number");
        } else {
            System.out.println("Negative number");
        }
    }

    public static void countOfDigits(int value) {
        int counter = (value == 0) ? 1 : 0;
        while (value != 0) {
            counter++;
            value /= 10;

        }
        if (counter <= 2) {
            System.out.println("Quantity of digits is " + counter);
        } else {
            System.out.println("Quantity of digits is three or more");

        }
    }
}
