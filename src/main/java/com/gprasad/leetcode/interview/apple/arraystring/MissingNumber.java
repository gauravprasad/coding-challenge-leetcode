package com.gprasad.leetcode.interview.apple.arraystring;


public class MissingNumber {
    public int missingNumber(int[] nums) {
        int sum= 0;
        for(int num:nums)
            sum+=num;
        return (nums.length*(nums.length+1))/2-sum;
    }
}
