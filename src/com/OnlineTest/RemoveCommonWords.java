package com.OnlineTest;

import java.util.HashSet;

public class RemoveCommonWords {

    public static void main(String[] args) {
        String[] inputStrings = {
            "I love programming",
            "Programming is fun",
            "Java programming is awesome"
        };

        String[] result = removeCommonWords(inputStrings);

        System.out.println("Modified Strings:");
        for (String str : result) {
            System.out.println(str);
        }
    }

    static String[] removeCommonWords(String[] strings) {
        // Create a set to store common words
        HashSet<String> commonWords = new HashSet<>();

        // Initialize commonWords with words from the first string
        StringBuilder currentWord = new StringBuilder();
        for (char c : strings[0].toCharArray()) {
            if (c == ' ') {
                commonWords.add(currentWord.toString().toLowerCase());
                currentWord.setLength(0); // Clear the StringBuilder
            } else {
                currentWord.append(c);
            }
        }
        // Add the last word
        commonWords.add(currentWord.toString().toLowerCase());

        // Check other strings for common words
        for (int i = 1; i < strings.length; i++) {
            currentWord.setLength(0); // Clear the StringBuilder
            for (char c : strings[i].toCharArray()) {
                if (c == ' ') {
                    HashSet<String> currentSet = new HashSet<>();
                    for (char w : currentWord.toString().toCharArray()) {
                        currentSet.add(String.valueOf(w).toLowerCase());
                    }
                    // Retain only common words
                    commonWords.retainAll(currentSet);
                    currentWord.setLength(0); // Clear the StringBuilder
                } else {
                    currentWord.append(c);
                }
            }
            // Retain only common words after processing the last word
            HashSet<String> currentSet = new HashSet<>();
            for (char w : currentWord.toString().toCharArray()) {
                currentSet.add(String.valueOf(w).toLowerCase());
            }
            commonWords.retainAll(currentSet);
        }

        // Remove common words from each string
        String[] modifiedStrings = new String[strings.length];
        for (int i = 0; i < strings.length; i++) {
            currentWord.setLength(0); // Clear the StringBuilder
            for (char c : strings[i].toCharArray()) {
                if (c == ' ') {
                    if (!commonWords.contains(currentWord.toString().toLowerCase())) {
                        modifiedStrings[i] = (modifiedStrings[i] == null) ? currentWord.toString() : modifiedStrings[i] + " " + currentWord.toString();
                    }
                    currentWord.setLength(0); // Clear the StringBuilder
                } else {
                    currentWord.append(c);
                }
            }
            // Add the last word
            if (!commonWords.contains(currentWord.toString().toLowerCase())) {
                modifiedStrings[i] = (modifiedStrings[i] == null) ? currentWord.toString() : modifiedStrings[i] + " " + currentWord.toString();
            }
        }

        return modifiedStrings;
    }
}
