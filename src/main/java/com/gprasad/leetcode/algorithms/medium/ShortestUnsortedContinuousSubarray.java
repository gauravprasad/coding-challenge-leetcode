package com.gprasad.leetcode.algorithms.medium;

import java.util.Arrays;
import java.util.Stack;

/*
581. Shortest Unsorted Continuous Subarray
Medium

Given an integer array nums, you need to find one continuous subarray that if you only sort this subarray in ascending order, then the whole array will be sorted in ascending order.

Return the shortest such subarray and output its length.



Example 1:

Input: nums = [2,6,4,8,10,9,15]
Output: 5
Explanation: You need to sort [6, 4, 8, 10, 9] in ascending order to make the whole array sorted in ascending order.
Example 2:

Input: nums = [1,2,3,4]
Output: 0
Example 3:

Input: nums = [1]
Output: 0


Constraints:

1 <= nums.length <= 104
-105 <= nums[i] <= 105


Follow up: Can you solve it in O(n) time complexity?

 */
public class ShortestUnsortedContinuousSubarray {
    public int findUnsortedSubarray(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        Stack<Integer> stack = new Stack<>();
        int start = nums.length, end = 0;
        boolean breakFlag = false;
        for (int idx = 0; idx < nums.length; idx++) {
            while (!stack.isEmpty() && nums[stack.peek()] > nums[idx]) {
                start = Math.min(start, stack.pop());
                breakFlag = true;
            }
            if (breakFlag) break;
            stack.push(idx);
        }
        stack.clear();
        breakFlag = false;
        for (int idx = nums.length - 1; idx >= 0; idx--) {
            while (!stack.isEmpty() && nums[stack.peek()] < nums[idx]) {
                end = Math.max(end, stack.pop());
                breakFlag = true;
            }
            if (breakFlag) break;
            stack.push(idx);
        }
        return end - start > 0 ? end - start + 1 : 0;
    }

    public int findUnsortedSubarrayCorrect(int[] nums) {//nlogn
        if (nums == null || nums.length == 0) return 0;
        int[] clone = nums.clone();
        Arrays.sort(nums);
        int start = nums.length, end = 0;
        for (int idx = 0; idx < nums.length; idx++) {
            if (nums[idx] != clone[idx]) {
                start = Math.min(start, idx);
                end = Math.max(end, idx);
            }
        }
        return end - start >= 0 ? end - start + 1 : 0;
    }


}