package com.gprasad.leetcode.interview.google.sortingsearching;

public class FindFirstAndLastPositionOfElementInSortedArray {
    public int[] searchRange(int[] nums, int target) {
        int startIdx = findIndex(nums, target, true);
        if (startIdx == -1) return new int[]{-1, -1};
        int endIdx = findIndex(nums, target, false);
        return new int[]{startIdx, endIdx};
    }

    private int findIndex(int[] nums, int target, boolean isFirst) {
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                if (isFirst) {
                    if (mid == start || nums[mid - 1] != target) {
                        return mid;
                    }
                    end = mid - 1;
                } else {
                    if (mid == end || nums[mid + 1] != target) {
                        return mid;
                    }
                    start = mid + 1;
                }
            } else {
                if (target < nums[mid]) end = mid - 1;
                else start = mid + 1;
            }
        }
        return -1;
    }
}
