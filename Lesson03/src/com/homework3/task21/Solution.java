package com.homework3.task21;

/**
 * Задание 21
 * Напишите три цикла выполняющих многократное сложение строк, один с
 * помощью оператора сложения и String, другой с помощью StringBuilder и метода
 * append, а также аналогино для StringBuffer. Сравните скорость их выполнения.
 */
public class Solution {
    public static void main(String[] args) {
        testString("text");
        testStringBuilder("text");
        testStringBuffer("text");
    }

    private static void testString(String text) {
        String string = new String();
        long beginning = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            string += i;
        }
        long ending = System.currentTimeMillis();
        System.out.println("For String: " + (ending - beginning) + " millis.");

    }

    private static void testStringBuilder(String text) {
        StringBuilder stringBuilder = new StringBuilder("Text");
        long beginning = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            stringBuilder.append(i);
        }
        long ending = System.currentTimeMillis();
        System.out.println("For StringBuilder: " + (ending - beginning) + " millis.");

    }

    private static void testStringBuffer(String text) {
        StringBuffer stringBuffer = new StringBuffer();
        long beginning = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            stringBuffer.append(i);
        }
        long ending = System.currentTimeMillis();
        System.out.println("For StringBuffer: " + (ending - beginning) + " millis.");

    }

}
