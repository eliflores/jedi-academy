package com.programming.exercises;

public interface ArrayOperations {
    /**
     * Method that compute the sum of the numbers in a given array using a streams.
     *
     * @param numbers
     * @return
     */
    int sumUsingStreams(int[] numbers);

    /**
     * Method that compute the sum of the numbers in a given array using a for-loop.
     *
     * @param numbers
     * @return
     */
    int sumUsingForLoop(int[] numbers);

    /**
     * Method that compute the sum of the numbers in a given array using a while-loop.
     *
     * @param numbers
     * @return
     */
    int sumUsingWhileLoop(int[] numbers);

    /**
     * Method that compute the sum of the numbers in a given array using recursion
     *
     * @param numbers
     * @return
     */
    int sumUsingRecursion(int[] numbers);

    /**
     * Method returns the number that appears an odd number of times in the array.
     *
     * @param numbers an array of int numbers greater than 0.
     * @return the <i>first</i> number that appears an odd number of times.
     * If no odd number is found, because <code>numbers</code> is null, empty or simply there is not a number that
     * appears an odd number of times, the method returns -1.
     */
    int numberOccurringOddNumberOfTimes(int[] numbers);

    /**
     * Method returns an array with the numbers that appear an odd number of times in the
     * array.
     *
     * @param numbers an array of int numbers greater than 0.
     * @return the <i>first</i> number that appears an odd number of times.
     * If no odd number is found, because <code>numbers</code> is null, empty or simply there no numbers that
     * appears an odd number of times, the method return an empty array.
     */
    int[] numbersOccurringOddNumberOfTimes(int[] numbers);

    /**
     * Method that returns an array of tuples that when added are equal to <code>n</code>
     * Example:
     *  Say numbers = [1, 2, 3, 4, 5, 6, 7, 10, -2, -7] and n = 3
     *
     *  The result should be:
     *
     *  [[1, 2], [5, -2], [10, -7]]
     *
     * @param numbers the array of numbers to build tuples from.
     * @param n the target number that the sum of each tuple should be equal to.
     * @return a matrix of 2 x 2 where each line represents a tuple.
     */
    int [][] findSumTuples(int [] numbers, int n);
}
