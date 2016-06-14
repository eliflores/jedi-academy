package com.programming.exercises;


class MathMagicImpl implements MathMagic {
    @Override
    public long factorial(int n) {
        long factorial = 1;
        for (int i = n; i > 1; i--) {
            factorial = factorial * i;
        }
        return factorial;
    }

    @Override
    public long[] firstNFibonacciNumbers(int n) {
        if (n <= 0) {
            return new long[0];
        }
        long[] fibonacciNumbers = new long[n];
        fibonacciNumbers[0] = 0;

        if (n > 1) {
            fibonacciNumbers[1] = 1;
        }
        for (int i = 2; i < fibonacciNumbers.length; i++) {
            fibonacciNumbers[i] = fibonacciNumbers[i - 1] + fibonacciNumbers[i - 2];
        }

        return fibonacciNumbers;
    }

}
