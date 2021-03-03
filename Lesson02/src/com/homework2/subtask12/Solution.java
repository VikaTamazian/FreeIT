package com.homework2.subtask12;

/**
 * 12)Напишите программу печати таблицы перевода расстояний из дюймов в сантиметры
 * для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см
 */

public class Solution {
    public static void main(String[] args) {
        getConvert();


    }

    public static void getConvert() {
        double sm = 1;
        int inch = 0;

        while (inch <= 20) {
            inch++;
            sm = inch * 2.54;
            System.out.println(inch + " inch is " + sm + " sm");

        }

    }

}
