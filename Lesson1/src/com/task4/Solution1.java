package com.task4;

import java.util.Scanner;

/**
 * Определить число, полученное выписыванием в обратном порядке цифр
 * любого 4-х значного натурального числа n.
 * Решение первое.
 */
public class Solution1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите четырехзначное число: ");
        int numb = scanner.nextInt();
        System.out.println("Смотри, что могу: ");
        System.out.println(new StringBuilder(String.valueOf(numb)).reverse());
    }
}
