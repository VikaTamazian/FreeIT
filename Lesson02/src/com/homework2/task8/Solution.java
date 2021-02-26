package com.homework2.task8;

import java.util.Random;
import java.util.Scanner;

/**
 * Задание 8
 * Имеется целове число (задать с помощью Random rand = new Random(); int x =
 * rand.nextInt() ). Это число – количесво денег в рублях. Вывести это число, добавив к
 * нему слово «рублей» в правильном падеже.
 */

public class Solution {
    public static void main(String[] args) {

        Random rand = new Random();
        int x = rand.nextInt();
        findWord(x);

    }

    public static void findWord(int value) {
        if (value % 10 == 1 && value % 100 != 11) {
            System.out.println(value + " рубль");
        } else if (value % 10 == 2 || value % 10 == 3 || value % 10 == 4) {
            System.out.println(value + " рубля");
        } else {
            System.out.println(value + " рублей");
        }

    }
}
