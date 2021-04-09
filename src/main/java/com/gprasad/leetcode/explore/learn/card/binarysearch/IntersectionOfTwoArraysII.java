package com.gprasad.leetcode.explore.learn.card.binarysearch;

import java.util.Arrays;

public class IntersectionOfTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        return Arrays.stream(nums1).boxed().filter(Arrays.asList(nums2)::contains).mapToInt(Number::intValue).toArray();
    }
}
