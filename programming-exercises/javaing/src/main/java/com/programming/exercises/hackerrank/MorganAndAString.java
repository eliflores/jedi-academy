package com.programming.exercises.hackerrank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/morgan-and-a-string
 */

// This WIP! It is my current solution but still does not pass all test cases from Hacker Rank ...
public class MorganAndAString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTestCases = in.nextInt();
        String wordA;
        String wordB;
        for (int i = 0; i < numberOfTestCases; i++) {
            wordA = in.next();
            wordB = in.next();
            System.out.println(getTheLexicographicallyMinimalString(wordA, wordB));
        }
    }

    static String getTheLexicographicallyMinimalString(String wordA, String wordB) {
        int wordALength = wordA.length();
        int wordBLength = wordB.length();
        int indexInWordA = 0;
        int indexInWordB = 0;
        char charAtA;
        char charAtB;
        StringBuilder stringBuilder = new StringBuilder();
        while (indexInWordA < wordALength && indexInWordB < wordBLength) {
            charAtA = wordA.charAt(indexInWordA);
            charAtB = wordB.charAt(indexInWordB);
            if (charAtA < charAtB) {
                stringBuilder.append(charAtA);
                indexInWordA++;
            } else if (charAtB < charAtA) {
                stringBuilder.append(charAtB);
                indexInWordB++;
            } else { // char at A and B are equal so we need to find the optimal char to add based on the next chars in each word.
                if (compareOptimalChar(wordA, wordB, indexInWordA, indexInWordB) < 0) {
                    stringBuilder.append(charAtA);
                    indexInWordA++;
                } else {
                    stringBuilder.append(charAtB);
                    indexInWordB++;
                }
            }
        }

        stringBuilder.append(wordA.substring(indexInWordA, wordALength));
        stringBuilder.append(wordB.substring(indexInWordB, wordBLength));
        return stringBuilder.toString();
    }

    private static int compareOptimalChar(String wordA, String wordB, int indexInWordA, int indexInWordB) {
        char tempCharAtA;
        char tempCharAtB;
        int count = 1;
        int restOfWordALength = wordA.length() - indexInWordA;
        int restOfWordBLength = wordA.length() - indexInWordB;
        int limitOfSearch = Math.min(restOfWordALength, restOfWordBLength);
        while (count < limitOfSearch) {
            tempCharAtA = wordA.charAt(indexInWordA + count);
            tempCharAtB = wordB.charAt(indexInWordB + count);
            if (tempCharAtA != tempCharAtB) {
                return tempCharAtA - tempCharAtB;
            }
            count++;
        }
        return restOfWordBLength - restOfWordALength;
    }
}
