package com.gprasad.leetcode.algorithms.easy;

import java.util.HashMap;
import java.util.Map;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int lastIndex = -1;
        for(int i = 0; i<nums.length;i++){
            if(nums[i]!=val){
                nums[++lastIndex]=nums[i];
            }
        }
        return lastIndex+1;
    }


}
