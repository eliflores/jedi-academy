package com.programming.exercises;

import java.util.List;

public interface NumberOperations {
    /**
     * Given any N distinct integers, how many triples sum to exactly zero.
     * @param numbers array of N integers.
     * @return number of triples that sum to exactly zero
     */
     int threeSum(int [] numbers);

    /**
     * @param numbers array of N integers.
     * @return return the sum of the numbers in the array.
     */
     int sumNumbers(int [] numbers);

    /**
     *
     * @param list1
     * @param list2
     * @return
     */
    boolean isSameList(List<Integer> list1, List<Integer> list2);

}
