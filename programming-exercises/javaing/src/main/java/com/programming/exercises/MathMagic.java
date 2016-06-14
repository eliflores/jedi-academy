package com.programming.exercises;

interface MathMagic {
    /**
     * Factorial is calculated by multiplying a series of descending natural
     * numbers
     * @param n
     * @return Returns the factorial of <code>n</code>.
     */
    long factorial(int n);

    /**
     * Computes the list of the first N Fibonacci numbers. By definition, the first two numbers in the Fibonacci
     * sequence are 0 and 1, and each subsequent number is the sum of the previous two.
     * As an example, here are the first 10 Fibonacci numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, and 34.
     * @param n first Fibonacci numbers to be computed
     * @return an array with the first <code>n</code> Fibonacci numbers
     */
    long[] firstNFibonacciNumbers(int n);
}
