package com.programming.exercises.hackerrank;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Reference: https://www.hackerrank.com/challenges/java-dequeue
 */

public class Dequeue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        int n = in.nextInt();
        int m = in.nextInt();
        int max = 0;
        Map<Integer, Integer> mapOfOccurrences = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.add(num);
            if (mapOfOccurrences.containsKey(num)) {
                Integer occurrences = mapOfOccurrences.get(num);
                mapOfOccurrences.put(num, occurrences + 1);
            } else {
                mapOfOccurrences.put(num, 1);
            }

            if (deque.size() == m) {
                int size = mapOfOccurrences.size();
                if (size > max) {
                    max = size;
                }
                Integer firstNumber = deque.pop();
                Integer firstNumberOccurrences = mapOfOccurrences.get(firstNumber);
                int newNumberOfOccurrences = firstNumberOccurrences - 1;
                if (newNumberOfOccurrences == 0) {
                    mapOfOccurrences.remove(firstNumber);
                } else {
                    mapOfOccurrences.put(firstNumber, newNumberOfOccurrences);
                }
            }
        }
        System.out.println(max);
    }
}
