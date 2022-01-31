package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

    }

    public List<Integer> findClosestElements(int[] arr, int a, int b) {

        int left = 0;
        int right = arr.length - a;

        while (left < right) {
            int mid = (left + right) / 2;
            if (b - arr[mid] > arr[mid + a] - b) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        List<Integer> result = new ArrayList<Integer>();
        for (int i = left; i < left + a; i++) {
            result.add(arr[i]);
        }

        return result;
    }

}
