package com.gprasad.leetcode.interview.apple.arraystring;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MajorityElementII {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> numberCount = new HashMap<>();
        Arrays.stream(nums).forEach(n->{
            numberCount.put(n,numberCount.getOrDefault(n,0)+1);
        });
        return numberCount.entrySet().stream().filter(e->e.getValue()>(nums.length/3)).map(e->e.getKey()).collect(Collectors.toList());
    }
}
