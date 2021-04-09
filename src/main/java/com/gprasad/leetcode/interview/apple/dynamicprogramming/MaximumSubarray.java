package com.gprasad.leetcode.interview.apple.dynamicprogramming;

public class MaximumSubarray {
    //bruteforce
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int i=0; i<nums.length;i++){
            int sum = 0;
            for(int j=i;j<nums.length;j++){
                sum = sum+nums[j];
                max = Math.max(sum, max);
            }
        }
        return max;
    }

    //optimized
    public int maxSubArray2(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        boolean initializer = true;
        for(int idx = 0;idx<nums.length;idx++){
            if(initializer) {
                sum = nums[idx];
                initializer = false;
            }
            else {
                sum = Math.max(nums[idx], sum+nums[idx]);
                max = Math.max(sum, max);
            }
        }
        return max;
    }

    //optimized again
    public int maxSubArray3(int[] nums) {
        int max = nums[0];
        int sum = nums[0];
        for(int idx = 1;idx<nums.length;idx++){
           sum = Math.max(sum+nums[idx], nums[idx]);
           max = Math.max(sum, max);
        }
        return max;
    }
}
