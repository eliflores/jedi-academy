package com.programming.exercises;

public class MatrixOperationsImpl implements MatrixOperations {
    @Override
    public void rotateMatrix(int[][] numbers) {
        int n = numbers.length;
        int maxLimit = n - 1;
        int temp;
        int minLimitPerIteration = 0;
        int maxLimitPerIteration = maxLimit;

        int subtractFromMaxLimit;
        while (minLimitPerIteration < maxLimitPerIteration) {
            for (int i = minLimitPerIteration; i < maxLimitPerIteration; i++) {
                temp = numbers[minLimitPerIteration][i];
                numbers[minLimitPerIteration][i] = numbers[i][maxLimitPerIteration];
                numbers[i][maxLimitPerIteration] = temp;
            }

            subtractFromMaxLimit = 0;
            for (int i = minLimitPerIteration; i < maxLimitPerIteration; i++) {
                temp = numbers[minLimitPerIteration][i];
                numbers[minLimitPerIteration][i] = numbers[maxLimitPerIteration][maxLimitPerIteration - subtractFromMaxLimit];
                numbers[maxLimitPerIteration][maxLimitPerIteration - subtractFromMaxLimit] = temp;
                subtractFromMaxLimit++;
            }

            subtractFromMaxLimit = 0;
            for (int i = minLimitPerIteration; i < maxLimitPerIteration; i++) {
                temp = numbers[minLimitPerIteration][i];
                numbers[minLimitPerIteration][i] = numbers[maxLimitPerIteration - subtractFromMaxLimit][minLimitPerIteration];
                numbers[maxLimitPerIteration - subtractFromMaxLimit][minLimitPerIteration] = temp;
                subtractFromMaxLimit++;
            }

            minLimitPerIteration++;
            maxLimitPerIteration--;
        }
    }
}
