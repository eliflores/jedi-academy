package com.programming.exercises;

interface NumberOperations {
    /**
     * Given any N distinct integers, how many triples sum to exactly zero.
     *
     * @param numbers array of N integers.
     * @return number of triples that sum to exactly zero
     */
    int threeSum(int[] numbers);

    /**
     * Given a positive number <code>n</code> return the list of its digits ordered by weight (unit, ten, hundreds,
     * etc).
     * For example: 450, return [4, 5, 0]
     *
     * @param n
     * @return
     */
    int[] digits(int n);

    /**
     * Given an array of non negative integers, arrange them such that they form the largest possible number.
     * For example, given [50, 2, 1, 9], the largest formed number is 95021.
     *
     * @param numbers
     * @return The largest possible number from the combination of numbers in the list.
     */
    long largestArrangedNumber(int[] numbers);

    /**
     * Reverse an array of numbers
     *
     * @param numbers array to be reversed
     */
    void reverse(int[] numbers);

    /**
     * @param n Integer n.
     * @return the count the total of 1  +2 + ... + n
     */
    int sumOfPositiveIntegersInN(int n);

    /**
     * @param n
     * @return <code>true</code> if the number is prime, <code>false</code> if it's not.
     */
    boolean isPrime(int n);

    /**
     *
     * @param n where n is >= 0;
     * @return the sum of the digits in N.
     */
    int sumDigits(int n);
}
