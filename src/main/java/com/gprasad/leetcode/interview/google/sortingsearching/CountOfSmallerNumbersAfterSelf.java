package com.gprasad.leetcode.interview.google.sortingsearching;

import java.util.ArrayList;
import java.util.List;

public class CountOfSmallerNumbersAfterSelf {
    public List<Integer> countSmaller(int[] nums) {
        return null;
    }

    //time limit exceed :(
    public List<Integer> countSmallerBrutForce(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) count++;
            }
            result.add(count);
        }
        return result;
    }
}
