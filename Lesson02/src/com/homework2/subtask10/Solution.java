package com.homework2.subtask10;

/**
 * 10)Вычислить: 1+2+4+8+...+256
 */

public class Solution {
    public static void main(String[] args) {
        System.out.println(getSum());

    }

    public static int getSum() {
        int result = 0;
        int counter = 1;
        while (counter <= 256) {
            result += counter;
            counter *= 2;

        }

        return result;
    }
}
