package com.company;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

    }
    public List<Integer> majorityElement(int[] nums) {
        int count1 = 0;
        int count2 = 0;
        Integer candidate1 = null;
        Integer candidate2 = null;

        for (int n: nums) {
            if (candidate1 != null && candidate1 == n) {
                count1++;
            } else if (candidate2 != null && candidate2 == n) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = n;
                count1++;
            } else if (count2 == 0) {
                candidate2 = n;
                count2++;
            } else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;
        for(int num : nums) {
            if(candidate1 != null && num == candidate1) {
                count1++;
            }
            if(candidate2 != null && num == candidate2) {
                count2++;
            }
        }

        System.out.println(count1);
        System.out.println(count2);

        List<Integer> result = new LinkedList<Integer>();
        if(count1 > nums.length / 3) {
            result.add(candidate1);
        }
        if(count2 > nums.length / 3) {
            result.add(candidate2);
        }

        return result;
    }
}
