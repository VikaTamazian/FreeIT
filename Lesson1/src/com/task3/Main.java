package com.task3;

/**
 * Имеется 4500 секунд. Вывести в консоль содержащихся в этом количестве секунд:
 * А) минут + секунд,
 * В) часов + минут + секунд,
 * С) дней + часов + минут + секунд,
 * D) недель + дней + часов + минут + секунд.
 */

public class Main {
    public static void main(String[] args) {
        int s = 4500;
        int sec = s % 60;
        int m = (s - sec) / 60;
        int min = m % 60;
        int h = (m - min) / 60;
        int hour = h % 24;
        int d = (h - hour) / 24;
        int day = d % 7;
        int w = (d - day) / 7;

        System.out.println(m + " минут, " + sec + " секунд");
        System.out.println(h + " часов, " + min + " минут, " + sec + " секунд");
        System.out.println(d + " дней, " + h + " часов, " + min + " минут, " + sec + " секунд");
        System.out.println(w + " недель, " + d + " дней, " + h + " часов, " + min + " минут, " + sec + " секунд");

    }
}
