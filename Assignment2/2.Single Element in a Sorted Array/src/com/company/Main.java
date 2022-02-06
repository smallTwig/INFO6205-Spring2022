package com.company;

public class Main {

    public static void main(String[] args) {

    }
    public int singleNonDuplicate(int[] nums) {

        int left = 0;
        int mid = 0;
        int right = nums.length-1;

        while (left <= right){
            mid = left + (right - left )/2;
            if ((mid == 0 || nums[mid]!= nums[mid-1]) &&
                    (mid == nums.length -1 || nums[mid]!= nums[mid+1])){
                return nums[mid];
            }
            if (nums[mid] == nums[mid+1]){
                if ((mid - left)%2 == 1){
                    right = mid -1;
                }else{
                    left = mid + 2;
                }
            }else if(nums[mid] == nums[mid-1]){
                if ((right - mid)%2 == 1){
                    left = mid + 1;
                }else{
                    right = mid -2;
                }
            }
        }
        return nums[left];
    }
}
