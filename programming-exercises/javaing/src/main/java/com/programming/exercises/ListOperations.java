package com.programming.exercises;

import java.util.List;
import java.util.Objects;

public interface ListOperations {
    /**
     *
     * @param list1
     * @param list2
     * @return <code>true</code> if lists are equal (have the same elements not necessarily in the same order)
     */
    boolean isSameList(List<Integer> list1, List<Integer> list2);

    /**
     *
     * @param list original list
     * @param n positions to be rotated.
     * @return a rotated list by <code>n</code> positions.
     */
    List<Integer> getRotatedList(List<Integer> list, int n);

    /**
     * Rotate <code>list</code> by <code>n</code> positions. The difference with rotatedList is that in this case, rotation
     * happens on the same <code>list</code>.
     * @param list list to be rotated
     * @param n positions to be rotated.
     */
    void rotateList(List<Integer> list, int n);

    /**
     * Method that combines two lists by alternatingly taking elements.
     * For example: given the two lists [a, b, c] and [1, 2, 3], the function should return [a, 1, b, 2, c, 3].
     * @param listA
     * @param listB
     * @return
     */
    List<Object> combineLists(List<Object> listA, List<Object> listB);
}
