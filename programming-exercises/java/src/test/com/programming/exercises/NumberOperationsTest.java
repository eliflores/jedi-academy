package com.programming.exercises;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberOperationsTest {
    @Test
    public void threeSum() {
        NumberOperations numberOperations = new NumberOperationsImpl();
        assertEquals(4, numberOperations.threeSum(new int[]{30, -40, -20, -10, 40, 0, 10, 5}));
    }

    @Test
    public void sumNumbers() throws Exception {
        NumberOperations numberOperations = new NumberOperationsImpl();
        assertEquals(15, numberOperations.sumNumbers(new int[]{30, -40, -20, -10, 40, 0, 10, 5}));
    }


}
