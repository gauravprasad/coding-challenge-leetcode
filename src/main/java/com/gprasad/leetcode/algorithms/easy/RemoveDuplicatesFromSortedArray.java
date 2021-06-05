package com.gprasad.leetcode.algorithms.easy;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int i = 1;
        int lastIndex = 0;
        while(i<nums.length){
            if(nums[i]==nums[lastIndex]){
                i++;
                continue;
            }
            nums[lastIndex++]=nums[i];
            i++;
        }
        return lastIndex;
    }
}
