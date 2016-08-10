package com.programming.exercises;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayOperationsTest {
    private final ArrayOperationsImpl arrayOperations = new ArrayOperationsImpl();

    @Test
    public void sumUsingStreams() throws Exception {
        assertThat(arrayOperations.sumUsingStreams(null), is(0));
        assertThat(arrayOperations.sumUsingStreams(new int[]{}), is(0));
        assertThat(arrayOperations.sumUsingStreams(new int[]{1}), is(1));
        assertThat(arrayOperations.sumUsingStreams(new int[]{1, 4, 5, 8}), is(18));

    }

    @Test
    public void sumUsingForLoop() {
        assertThat(arrayOperations.sumUsingForLoop(null), is(0));
        assertThat(arrayOperations.sumUsingForLoop(new int[]{}), is(0));
        assertThat(arrayOperations.sumUsingForLoop(new int[]{1}), is(1));
        assertThat(arrayOperations.sumUsingForLoop(new int[]{1, 4, 5, 8}), is(18));
    }

    @Test
    public void sumUsingWhileLoop() {
        assertThat(arrayOperations.sumUsingWhileLoop(null), is(0));
        assertThat(arrayOperations.sumUsingWhileLoop(new int[]{}), is(0));
        assertThat(arrayOperations.sumUsingWhileLoop(new int[]{1}), is(1));
        assertThat(arrayOperations.sumUsingWhileLoop(new int[]{1, 4, 5, 8}), is(18));
    }

    @Test
    public void sumUsingRecursion() {
        assertThat(arrayOperations.sumUsingRecursion(null), is(0));
        assertThat(arrayOperations.sumUsingRecursion(new int[]{}), is(0));
        assertThat(arrayOperations.sumUsingRecursion(new int[]{1}), is(1));
        assertThat(arrayOperations.sumUsingRecursion(new int[]{1, 4, 5, 8}), is(18));
    }

    @Test
    public void numberOccurringOddNumberOfTimes() {
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
        assertThat(arrayOperations.numbersOccurringOddNumberOfTimes(null), is(new int[0]));
        assertThat(arrayOperations.numbersOccurringOddNumberOfTimes(new int[0]), is(new int[0]));
        assertThat(arrayOperations.numbersOccurringOddNumberOfTimes(new int[]{1, 1}), is(new int[0]));
        assertThat(arrayOperations.numbersOccurringOddNumberOfTimes(new int[]{1, 2, 2}), is(new int[]{1}));
        assertThat(arrayOperations.numbersOccurringOddNumberOfTimes(new int[]{1, 1, 2, 3, 3}), is(new int[]{2}));
        assertThat(arrayOperations.numbersOccurringOddNumberOfTimes(new int[]{1, 1, 2, 2, 3, 4, 5}), is(new int[]{3, 4, 5}));
        assertThat(arrayOperations.numbersOccurringOddNumberOfTimes(new int[]{1, 1, 2, 2, 3, 3, 5, 5, 5}), is(new int[]{5}));
    }

    @Test
    public void findSumTuples() {
        assertThat(arrayOperations.findSumTuples(null, 10), is(new int[0][]));
        assertThat(arrayOperations.findSumTuples(new int[0], 10), is(new int[0][]));
        assertThat(arrayOperations.findSumTuples(new int[0], -1), is(new int[0][]));
        assertThat(arrayOperations.findSumTuples(new int[]{1, 2, 3}, 10), is(new int[0][]));
        assertThat(arrayOperations.findSumTuples(new int[]{1, 2, 3}, -1), is(new int[0][]));
        assertThat(arrayOperations.findSumTuples(new int[]{3, 5}, 8), is(new int[][]{{3, 5}}));
        assertThat(arrayOperations.findSumTuples(new int[]{1, 2, 4, -1}, 3), is(new int[][]{{1, 2}, {4, -1}}));
        assertThat(arrayOperations.findSumTuples(new int[]{1, 2, 3, 4, 5, 6, 7, 10, -2, -7}, 3),
                is(new int[][]{{1, 2}, {5, -2}, {10, -7}}));

    }
}