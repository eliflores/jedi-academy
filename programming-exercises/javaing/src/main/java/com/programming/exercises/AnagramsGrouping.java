package com.programming.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * This program reads one word per line (all lowercase) and prints out all the anagram groups that meet a size criterion.
 * Parameters:
 * 1. The min group size
 * 2. The number of words to enter
 * 3. A word per line according to the parameter in 2.
 *
 * <p>
 * An anagram group is a bunch of words, all of which contain exactly the same letters but in a different order.
 * The program takes two arguments on the command line: (1) the name of the dictionary file and (2)
 * the minimum size of anagram group to print out. Anagram groups containing fewer words than the specified
 * minimum are not printed.
 * <p>
 *
 * Source for example: https://docs.oracle.com/javase/tutorial/collections/interfaces/map.html
 */
public class AnagramsGrouping {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int minGroupSize = in.nextInt();
        int numberOfWords = in.nextInt();

        Map<String, List<String>> groupedWordsMap = new HashMap<>();
        for (int i = 0; i < numberOfWords; i++) {
            String word = in.next();
            String alphabetizedWord = getAlphabetizedWord(word);
            List<String> anagrams = groupedWordsMap.get(alphabetizedWord);
            if (anagrams == null) {
                anagrams = new ArrayList<>();
                groupedWordsMap.put(alphabetizedWord, anagrams);
            }
            anagrams.add(word);
        }

        groupedWordsMap.values().stream().filter(anagrams -> anagrams.size() >= minGroupSize)
            .forEach(anagrams -> System.out.println(anagrams.size() + ":" + anagrams));
    }

    private static String getAlphabetizedWord(String word) {
        char[] a = word.toCharArray();
        Arrays.sort(a);
        return new String(a);
    }
}
