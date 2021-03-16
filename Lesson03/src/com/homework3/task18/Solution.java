package com.homework3.task18;

/**
 * Задание 18
 * Найти в строке не только запятые, но и другие знаки препинания. Подсчитать
 * общее их количество.
 */

public class Solution {
    public static void main(String[] args) {
        String text = "Ноч, плача дзіцёнак, якога ядуць прусы, коні на двары трывожацца чагосьці - напэўна, " +
                "блізка праходзіць мядзведзь, - над верхавінамі дрэў, над лясным акіянам часты зорны дождж." +
                "У хаце не прадыхнуць, дзяўчынка люляе нагой калыску. Старажытны, як свет, напеў: \"А-а-а…\"";
        int quantity = 0;
        char symbol;
        for (int i = 0; i < text.length(); i++) {
            symbol = text.charAt(i);
            if (symbol == ',' || symbol == '-' || symbol == '.' || symbol == ':' || symbol == '\"' || symbol == '…') {
                quantity++;
            }

        }
        System.out.println("We have " + quantity + " punctuation marks.");

    }

}
