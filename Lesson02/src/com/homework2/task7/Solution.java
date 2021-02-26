package com.homework2.task7;

import java.util.Scanner;

/**
 * Задание 7
 * Имеется прямоугольное отверстие размерами a и b, определить, можно ли его
 * полностью закрыть круглой картонкой радиусом r.
 */
//  r >= 1/2 h = Math.sqrt = (a*a) + (b*b)


public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter first side of the hole: ");
        int a = scanner.nextInt();
        System.out.println("Please, enter second side of the hole: ");
        int b = scanner.nextInt();
        System.out.println("Please, enter circle's radius: ");
        int r = scanner.nextInt();

        findMatch(a, b, r);

    }

    public static void findMatch(int a, int b, int r) {

        double h = Math.sqrt((a * a) + (b * b));
        if (r >= (h / 2)) {
            System.out.println("Circle can close the square hole.");
        } else {
            System.out.println("Circle can't close the square hole.");
        }

    }

}
