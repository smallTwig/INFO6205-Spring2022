package com.company;

public class Main {

    public static void main(String[] args) {

    }

        public void sortColors(int[] nums) {
            int first = 0;
            int second = 0;
            while(first < nums.length) {
                if(second >= nums.length) {
                    first++;
                    second = first + 1;
                } else if (nums[first] > nums[second]) {
                    swap(nums, first, second);
                    second = first + 1;
                }
                else {
                    second++;
                }
            }
        }

        private void swap(int[] nums, int index1, int index2) {
            int valueHolder = nums[index1];
            nums[index1] = nums[index2];
            nums[index2] = valueHolder;
        }
    }

