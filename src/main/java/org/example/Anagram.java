package org.example;

import java.util.Arrays;

public class Anagram {

    private static String standardize(String input) {
        input = input.replaceAll("\\s", "").toLowerCase();
        char[] characters = input.toCharArray();
        Arrays.sort(characters);
        return new String(characters);
    }

    public static boolean verifyAnagram(String... inputs) {

        if (inputs.length < 2) {
            throw new RuntimeException("At least two strings are required for comparison.");
        }

        String firstStandardized = standardize(inputs[0]);

        for (int index = 1; index < inputs.length; index++) {
            String currentStandardized = standardize(inputs[index]);

            if (!firstStandardized.equals(currentStandardized)) {
                return false;
            }
        }

        return true;
    }
}
