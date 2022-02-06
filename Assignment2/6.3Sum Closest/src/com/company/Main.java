package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

    }
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans = Integer.MAX_VALUE/2;
        for(int i = 0; i < nums.length; i++){
            int l = i + 1;
            int r = nums.length - 1;
            int k = target - nums[i];
            while(l < r){

                int sum = nums[i] + nums[l] + nums[r];
                if(Math.abs(sum-target)<Math.abs(ans-target)){
                    ans = sum;
                }

                if( k < nums[l] + nums[r]){
                    r--;
                }else if( k > nums[l] + nums[r]){
                    l++;
                }else{
                    return target;
                }

            }
        }
        return ans;
    }
}
