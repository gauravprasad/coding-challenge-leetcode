package com.gprasad.leetcode.explore.learn.card.binarysearch;

public class FindMinimumInRotatedSortedArrayII {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;
        if (nums[left] < nums[right]) return nums[left];
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[mid + 1]) return nums[mid + 1];
            if (nums[mid - 1] > nums[mid]) return nums[mid];
            if(nums[right]>nums[mid]) right = mid;
            else if(nums[mid]>nums[right]) left = mid+1;
            else right -= 1;
        }
        return nums[left];
    }
}
