package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

    }
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        return binarySearch(citations, 0, citations[citations.length - 1]);
    }

    public Integer binarySearch(int[] arr, int start, int end) {
        if(start > end) {
            return 0;
        }
        int test = (start + end) / 2;

        if(test == 0 || (arr.length - test >= 0 && arr[arr.length - test] >= test)) {
            Integer result = binarySearch(arr, test + 1, end);
            return result > test ? result : test;
        } else {
            return binarySearch(arr, start, test - 1);
        }
    }
}
