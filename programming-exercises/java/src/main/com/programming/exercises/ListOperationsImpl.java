package com.programming.exercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListOperationsImpl implements ListOperations {
    @Override
    public boolean isSameList(List<Integer> list1, List<Integer> list2) {
        if (list1.size() != list2.size()) {
            return false;
        }

        Map<Integer, Integer> appearancesMap = new HashMap<>();
        for (int i = 0; i < list1.size(); i++) {
            int n1 = list1.get(i);
            int n2 = list2.get(i);
            incrementAppearances(appearancesMap, n1);
            incrementAppearances(appearancesMap, n2);
        }

        for (Integer appearances : appearancesMap.values()) {
            if (appearances % 2 != 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public List<Integer> getRotatedList(List<Integer> list, int n) {
        int listSize = list.size();
        if (n > listSize) {
            throw new AssertionError("n cannot be greater than the size of the list");
        }
        if (n < 0) {
            throw new AssertionError("n cannot be negative");
        }

        List<Integer> rotatedList = new ArrayList<>();
        for (int i = listSize - n; i < listSize; i++) {
            rotatedList.add(list.get(i));
        }

        for (int i = 0; i < listSize - n; i++) {
            rotatedList.add(list.get(i));
        }

        return rotatedList;
    }

    @Override
    public void rotateList(List<Integer> list, int n) {
        int listSize = list.size();
        if (n > listSize) {
            throw new AssertionError("n cannot be greater than the size of the list");
        }
        if (n < 0) {
            throw new AssertionError("n cannot be negative");
        }

        int j = listSize - n;
        int k = n;
        int tempi;
        int tempk;
        for (int i = 0; i < j && k < listSize && j < listSize; i++) {
            tempi = list.get(i);
            tempk = list.get(k);
            list.set(i, list.get(j));
            list.set(k, tempi);
            if (j != k) {
                list.set(j, tempk);
            }
            j++;
            k++;
        }
    }

    private void incrementAppearances(Map<Integer, Integer> coincidencesMap, int number) {
        Integer numberOfAppearances = coincidencesMap.get(number);
        if (numberOfAppearances != null) {
            coincidencesMap.put(number, numberOfAppearances + 1);
        } else {
            coincidencesMap.put(number, 1);
        }
    }
}
