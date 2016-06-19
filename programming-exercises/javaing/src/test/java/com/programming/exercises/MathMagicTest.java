package com.programming.exercises;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MathMagicTest {
    @Test
    public void factorial() {
        MathMagic mathMagic = new MathMagicImpl();
        assertThat(mathMagic.factorial(0), is(1L));
        assertThat(mathMagic.factorial(1), is(1L));
        assertThat(mathMagic.factorial(4), is(24L));
        assertThat(mathMagic.factorial(7), is(5040L));
        assertThat(mathMagic.factorial(9), is(362880L));
    }

    @Test
    public void factorialWithRecursion() {
        MathMagic mathMagic = new MathMagicImpl();
        assertThat(mathMagic.factorialWithRecursion(0), is(1L));
        assertThat(mathMagic.factorialWithRecursion(1), is(1L));
        assertThat(mathMagic.factorialWithRecursion(4), is(24L));
        assertThat(mathMagic.factorialWithRecursion(7), is(5040L));
        assertThat(mathMagic.factorialWithRecursion(9), is(362880L));

    }

    @Test
    public void firstNFibonacciNumbers() {
        MathMagic mathMagic = new MathMagicImpl();
        assertThat(mathMagic.firstNFibonacciNumbers(-1), is(new long[0]));
        assertThat(mathMagic.firstNFibonacciNumbers(0), is(new long[0]));
        assertThat(mathMagic.firstNFibonacciNumbers(1), is(new long[]{0L}));
        assertThat(mathMagic.firstNFibonacciNumbers(2), is(new long[]{0L, 1L}));
        assertThat(mathMagic.firstNFibonacciNumbers(3), is(new long[]{0L, 1L, 1L}));
        assertThat(mathMagic.firstNFibonacciNumbers(4), is(new long[]{0L, 1L, 1L, 2L}));
        assertThat(mathMagic.firstNFibonacciNumbers(10), is(new long[]{0L, 1L, 1L, 2L, 3L, 5L, 8L, 13L, 21L, 34L}));
    }
}