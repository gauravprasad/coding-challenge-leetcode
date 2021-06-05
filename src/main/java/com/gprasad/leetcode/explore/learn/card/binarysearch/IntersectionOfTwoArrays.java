package com.gprasad.leetcode.explore.learn.card.binarysearch;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> s2 = Arrays.stream(nums2).boxed().collect(Collectors.toSet());
        s1.retainAll(s2);
        return s1.stream().mapToInt(Number::intValue).toArray();
    }



}
