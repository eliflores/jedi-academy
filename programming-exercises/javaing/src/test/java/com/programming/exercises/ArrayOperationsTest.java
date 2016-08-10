package com.programming.exercises;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayOperationsTest {
    @Test
    public void sumUsingStreams() throws Exception {
        ArrayOperationsImpl arrayOperations = new ArrayOperationsImpl();
        assertThat(arrayOperations.sumUsingStreams(null), is(0));
        assertThat(arrayOperations.sumUsingStreams(new int[]{}), is(0));
        assertThat(arrayOperations.sumUsingStreams(new int[]{1}), is(1));
        assertThat(arrayOperations.sumUsingStreams(new int[]{1, 4, 5, 8}), is(18));

    }

    @Test
    public void sumUsingForLoop() {
        ArrayOperationsImpl arrayOperations = new ArrayOperationsImpl();
        assertThat(arrayOperations.sumUsingForLoop(null), is(0));
        assertThat(arrayOperations.sumUsingForLoop(new int[]{}), is(0));
        assertThat(arrayOperations.sumUsingForLoop(new int[]{1}), is(1));
        assertThat(arrayOperations.sumUsingForLoop(new int[]{1, 4, 5, 8}), is(18));
    }

    @Test
    public void sumUsingWhileLoop() {
        ArrayOperationsImpl arrayOperations = new ArrayOperationsImpl();
        assertThat(arrayOperations.sumUsingWhileLoop(null), is(0));
        assertThat(arrayOperations.sumUsingWhileLoop(new int[]{}), is(0));
        assertThat(arrayOperations.sumUsingWhileLoop(new int[]{1}), is(1));
        assertThat(arrayOperations.sumUsingWhileLoop(new int[]{1, 4, 5, 8}), is(18));
    }

    @Test
    public void sumUsingRecursion() {
        ArrayOperationsImpl arrayOperations = new ArrayOperationsImpl();
        assertThat(arrayOperations.sumUsingRecursion(null), is(0));
        assertThat(arrayOperations.sumUsingRecursion(new int[]{}), is(0));
        assertThat(arrayOperations.sumUsingRecursion(new int[]{1}), is(1));
        assertThat(arrayOperations.sumUsingRecursion(new int[]{1, 4, 5, 8}), is(18));
    }

    @Test
    public void numberOccurringOddNumberOfTimes() {
        ArrayOperationsImpl arrayOperations = new ArrayOperationsImpl();
        assertThat(arrayOperations.numberOccurringOddNumberOfTimes(null), is(-1));
        assertThat(arrayOperations.numberOccurringOddNumberOfTimes(new int[0]), is(-1));
        assertThat(arrayOperations.numberOccurringOddNumberOfTimes(new int[]{1, 1}), is(-1));
        assertThat(arrayOperations.numberOccurringOddNumberOfTimes(new int[]{1, 2, 2}), is(1));
        assertThat(arrayOperations.numberOccurringOddNumberOfTimes(new int[]{1, 1, 2, 3, 3}), is(2));
        assertThat(arrayOperations.numberOccurringOddNumberOfTimes(new int[]{1, 1, 2, 2, 3, 4, 5}), is(3));
        assertThat(arrayOperations.numberOccurringOddNumberOfTimes(new int[]{1, 1, 2, 2, 3, 3, 5, 5, 5}), is(5));
    }

    @Test
    public void numbersOccurringOddNumberOfTimes() throws Exception {
        ArrayOperationsImpl arrayOperations = new ArrayOperationsImpl();
        assertThat(arrayOperations.numbersOccurringOddNumberOfTimes(null), is(new int[0]));
        assertThat(arrayOperations.numbersOccurringOddNumberOfTimes(new int[0]), is(new int[0]));
        assertThat(arrayOperations.numbersOccurringOddNumberOfTimes(new int[]{1, 1}), is(new int[0]));
        assertThat(arrayOperations.numbersOccurringOddNumberOfTimes(new int[]{1, 2, 2}), is(new int[]{1}));
        assertThat(arrayOperations.numbersOccurringOddNumberOfTimes(new int[]{1, 1, 2, 3, 3}), is(new int[]{2}));
        assertThat(arrayOperations.numbersOccurringOddNumberOfTimes(new int[]{1, 1, 2, 2, 3, 4, 5}), is(new int[]{3, 4, 5}));
        assertThat(arrayOperations.numbersOccurringOddNumberOfTimes(new int[]{1, 1, 2, 2, 3, 3, 5, 5, 5}), is(new int[]{5}));

    }
}