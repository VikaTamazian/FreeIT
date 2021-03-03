package com.homework2.subtask7;

import java.util.Random;

/**
 * 7)  В переменную записываете количество программистов.
 * В зависимости от количества программистов необходимо вывести правильно окончание.
 * Например: • 2 программиста • 1 программиста • 10 программистов • и т.д.
 */

public class Solution {
    public static void main(String[] args) {

        Random rand = new Random();
        int x = rand.nextInt();
        findWord(x);

    }

    public static void findWord(int value) {
        if (value % 10 == 1 && value % 100 != 11) {
            System.out.println(value + " программист.");
        } else if (value % 10 == 2 || value % 10 == 3 || value % 10 == 4) {
            System.out.println(value + " программиста.");
        } else {
            System.out.println(value + " программистов.");
        }

    }
}
