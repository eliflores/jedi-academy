package com.programming.exercises;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumberOperationsImpl implements NumberOperations {
    @Override
    public int threeSum(int[] numbers) {
        //TODO This is just a first approach, which is not the best one.
        int numberOfTriplets = 0;
        int arrayLength = numbers.length;
        for (int i = 0; i < arrayLength - 2; i++) {
            for (int j = i + 1; j < arrayLength - 1; j++) {
                for (int k = j + 1; k < arrayLength; k++) {
                    if (numbers[i] + numbers[j] + numbers[k] == 0) {
                        numberOfTriplets++;
                    }
                }
            }
        }

        return numberOfTriplets;
    }

    @Override
    public int sumNumbers(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        return sum;
    }
}
