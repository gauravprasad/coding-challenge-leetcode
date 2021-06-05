package com.gprasad.leetcode.interview.facebook.arraystrings;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int lastDistinct=0;
        for(int i=0;i<nums.length;i++){
            if(i==0||nums[i]!=nums[i-1]) nums[lastDistinct++]=nums[i];
        }
        return lastDistinct;
    }
}
