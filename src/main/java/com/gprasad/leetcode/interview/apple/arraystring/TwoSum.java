package com.gprasad.leetcode.interview.apple.arraystring;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int idx = 0; idx<nums.length; idx++ ){
            int find = target-nums[idx];
            if(map.containsKey(find)) return new int[]{map.get(find), idx};
            else map.put(nums[idx], idx);
        }
        return new int[]{};
    }
}
