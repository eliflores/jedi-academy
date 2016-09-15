package com.programming.exercises;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class NumberOperationsImpl implements NumberOperations {
    @Override
    public int threeSum(int[] numbers) {
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
    public int[] digits(int n) {
        if (n == 0) {
            return new int[]{0};
        }

        int exp = 0;
        int div;
        List<Integer> digits = new ArrayList<>();
        while ((div = n / (int) Math.pow(10, exp)) > 0) {
            digits.add(div % 10);
            exp++;
        }
        Collections.reverse(digits);
        return digits.stream().mapToInt(i -> i).toArray();
    }

    @Override
    public long largestArrangedNumber(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return 0;
        }

        Map<Integer, List<Integer>> numberToDigitsMap = buildNumberToDigitsMap(numbers);
        List<Integer> numbersSortedByWeight = getListOfNumbersSortedByWeight(numberToDigitsMap);

        int sumOfDigitsLengths = numberToDigitsMap.values().stream().mapToInt(List::size).sum();
        int exponent = sumOfDigitsLengths - 1;
        long largestNumber = 0;
        for (int number : numbersSortedByWeight) {
            for (int digit : numberToDigitsMap.get(number)) {
                largestNumber += (digit * (long) Math.pow(10, exponent));
                exponent--;
            }
        }

        return largestNumber;
    }

    private List<Integer> getListOfNumbersSortedByWeight(Map<Integer, List<Integer>> numberToDigitsMap) {
        return numberToDigitsMap.keySet().stream().sorted((n1, n2) -> {
            int n1HighestWeight = numberToDigitsMap.get(n1).get(0);
            int n2HighestWeight = numberToDigitsMap.get(n2).get(0);
            return Integer.compare(n2HighestWeight, n1HighestWeight);
        }).collect(Collectors.toList());
    }

    private Map<Integer, List<Integer>> buildNumberToDigitsMap(int[] numbers) {
        Map<Integer, List<Integer>> numberToDigitsMap = new HashMap<>();
        for (int number : numbers) {
            int[] digits = digits(number);
            numberToDigitsMap.put(number, Arrays.stream(digits).boxed().collect(Collectors.toList()));
        }
        return numberToDigitsMap;
    }

    @Override
    public void reverse(int[] numbers) {
        if (numbers != null && numbers.length > 1) {
            int limit = numbers.length / 2;
            int temp;
            for (int i = 0; i < limit; i++) {
                temp = numbers[i];
                numbers[i] = numbers[numbers.length - (i + 1)];
                numbers[numbers.length - (i + 1)] = temp;
            }
        }
    }

    @Override
    public int sumOfPositiveIntegersInN(int n) {
        if (n == 1) {
            return 1;
        }
        return (int) Math.ceil(n * (n + 1) / (double) 2);
    }

    @Override
    public boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int sumDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
