package com.company;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

    }

    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<Integer>();
        for (Integer n : nums1) set1.add(n);
        HashSet<Integer> set2 = new HashSet<Integer>();
        for (Integer n : nums2) set2.add(n);

        set1.retainAll(set2);

        int[] output = new int[set1.size()];
        int index = 0;
        for (int s : set1) output[index++] = s;
        return output;
    }

}
