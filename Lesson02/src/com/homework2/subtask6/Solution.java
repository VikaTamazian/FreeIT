package com.homework2.subtask6;

/**
 * 6) Даны 2 числа. Вывести большее из них
 */

public class Solution {
    public static void main(String[] args) {
        double value1 = Math.random() * 10;
        double value2 = Math.random() * 10;
        System.out.println(findBigger(value1, value2));
    }

    public static String findBigger(double value1, double value2) {
        if (value1 > value2) {
            return (value1 + " is bigger than " + value2);
        } else {
            return (value2 + " is bigger than " + value1);
        }
    }
}
