package com.gprasad.leetcode.interview.facebook.arraystrings;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int product = Arrays.stream(nums).reduce((n,p)->n*p).getAsInt();
        return Arrays.stream(nums).map(n->product/(n==0?1:n)).toArray();
    }
}
