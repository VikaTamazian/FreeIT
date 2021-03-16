package com.homework3.task20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Задание 20
 * Имеется строка с текстом. Вывести текст, составленный из последних букв
 * всех слов.
 */

public class Solution {
    public static void main(String[] args) {
        String text = "Имеется строка с текстом. Вывести текст, составленный из последних букв всех слов.";
        String regexp = "([а-яА-Я]+)|([a-zA-Z]+)";
        StringBuilder stringBuilder = new StringBuilder();

        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            stringBuilder.append(text, matcher.end() - 1, matcher.end());
        }

        System.out.println("Last letters are: " + stringBuilder);

    }
}
