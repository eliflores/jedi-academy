package com.programming.exercises;

import java.util.*;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

class ArrayOperationsImpl implements ArrayOperations {
    @Override
    public int sumUsingStreams(int[] numbers) {
        if (numbers == null) {
            return 0;
        }
        return Arrays.stream(numbers).sum();
    }

    @Override
    public int sumUsingForLoop(int[] numbers) {
        if (numbers == null) {
            return 0;
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    @Override
    public int sumUsingWhileLoop(int[] numbers) {
        if (numbers == null) {
            return 0;
        }

        int index = 0;
        int sum = 0;
        while (index < numbers.length) {
            sum += numbers[index];
            index++;
        }
        return sum;
    }


    @Override
    public int sumUsingRecursion(int[] numbers) {
        if (numbers == null) {
            return 0;
        }

        int sum = 0;
        return sumNumbers(numbers, sum, 0);
    }

    @Override
    public int numberOccurringOddNumberOfTimes(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return -1;
        }

        Map<Integer, Integer> numberOfOccurrences = getNumberToOccurrencesMap(numbers);

        for (Map.Entry<Integer, Integer> numberToOccurrenceEntry : numberOfOccurrences.entrySet()) {
            if (numberToOccurrenceEntry.getValue() % 2 == 1) {
                return numberToOccurrenceEntry.getKey();
            }
        }

        return -1;
    }

    @Override
    public int[] numbersOccurringOddNumberOfTimes(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return new int[0];
        }

        Map<Integer, Integer> numberOfOccurrences = getNumberToOccurrencesMap(numbers);

        return numberOfOccurrences.entrySet()
                .stream()
                .filter(numberToOccurrenceEntry -> numberToOccurrenceEntry.getValue() % 2 == 1)
                .map(Map.Entry::getKey)
                .mapToInt(i -> i)
                .toArray();

    }

    @Override
    public int[][] findSumTuples(int[] numbers, int n) {
        if (numbers == null || numbers.length == 0) {
            return new int[0][];
        }
        Set<Integer> setOfNumbers = Arrays.stream(numbers).boxed().collect(Collectors.toSet());
        Map<Integer, Integer> tuples = new HashMap<>();

        Integer target;
        boolean isPresent;

        Iterator<Integer> iterator = setOfNumbers.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            target = n - number;
            isPresent = setOfNumbers.contains(target);
            if (isPresent) {
                tuples.put(number, target);
                iterator.remove();
            }
        }

        int tuplesResult[][] = new int[tuples.size()][2];
        int i = 0;
        for (Map.Entry<Integer, Integer> tuple : tuples.entrySet()) {
            tuplesResult[i][0] = tuple.getKey();
            tuplesResult[i][1] = tuple.getValue();
            i++;
        }
        return tuplesResult;
    }

    private int sumNumbers(int[] numbers, int sum, int index) {
        if (index == numbers.length) {
            return sum;
        }
        sum += numbers[index];
        return sumNumbers(numbers, sum, index + 1);
    }

    private Map<Integer, Integer> getNumberToOccurrencesMap(int[] numbers) {
        Map<Integer, Integer> numberOfOccurrences = new HashMap<>();
        for (int number : numbers) {
            Integer occurrence = 1;
            if (numberOfOccurrences.containsKey(number)) {
                occurrence = numberOfOccurrences.get(number) + 1;

            }
            numberOfOccurrences.put(number, occurrence);
        }
        return numberOfOccurrences;
    }
}
