package com.homework2.task6;

/**
 * Задание 6
 * Создайте число. Определите, является ли число трехзначным. Определите, является
 * ли его последняя цифра семеркой. Определите, является ли число четным.
 */

public class Solution {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 1000);
        System.out.println("Created number: " + randomNumber);
        specifyNumber(randomNumber);

    }

    public static void specifyNumber(int randomNumber) {
        if (randomNumber % 10 == 7) {
            System.out.println("It ends with 7.");
            if (randomNumber >= 100 && randomNumber <= 999) {
                System.out.println("Also it's a number of three ciphers. Match!");
            }
        } else if (randomNumber % 2 == 0) {
            System.out.println("It's even number.");
            if (randomNumber >= 100 && randomNumber <= 999) {
                System.out.println("Also it's a number of three ciphers. Match!");
            }
        } else if (randomNumber >= 100 && randomNumber <= 999) {
            System.out.println("It's just a number of three ciphers.");

        }
        System.out.println("That's all that we know about this number.");

    }

}
