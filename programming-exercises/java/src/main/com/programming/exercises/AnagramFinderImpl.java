package com.programming.exercises;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class AnagramFinderImpl implements AnagramFinder {
    /**
     * This method returns TRUE if s1 and s2 are anagrams based on the fact that two two strings are anagrams if they have the same characters
     * the same number of times.
     */
    @Override
    public boolean areAnagrams(String s1, String s2) {
        s1 = s1.replaceAll(" ", "").toLowerCase();
        s2 = s2.replaceAll(" ", "").toLowerCase();
        return sameNumberOfCharOccurrences(s1, s2);
    }

    private boolean sameNumberOfCharOccurrences(String s1, String s2) {
        Map<Character, Integer> charOccurrences = new HashMap<>();

        Character character;
        for (int i = 0; i < s1.length(); i++) {
            character = s1.charAt(i);
            if (charOccurrences.get(character) == null) {
                charOccurrences.put(character, 1);
            } else {
                charOccurrences.put(character, charOccurrences.get(character) + 1);
            }
        }

        for (int i = 0; i < s2.length(); i++) {
            character = s2.charAt(i);
            if (charOccurrences.get(character) != null) {
                charOccurrences.put(character, charOccurrences.get(character) - 1);
            }
        }

        return allValuesInCollectionAreZero(charOccurrences.values());
    }

    private boolean allValuesInCollectionAreZero(Collection<Integer> values) {
        for (Integer value : values) {
            if (value != 0) {
                return false;
            }
        }
        return true;
    }
}
