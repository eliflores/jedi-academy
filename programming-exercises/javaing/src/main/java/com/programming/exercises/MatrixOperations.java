package com.programming.exercises;

public interface MatrixOperations {
    /**
     * Write a function to rotate an NxN matrix by 90 degrees. You should rotate it in place,
     * meaning you can't use another matrix to perform the rotation,
     * but instead you have to use the same given structure.
     *
     * Example:
     *
     *   m = {1,2,3,
     *        4,5,6,
     *        7,8,9}
     *
     * Becomes:
     *
     * mRotated = {7,4,1,
     *             8,5,2,
     *             9,6,3}
     *
     * @param numbers a matrix of numbers to be rotated.
     */
    void rotateMatrix(int[][] numbers);
}
