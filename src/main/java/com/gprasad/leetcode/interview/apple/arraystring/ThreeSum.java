package com.gprasad.leetcode.interview.apple.arraystring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TODO: need to solve
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length == 0) return result;
        Arrays.sort(nums);
        for (int idx = 0; idx < nums.length; idx++) {
            if (idx == 0 || nums[idx] != nums[idx - 1]) {
                int left = idx + 1;
                int right = nums.length - 1;
                while (left < right) {
                    int sum = nums[idx] + nums[left] + nums[right];
                    if (sum < 0) left++;
                    else if (sum > 0) right--;
                    else {
                        result.add(Arrays.asList(nums[idx], nums[left++], nums[right--]));
                        while (left < right && nums[left] == nums[right]) left++;
                    }

                }
            }
        }
        return result;
    }
}
