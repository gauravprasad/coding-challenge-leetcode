package com.gprasad.leetcode.interview.facebook.arraystrings;

public class NextPermutation {
    public void nextPermutation(int[] nums) {
        int last = nums.length-2;
        while(last>=0 && nums[last]>=nums[last+1]) last--;
        if(last>=0) {
            getNext(nums, last);
            reverse(nums, last+1);
        }
        else reverse(nums, 0);
    }

    private void reverse(int[] nums, int start) {
        int end=nums.length-1;
        while(start<end){
            swap(nums,start,end);
            start++;
            end--;
        }
    }

    private void getNext(int[] nums, int startIndex) {
        int index=startIndex+1;
        while(index<nums.length && (index == nums.length-1 || nums[startIndex] <= nums[index])) index++;
        swap(nums, startIndex, --index);
    }

    private void swap(int[] nums, int start, int end){
        nums[start] = nums[start]+nums[end];
        nums[end]=nums[start]-nums[end];
        nums[start] = nums[start]-nums[end];
    }
}
