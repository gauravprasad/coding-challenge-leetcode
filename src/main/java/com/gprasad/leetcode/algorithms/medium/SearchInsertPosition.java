/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gprasad.leetcode.algorithms.medium;

/**
 *
 * @author gq6pras
 */
public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        if (target <= nums[0]) {
            return 0;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (target > nums[i] && target <= nums[i + 1]) {
                return i + 1;
            }
        }

        return nums.length;
    }
}
