package com.gprasad.leetcode.algorithms.medium;

import java.util.Arrays;
//TODO: need to check back on this.
//TODO: need to check back on this.
/*
* Given an array nums of n integers and an integer target, find three integers in nums such that the sum is closest to target.
* Return the sum of the three integers. You may assume that each input would have exactly one solution.
*
Example 1:
*
Input: nums = [-1,2,1,-4], target = 1
Output: 2
Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
*
3 <= nums.length <= 10^3
-10^3 <= nums[i] <= 10^3
-10^4 <= target <= 10^4
* */
public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        int leastDiff = Integer.MAX_VALUE;
        int size = nums.length;
        Arrays.sort(nums);
        for(int i = 0;i<size && leastDiff!=0;i++ ){
            int lo = i+1, hi=size-1;
            while(lo<hi){
                int sum = nums[i]+nums[lo]+nums[hi];
                leastDiff = Math.min(leastDiff,Math.abs(target-sum));
                if(sum<target) lo++;
                else hi--;
            }
        }
        return target-leastDiff;
    }
}
