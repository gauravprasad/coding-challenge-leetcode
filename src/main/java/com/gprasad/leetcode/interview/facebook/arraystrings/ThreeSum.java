package com.gprasad.leetcode.interview.facebook.arraystrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length && nums[i]<=0;i++){
            if(i==0||nums[i]!=nums[i-1]){
                twoSum(nums, i, result);
            }
        }
        return result;
    }

    private void twoSum(int[] nums, int i, List<List<Integer>> result) {
        int lo = i+1, hi=nums.length-1;
        while(lo<hi){
            int sum = nums[i]+nums[lo]+nums[hi];
            if(sum<0) lo++;
            else if (sum>0) hi--;
            else {
                result.add(Arrays.asList(nums[i],nums[lo++],nums[hi--]));
                while(lo<hi && nums[lo]==nums[lo-1]) lo++;
            }
        }
    }
}
