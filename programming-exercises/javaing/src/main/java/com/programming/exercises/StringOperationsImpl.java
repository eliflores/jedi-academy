package com.programming.exercises;

public class StringOperationsImpl implements StringOperations {
    @Override
    public int countSubstrings(String s, String substring) {
        if (s == null || s.length() == 0 || substring == null || substring.length() == 0) {
            return 0;
        }

        int indexOf;
        int substrings = 0;
        int substringLength = substring.length();
        int currentPosition = 0;
        while ((indexOf = s.indexOf(substring, currentPosition)) != -1) {
            currentPosition = indexOf + substringLength;
            substrings++;
        }

        return substrings;
    }

    @Override
    public boolean stringStartsWithUppercaseLetter(String s) {
        if (s == null || s.length() == 0) {
            return false;
        }

        char firstCharacter = s.charAt(0);
        return Character.isUpperCase(firstCharacter);

    }

}
