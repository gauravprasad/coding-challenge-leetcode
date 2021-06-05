package com.gprasad.leetcode.interview.apple.sortingandsearching;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class IntersectionOfTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Long> numCount = Arrays.stream(nums1).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        List<Integer> result = new ArrayList<>();
        for(int num: nums2){
            if(numCount.containsKey(num) && numCount.get(num)>0){
                result.add(num);
                numCount.put(num , numCount.get(num)-1);
            }
        }
        return result.stream().mapToInt(Number::intValue).toArray();
    }
}
