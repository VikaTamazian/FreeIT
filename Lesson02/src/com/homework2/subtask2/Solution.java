package com.homework2.subtask2;

import java.util.Scanner;

/**
 * 2) Треугольник существует только тогда, когда сумма любых двух его сторон больше третьей.
 * Определить существует ли такой треугольник. Дано: a, b, c –стороны предполагаемого треугольника.
 * Требуется сравнить длину каждого отрезка-стороны с суммой двух других.
 * Если хотя бы в одном случае отрезок окажется больше суммы двух других,
 * то треугольника с такими сторонами не существует.
 */

public class Solution {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter side A: ");
        int a = scanner.nextInt();
        System.out.println("Please, enter side B: ");
        int b = scanner.nextInt();
        System.out.println("Please, enter side C: ");
        int c = scanner.nextInt();

        if ((a < (b + c)) & (b < (a + c)) & (c < (b + a)) & (a == b & b == c)) {
            System.out.println("This is equilateral triangle.");
        } else if ((a < (b + c)) & (b < (a + c)) & (c < (b + a)) & ((a == b & a != c) || (a == c & a != b) || (b == c & b != a))) {
            System.out.println("This is isosceles triangle.");
        } else if ((a < (b + c)) & (b < (a + c)) & (c < (b + a))) {
            System.out.println("Ok, this triangle exists.");
        } else {
            System.out.println("Uh no, this is definitely not a triangle.");
        }

    }
}
