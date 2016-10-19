package com.programming.exercises;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

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
        assertThat(arrayOperations.findSumTuples(new int[]{1, 2, 4, -1}, 3), is(new int[][]{{-1, 4}, {1, 2}}));
        assertThat(arrayOperations.findSumTuples(new int[]{1, 2, 3, 4, 5, 6, 7, 10, -2, -7}, 3),
                is(new int[][]{{1, 2}, {-2, 5}, {-7, 10}}));

    }

    @Test
    public void hasElement() {
        assertFalse(arrayOperations.hasElement(null, 10));
        assertFalse(arrayOperations.hasElement(new int[]{}, 10));
        assertFalse(arrayOperations.hasElement(new int[]{4}, 10));
        assertFalse(arrayOperations.hasElement(new int[]{4, 5}, 10));
        assertFalse(arrayOperations.hasElement(new int[]{1, 4, 5, 10}, 20));

        assertTrue(arrayOperations.hasElement(new int[]{4}, 4));
        assertTrue(arrayOperations.hasElement(new int[]{-10, -5}, -10));
        assertTrue(arrayOperations.hasElement(new int[]{-10, -5}, -5));
        assertTrue(arrayOperations.hasElement(new int[]{-1, 4, 5, 10}, -1));
        assertTrue(arrayOperations.hasElement(new int[]{1, 4, 5, 10}, 10));
        assertTrue(arrayOperations.hasElement(new int[]{1, 4, 5, 10}, 1));
        assertTrue(arrayOperations.hasElement(new int[]{1, 4, 5, 10}, 4));
        assertTrue(arrayOperations.hasElement(new int[]{1, 4, 5, 10}, 5));
    }

    @Test
    public void mergeArrays() {
        assertThat(arrayOperations.mergeArrays(null, null), is(new int[0]));
        assertThat(arrayOperations.mergeArrays(null, new int[0]), is(new int[0]));
        assertThat(arrayOperations.mergeArrays(new int[0], null), is(new int[0]));
        assertThat(arrayOperations.mergeArrays(null, new int[]{2, 3}), is(new int[]{2, 3}));
        assertThat(arrayOperations.mergeArrays(new int[]{2, 3}, null), is(new int[]{2, 3}));
        assertThat(arrayOperations.mergeArrays(new int[0], new int[]{2, 3}), is(new int[]{2, 3}));
        assertThat(arrayOperations.mergeArrays(new int[]{2, 3}, new int[0]), is(new int[]{2, 3}));

        assertThat(arrayOperations.mergeArrays(new int[]{14}, new int[]{33}), is(new int[]{14, 33}));
        assertThat(arrayOperations.mergeArrays(new int[]{27}, new int[]{10}), is(new int[]{10, 27}));
        assertThat(arrayOperations.mergeArrays(new int[]{14, 33}, new int[]{10, 27}), is(new int[]{10, 14, 27, 33}));
        assertThat(arrayOperations.mergeArrays(new int[]{19, 35}, new int[]{42, 44}), is(new int[]{19, 35, 42, 44}));
        assertThat(arrayOperations.mergeArrays(new int[]{10, 14, 27, 33}, new int[]{19, 35, 42, 44,}), is(new
                int[]{10, 14, 19, 27, 33, 35, 42, 44}));
    }

    @Test
    public void sortArrayUsingMergeSort() {
        int[] emptyArrayOfNumbers = new int[]{};
        assertThat(arrayOperations.sortArrayUsingMergeSort(emptyArrayOfNumbers), is(new int[]{}));

        int[] oneElementArray = new int[]{1};
        assertThat(arrayOperations.sortArrayUsingMergeSort(oneElementArray), is(new int[]{1}));

        int[] twoElementArray = new int[]{4, -5};
        assertThat(arrayOperations.sortArrayUsingMergeSort(twoElementArray), is(new int[]{-5, 4}));

        int[] sortedArray = new int[]{-1, 0, 1};
        assertThat(arrayOperations.sortArrayUsingMergeSort(sortedArray), is(new int[]{-1, 0, 1}));

        int[] unsortedArray = new int[]{1000, 10000, 0, 10, -100000};
        assertThat(arrayOperations.sortArrayUsingMergeSort(unsortedArray), is(new int[]{-100000, 0, 10, 1000, 10000}));
    }
}