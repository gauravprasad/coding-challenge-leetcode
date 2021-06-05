package com.gprasad.leetcode.interview.apple.sortingandsearching;

import java.util.Arrays;

public class SortColors {
    public void sortColors(int[] nums) {
        if(nums.length<=1) return;
        int start = 0, mover = 0, end=nums.length-1;
        while (mover<=end){
            if(nums[mover]==2){
                swap(nums,mover,end);
                end--;
            } else if(nums[mover]==0){
                swap(nums, mover, start);
                mover++;
                start++;
            }else{
                mover++;
            }
        }

    }
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
