package com.gprasad.leetcode.algorithms.medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class KDiffPairsInAnArray {
    public int findPairs(int[] nums, int k) {
        Set<Integer> result = new HashSet<>();
        Arrays.sort(nums);
        for(int i = 0;i<nums.length-1;i++) {
            int x = Arrays.binarySearch(nums, i+1, nums.length, nums[i] + k);
            if(x>0){
                result.add(Math.min(nums[i],nums[i]+k));
            }
        }
        return result.size();
    }
}
