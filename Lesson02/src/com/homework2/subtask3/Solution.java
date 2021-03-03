package com.homework2.subtask3;

/**
 * 3) Дано целое число. Если оно является положительным, то прибавить к нему 1.
 * Если отрицательным, то вычесть из него 2.
 * Если нулевым, то заменить его на 10. Вывести полученное число
 */

public class Solution {
    public static void main(String[] args) {
        int test = 0;
        System.out.println(transformNumber(test));

    }

    public static int transformNumber(int value) {

        if (value < 0) {
            return value - 2;

        } else if (value > 0) {
            return value + 1;

        } else {
            return 10;
        }

    }
}
