package com.programming.exercises;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class NumberOperationsTest {
    private final NumberOperations numberOperations = new NumberOperationsImpl();

    @Test
    public void threeSum() {
        assertEquals(4, numberOperations.threeSum(new int[]{30, -40, -20, -10, 40, 0, 10, 5}));
    }

    @Test
    public void largestArrangedNumber() {
        assertEquals(0, numberOperations.largestArrangedNumber(null));
        assertEquals(0, numberOperations.largestArrangedNumber(new int[0]));
        assertEquals(1, numberOperations.largestArrangedNumber(new int[]{1}));
        assertEquals(21, numberOperations.largestArrangedNumber(new int[]{1, 2}));
        assertEquals(321, numberOperations.largestArrangedNumber(new int[]{1, 2, 3}));
        assertEquals(3210, numberOperations.largestArrangedNumber(new int[]{1, 2, 3, 0}));
        assertEquals(95021, numberOperations.largestArrangedNumber(new int[]{50, 2, 1, 9}));
        assertEquals(8531500, numberOperations.largestArrangedNumber(new int[]{150, 3, 0, 8, 5}));
    }

    @Test
    public void digits() {
        assertThat(numberOperations.digits(0), is(new int[]{0}));
        assertThat(numberOperations.digits(1), is(new int[]{1}));
        assertThat(numberOperations.digits(10), is(new int[]{1, 0}));
        assertThat(numberOperations.digits(25), is(new int[]{2, 5}));
        assertThat(numberOperations.digits(489), is(new int[]{4, 8, 9}));
        assertThat(numberOperations.digits(3589), is(new int[]{3, 5, 8, 9}));
    }

    @Test
    public void reverse() {
        int[] emptyArray = new int[0];
        numberOperations.reverse(emptyArray);
        assertThat(emptyArray.length, is(0));

        int[] singleElementArray = new int[]{10};
        numberOperations.reverse(singleElementArray);
        assertThat(singleElementArray[0], is(10));

        int[] oddNumberOfElements = {1, 2, 3};
        numberOperations.reverse(oddNumberOfElements);
        assertThat(oddNumberOfElements[0], is(3));
        assertThat(oddNumberOfElements[1], is(2));
        assertThat(oddNumberOfElements[2], is(1));

        int[] pairNumberOfElements = {4, 1, 3, 2};
        numberOperations.reverse(pairNumberOfElements);
        assertThat(pairNumberOfElements[0], is(2));
        assertThat(pairNumberOfElements[1], is(3));
        assertThat(pairNumberOfElements[2], is(1));
        assertThat(pairNumberOfElements[3], is(4));
    }

    @Test
    public void sumOfPositiveIntegersInN() {
        assertThat(numberOperations.sumOfPositiveIntegersInN(0), is(0));
        assertThat(numberOperations.sumOfPositiveIntegersInN(1), is(1));
        assertThat(numberOperations.sumOfPositiveIntegersInN(2), is(3));
        assertThat(numberOperations.sumOfPositiveIntegersInN(3), is(6));
        assertThat(numberOperations.sumOfPositiveIntegersInN(8), is(36));
    }

    @Test
    public void isPrime() {
        assertFalse(numberOperations.isPrime(-1));
        assertFalse(numberOperations.isPrime(0));
        assertFalse(numberOperations.isPrime(1));

        assertFalse(numberOperations.isPrime(4));
        assertFalse(numberOperations.isPrime(33));

        assertTrue(numberOperations.isPrime(2));
        assertTrue(numberOperations.isPrime(3));
        assertTrue(numberOperations.isPrime(5));
        assertTrue(numberOperations.isPrime(31));
    }
}
