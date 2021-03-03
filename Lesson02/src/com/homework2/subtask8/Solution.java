package com.homework2.subtask8;

/**
 * 8)Начав тренировки, спортсмен в первый день пробежал 10 км.
 * Каждый день он увеличивал дневную норму на 10% нормы предыдущего дня.
 * Какой суммарный путь пробежит спортсмен за 7 дней?
 */

public class Solution {
    public static void main(String[] args) {
        double km = 10d;
        countRange(km);

    }

    public static void countRange(double km) {

        double range = 10d;
        int day = 1;
        while (day < 7) {
            km = km + (km * 0.1);
            range += km;
            day++;

        }
        System.out.printf("Runner've reached %.2f km total range in 7 days.", range);

    }
}
