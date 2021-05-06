package com.tasks.task32;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordCounter {

    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream("Task32.txt");
        Scanner scanner = new Scanner(file);

        List<String> words = new ArrayList<>();
        List<Integer> counter = new ArrayList<>();


        while (scanner.hasNext()) {

            String nextWord = scanner.next();


            if (words.contains(nextWord)) {
                int index = words.indexOf(nextWord);
                counter.set(index, counter.get(index) + 1);
            }
            else{
                words.add(nextWord);
                counter.add(1);
            }
        }
        file.close();
        scanner.close();

        for (int i = 0; i < words.size(); i++) {
            System.out.println(words.get(i) + " occurred " + counter.get(i) + " time(s)");

        }


    }
}
