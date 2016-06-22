package com.programming.exercises;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MatrixOperationsTest {
    @Test
    public void rotateMatrix() throws Exception {
        MatrixOperations matrixOperations = new MatrixOperationsImpl();
        int[][] matrixWithSimplestRotation = new int[][]{
                new int[]{1, 2},
                new int[]{3, 4}
        };

        matrixOperations.rotateMatrix(matrixWithSimplestRotation);
        assertThat(matrixWithSimplestRotation[0], is(new int[]{3, 1}));
        assertThat(matrixWithSimplestRotation[1], is(new int[]{4, 2}));

        int[][] matrixWithoutRotatingCenter = new int[][]{
                new int[]{1, 2, 3},
                new int[]{4, 5, 6},
                new int[]{7, 8, 9}
        };

        matrixOperations.rotateMatrix(matrixWithoutRotatingCenter);

        assertThat(matrixWithoutRotatingCenter[0], is(new int[]{7, 4, 1}));
        assertThat(matrixWithoutRotatingCenter[1], is(new int[]{8, 5, 2}));
        assertThat(matrixWithoutRotatingCenter[2], is(new int[]{9, 6, 3}));

        int[][] matrixWithRotatingCenter = new int[][]{
                new int[]{1, 2, 3, 4},
                new int[]{5, 6, 7, 8},
                new int[]{9, 10, 11, 12},
                new int[]{13, 14, 15, 16}
        };

        matrixOperations.rotateMatrix(matrixWithRotatingCenter);

        assertThat(matrixWithRotatingCenter[0], is(new int[]{13, 9, 5, 1}));
        assertThat(matrixWithRotatingCenter[1], is(new int[]{14, 10, 6, 2}));
        assertThat(matrixWithRotatingCenter[2], is(new int[]{15, 11, 7, 3}));
        assertThat(matrixWithRotatingCenter[3], is(new int[]{16, 12, 8, 4}));

        int[][] matrixWithTwoCentersOneThatRotates = new int[][]{
                new int[]{1, 2, 3, 4, 5},
                new int[]{6, 7, 8, 9, 10},
                new int[]{11, 12, 13, 14, 15},
                new int[]{16, 17, 18, 19, 20},
                new int[]{21, 22, 23, 24, 25}
        };

        matrixOperations.rotateMatrix(matrixWithTwoCentersOneThatRotates);

        assertThat(matrixWithTwoCentersOneThatRotates[0], is(new int[]{21, 16, 11, 6, 1}));
        assertThat(matrixWithTwoCentersOneThatRotates[1], is(new int[]{22, 17, 12, 7, 2}));
        assertThat(matrixWithTwoCentersOneThatRotates[2], is(new int[]{23, 18, 13, 8, 3}));
        assertThat(matrixWithTwoCentersOneThatRotates[3], is(new int[]{24, 19, 14, 9, 4}));
        assertThat(matrixWithTwoCentersOneThatRotates[4], is(new int[]{25, 20, 15, 10, 5}));
    }
}