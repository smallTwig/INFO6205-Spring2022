package com.company;

public class Main {

    public static void main(String[] args) {

    }
    public int findMin(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        if(nums[0]<nums[nums.length -1]){
            return nums[0];
        }

        return findRotatedIndex(nums,0,nums.length-1);
    }

    public int findRotatedIndex(int[]arr, int start, int end){
        if(start == end){
            return arr[start];
        }
        int mid = (start + end)/2;
        if(arr[mid] < arr[0]){
            return findRotatedIndex(arr, start, mid);
        }else{
            return findRotatedIndex(arr, mid+1, end);
        }
    }
}
