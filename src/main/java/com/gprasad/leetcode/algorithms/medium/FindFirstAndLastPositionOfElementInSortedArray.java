package com.gprasad.leetcode.algorithms.medium;

public class FindFirstAndLastPositionOfElementInSortedArray {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1,-1};
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                result[0]= result[0]==-1?i:result[0];
                result[1] = i;
            }
        }
        return result;
    }
}
