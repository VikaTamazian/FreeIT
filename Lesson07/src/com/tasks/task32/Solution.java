package com.tasks.task32;

import java.util.*;

/**
 * Задание 32
 * Имеется текст. Следует составить для него частотный словарь.
 */

public class Solution {
    public static void main(String[] args) {
        String text = "The incredible Wizard of Oz, " +
                "Retired from his business because " +
                "Due to up-to-date science " +
                "To most of his clients " +
                "He wasn’t the Wizard he was.";

        System.out.println(findFrequency(text));
    }


    public static Map<String, Integer> findFrequency(String string) {
        string = string.replaceAll("[^a-zA-z0-9]", " ");
        String[] allWords = string.split(" +");

        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String word : allWords) {
            word = word.toLowerCase();
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);

        }
        Map<String, Integer> orderMap = new TreeMap<String, Integer>((e1, e2) -> {
            int freq1 = frequencyMap.get(e1);
            int freq2 = frequencyMap.get(e2);

            if (freq1 != freq2) {
                return freq2 - freq1;
            }
            return e1.compareTo(e2);
        });
        orderMap.putAll(frequencyMap);
        return orderMap;
    }


}

