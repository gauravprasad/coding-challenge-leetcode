package com.gprasad.leetcode.algorithms.hard;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class CountOfSmallerNumbersAfterSelf {
    public List<Integer> countSmaller(int[] nums) {
        PriorityQueue<Integer[]> pq = new PriorityQueue<>((a,b)->Integer.compare(a[0],b[0]));
        for(int idx=0;idx<nums.length;idx++) pq.offer(new Integer[]{nums[idx], idx});
        Integer[] prev = pq.poll();
        nums[prev[1]] = 0;
        while(!pq.isEmpty()){
            int smallerCount = nums.length-pq.size();
            Integer[] temp = pq.poll();
            nums[temp[1]] = temp[0]==prev[0]?nums[prev[1]]:Math.min(smallerCount, nums.length-1-temp[1]);
            prev = temp;
        }
        return Arrays.stream(nums).boxed().collect(Collectors.toList());
    }//[6,7,0,8,5,5,2,2,0,2,0,0,0]
}
