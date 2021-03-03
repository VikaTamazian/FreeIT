package com.homework2.subtask9;

/**
 * 9)Одноклеточная амеба каждые 3 часа делится на 2 клетки.
 * Определить,сколько амеб будет через 3, 6, 9, 12,..., 24 часа.
 */

public class Solution {
    public static void main(String[] args) {
        countAmoeba();

    }

    public static void countAmoeba() {
        long amoeba = 2;
        int time = 0;
        while (time < 24) {
            amoeba = (long) (Math.pow(amoeba, 2));
            time += 3;
            if (amoeba >= 9223372036854775807L) {
                System.out.println("In " + time + "h there will be too much amoebas.");
            } else {
                System.out.println("In " + time + "h there will be " + amoeba + " amoebas.");

            }
        }
    }
}
