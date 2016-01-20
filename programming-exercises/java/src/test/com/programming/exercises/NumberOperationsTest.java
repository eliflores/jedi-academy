package com.programming.exercises;

import java.util.Arrays;
import java.util.Collections;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberOperationsTest {
    @Test
    public void threeSum() {
        NumberOperations numberOperations = new NumberOperationsImpl();
        assertEquals(4, numberOperations.threeSum(new int[]{30, -40, -20, -10, 40, 0, 10, 5}));
    }

    @Test
    public void sumNumbers() {
        NumberOperations numberOperations = new NumberOperationsImpl();
        assertEquals(15, numberOperations.sumNumbers(new int[]{30, -40, -20, -10, 40, 0, 10, 5}));
    }

    @Test
    public void isSameList() {
        NumberOperations numberOperations = new NumberOperationsImpl();
        assertTrue(numberOperations.isSameList(Arrays.asList(1, 3, 4), Arrays.asList(4, 3, 1)));
        assertTrue(numberOperations.isSameList(Arrays.asList(1, 1), Arrays.asList(1, 1)));
        assertTrue(numberOperations.isSameList(Collections.EMPTY_LIST, Collections.EMPTY_LIST));
        assertFalse(numberOperations.isSameList(Arrays.asList(1, 3, 5), Arrays.asList(4, 3, 1)));
        assertFalse(numberOperations.isSameList(Arrays.asList(2, 1), Arrays.asList(4, 3, 1)));
        assertFalse(numberOperations.isSameList(Collections.EMPTY_LIST, Arrays.asList(4, 3, 1)));
    }
}
