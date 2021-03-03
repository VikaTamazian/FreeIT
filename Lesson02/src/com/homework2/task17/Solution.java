package com.homework2.task17;

/**
 * Задание 17
 * Создать двухмерный квадратный массив, и заполнить его «бабочкой», т.е
 * таким образом:
 * 1 1 1 1 1
 * 0 1 1 1 0
 * 0 0 1 0 0
 * 0 1 1 1 0
 * 1 1 1 1 1
 */

public class Solution {
    public static void main(String[] args) {
        int[][] butterfly = new int[5][5];

        int i;
        int j;


        for (i = 0; i < butterfly.length / 2 + 1; i++) {
            for (j = 0; j < butterfly[i].length; j++) {
                if ((j < i) || (j >= (butterfly[i].length - i))) {
                    butterfly[i][j] = 0;
                } else {
                    butterfly[i][j] = 1;
                }

            }

        }

        for (i = butterfly.length - 1; i > butterfly.length / 2; i--) {
            for (j = 0; j < butterfly[i].length; j++) {
                if ((j < (butterfly[i].length - 1 - i)) || (j > i)) {
                    butterfly[i][j] = 0;
                } else {
                    butterfly[i][j] = 1;
                }

            }

        }
        for (i = 0; i < butterfly.length; i++) {
            for (j = 0; j < butterfly[i].length; j++) {
                System.out.print(butterfly[i][j]);

            }
            System.out.println();

        }
    }
}
