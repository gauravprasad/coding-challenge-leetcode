package com.gprasad.leetcode.interview.apple.arraystring;

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int zeroCount = 0;
        for (int num : nums) {
            product *= num==0?1:num;
            if(num==0) zeroCount++;
        }
        product = zeroCount>1?product*0:product;
        for(int i=0;i<nums.length;i++){
            nums[i] = nums[i]!=0?zeroCount>0?0:product/nums[i]:product;
        }
        return nums;
    }
}
