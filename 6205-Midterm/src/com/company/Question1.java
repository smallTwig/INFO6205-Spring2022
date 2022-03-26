package com.company;

import java.util.ArrayList;
import java.util.List;

public class Question1 {

        public List<String> MissingRanges(int[] nums, int lower, int upper) {

            List<String> ans = new ArrayList<>();
            int first = lower - 1;

            for (int i = 0; i <= nums.length; i++) {
                int second = (i < nums.length) ? nums[i] : upper + 1;
                if (first + 1 <= second - 1) {
                    ans.add(range(first + 1, second - 1));
                }
                first = second;
            }
            return ans;
        }

        private String range(int lower, int upper) {
            if (lower == upper) {
                return String.valueOf(lower);
            }
            return lower + "->" + upper;
        }

    }

