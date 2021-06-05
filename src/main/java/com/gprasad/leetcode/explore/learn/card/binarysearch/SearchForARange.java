package com.gprasad.leetcode.explore.learn.card.binarysearch;

public class SearchForARange {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        if (nums == null || nums.length == 0) return result;
        int left = 0, right = nums.length - 1;
        int idx = binarySearch(nums, target, 0, nums.length - 1);
        if (idx != -1) {
            result[0] = searchLeft(nums, target, left, idx - 1);
            result[1] = searchRight(nums, target, idx + 1, right);
        }
        return result;
    }

    private int binarySearch(int[] nums, int target, int low, int high) {
        while (low <= high) {
            int mid = low + (high - low);
            if (nums[mid] == target) return mid;
            if (nums[mid] > target) high = mid - 1;
            else low = mid + 1;
        }
        return -1;
    }

    private int searchLeft(int[] nums, int target, int low, int high) {
        int idx = binarySearch(nums, target, low, high);
        if (idx == -1 || high < 0) return low-1;
        return searchLeft(nums, target, low, idx - 1);
    }

    private int searchRight(int[] nums, int target, int low, int high) {
        int idx = binarySearch(nums, target, low, high);
        if (idx == -1 || low > nums.length - 1) return high + 1;
        return searchRight(nums, target, idx + 1, high);
    }
}
