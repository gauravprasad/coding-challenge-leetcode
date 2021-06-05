package com.gprasad.leetcode.algorithms.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumArray {
    private List<Integer> list;
    public NumArray(int[] nums) {
        list = Arrays.stream(nums).boxed().collect(Collectors.toList());
    }

    public int sumRange(int left, int right) {
        return list.subList(left,right+1).stream().mapToInt(Integer::intValue).sum();
    }
}
