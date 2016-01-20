package com.programming.exercises;

public class StringReverserImpl implements StringReverser {
    /**
     * Reverses a char array in place.
     *
     * @param arr - array to be reversed
     */
    public void reverse(char arr[]) {
        reverse(arr, 0, arr.length);
    }

    private void reverse(char arr[], int start, int end) {
        char temp;
        int arrLength = end - start;
        int endIndex = start + arrLength / 2;
        int tempIndex = start + arrLength - 1;
        for (int i = start; i < endIndex; i++) {
            temp = arr[tempIndex];
            arr[tempIndex] = arr[i];
            arr[i] = temp;
            tempIndex--;
        }
    }

    public void reverseWords(char arr[]) {
        reverse(arr);
        int arrLength = arr.length, startIndex = 0, endIndex = 0;
        for (int i = 0; i < arrLength; i++) {
            if (!isWhitespace(arr[i])) {
                endIndex++;
            } else {
                reverse(arr, startIndex, endIndex);
                startIndex = endIndex + 1;
            }
        }
        reverse(arr, startIndex, arrLength);
    }

    private boolean isWhitespace(char c) {
        return ' ' == c;
    }
}
