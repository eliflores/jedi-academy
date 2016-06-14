package com.programming.exercises;

import java.util.Arrays;

class ArraysMiscExercises {
    /**
     * Function that compute the sum of the numbers in a given array using a streams.
     *
     * @param numbers
     * @return
     */
    int sumUsingStreams(int[] numbers) {
        if (numbers == null) {
            return 0;
        }
        return Arrays.stream(numbers).sum();
    }

    /**
     * Function that compute the sum of the numbers in a given array using a for-loop.
     *
     * @param numbers
     * @return
     */
    int sumUsingForLoop(int[] numbers) {
        if (numbers == null) {
            return 0;
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    /**
     * Function that compute the sum of the numbers in a given array using a while-loop.
     *
     * @param numbers
     * @return
     */
    int sumUsingWhileLoop(int[] numbers) {
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


    /**
     * Function that compute the sum of the numbers in a given array using recursion
     *
     * @param numbers
     * @return
     */
    int sumUsingRecursion(int[] numbers) {
        if (numbers == null) {
            return 0;
        }

        int sum = 0;
        return sumNumbers(numbers, sum, 0);
    }

    private int sumNumbers(int[] numbers, int sum, int index) {
        if (index == numbers.length) {
            return sum;
        }
        sum += numbers[index];
        return sumNumbers(numbers, sum, index + 1);
    }
}
