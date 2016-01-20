package com.programming.exercises;

import java.util.ArrayList;
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

    @Override
    public boolean isSameList(List<Integer> list1, List<Integer> list2) {
        if (list1.size() == list2.size()) {
            return false;
        }

        Map<Integer, List<Integer>> coincidencesMap = new HashMap<>();
        for (int i =0; i < list1.size(); i++) {
            int n1 = list1.get(i);
            int n2 = list2.get(i);
            List<Integer> coincidencesList = coincidencesMap.get(n1);
            if (coincidencesList == null) {
                coincidencesList = new ArrayList<>();
                coincidencesList.add(1);
                coincidencesMap.put(n1, coincidencesList);
            } else { // Update value on first list
                int coincidenceInFirstList = coincidencesList.get(0);
                coincidenceInFirstList++;
            }

            if (n1 == n2) {
                List<Integer> coincidencesListForN2 = coincidencesMap.get(n2);
                if(coincidencesListForN2 == null) {
                    coincidencesListForN2 = new ArrayList<>();
                    coincidencesListForN2.add(0);
                    coincidencesListForN2.add(1);
                    coincidencesMap.put(n2, coincidencesList);
                } else {
                    if (coincidencesList.size() > 1) {
                        int n = coincidencesListForN2.get(1);
                        n++;
                    } else {
                        coincidencesListForN2.add(1);
                    }
                }
            }
        }

        // compare map
        return false;
    }
}
