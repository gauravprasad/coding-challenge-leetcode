package com.gprasad.leetcode.algorithms.easy;

public class MaximumSubarray {
    public int maxSubArray0(int[] nums) {
        int sum = Integer.MIN_VALUE;
        for (int start = 0; start < nums.length; start++) {
            int intrimSum = 0;
            for (int end = start; end < nums.length; end++) {
                intrimSum += nums[end];
                sum = Math.max(sum, intrimSum);
            }
        }
        return sum;
    }


    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int sum = nums[0];
        for (int idx = 1; idx < nums.length; idx++) {
            sum = Math.max(sum + nums[idx], nums[idx]);
            max = Math.max(sum, max);
        }
        return max;
    }

}
