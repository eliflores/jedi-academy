package com.programming.exercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.Test;

import static org.junit.Assert.*;

public class ListOperationsTest {

    @Test
    public void isSameList() {
        ListOperations listOperations = new ListOperationsImpl();
        assertTrue(listOperations.isSameList(Arrays.asList(1, 3, 4), Arrays.asList(4, 3, 1)));
        assertTrue(listOperations.isSameList(Arrays.asList(1, 1), Arrays.asList(1, 1)));
        assertTrue(listOperations.isSameList(Collections.EMPTY_LIST, Collections.EMPTY_LIST));
        assertFalse(listOperations.isSameList(Arrays.asList(1, 3, 5), Arrays.asList(4, 3, 1)));
        assertFalse(listOperations.isSameList(Arrays.asList(2, 1), Arrays.asList(4, 3, 1)));
        assertFalse(listOperations.isSameList(Collections.EMPTY_LIST, Arrays.asList(4, 3, 1)));
    }

    @Test
    public void testGetRotatedList() {
        ListOperations listOperations = new ListOperationsImpl();
        assertEquals(Collections.EMPTY_LIST, listOperations.getRotatedList(Collections.EMPTY_LIST, 0));
        assertEquals(Arrays.asList(1, 2, 3), listOperations.getRotatedList(Arrays.asList(1, 2, 3), 0));
        assertEquals(Arrays.asList(3, 1, 2), listOperations.getRotatedList(Arrays.asList(1, 2, 3), 1));
        assertEquals(Arrays.asList(2, 3, 1), listOperations.getRotatedList(Arrays.asList(1, 2, 3), 2));
        assertEquals(Arrays.asList(1, 2, 3), listOperations.getRotatedList(Arrays.asList(1, 2, 3), 3));
    }

    @Test(expected = AssertionError.class)
    public void testGetRotatedListWhenNIsGreaterThanTheSizeOfTheList() {
        ListOperations listOperations = new ListOperationsImpl();
        listOperations.getRotatedList(Arrays.asList(1, 2), 3);
    }

    @Test(expected = AssertionError.class)
    public void testGetRotatedListWhenNIsNegative() {
        ListOperations listOperations = new ListOperationsImpl();
        listOperations.getRotatedList(Arrays.asList(1, 2), -1);
    }

    @Test
    public void testRotateList() {
        ListOperations listOperations = new ListOperationsImpl();
        List<Integer> emptyList = Collections.EMPTY_LIST;
        listOperations.getRotatedList(emptyList, 0);

        List<Integer> listToBeRotated = Arrays.asList(1, 2, 3);

        listOperations.rotateList(listToBeRotated, 0);
        assertEquals(Arrays.asList(1, 2, 3), listToBeRotated);

        listOperations.rotateList(listToBeRotated, 1);
        assertEquals(Arrays.asList(3, 1, 2), listToBeRotated);

        listOperations.rotateList(listToBeRotated, 1);
        assertEquals(Arrays.asList(2, 3, 1), listToBeRotated);

        listOperations.rotateList(listToBeRotated, 1);
        assertEquals(Arrays.asList(1, 2, 3), listToBeRotated);

        listOperations.rotateList(listToBeRotated, 2);
        assertEquals(Arrays.asList(2, 3, 1), listToBeRotated);

        List<Integer> greaterListToBeRotated = Arrays.asList(1, 2, 3, 4, 7, 8);
        listOperations.rotateList(greaterListToBeRotated, 2);
        assertEquals(Arrays.asList(7, 8, 1, 2, 3, 4), greaterListToBeRotated);

        List<Integer> anotherListToBeRotated = Arrays.asList(1, 2, 3, 4, 7, 8);
        listOperations.rotateList(anotherListToBeRotated, 3);
        assertEquals(Arrays.asList(4, 7, 8, 1, 2, 3), anotherListToBeRotated);
    }

    @Test(expected = AssertionError.class)
    public void testRotateListWhenNIsGreaterThanTheSizeOfTheList() {
        ListOperations listOperations = new ListOperationsImpl();
        listOperations.rotateList(Arrays.asList(1, 2), 3);
    }

    @Test(expected = AssertionError.class)
    public void testRotateListWhenNIsNegative() {
        ListOperations listOperations = new ListOperationsImpl();
        listOperations.rotateList(Arrays.asList(1, 2), -1);
    }
}