package com.homework5.task22;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Задание 22
 * Написать программу, выполняющую поиск в строке шестнадцатеричных чисел,
 * записаных по правилам Java, с помощью регулярных выражений и вывести их на
 * страницу.
 */

public class Solution {
    public static void main(String[] args) {
        String text = "This is 0x7FFF number.";
        Pattern pattern = Pattern.compile("0x[A-Fa-f0-9]{1,4}");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()){
            System.out.println(matcher.group());
        }

    }
}
