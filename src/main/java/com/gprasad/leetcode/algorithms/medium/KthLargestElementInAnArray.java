package com.gprasad.leetcode.algorithms.medium;

import java.util.PriorityQueue;

public class KthLargestElementInAnArray {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>(((o1, o2) -> o1-o2));
        for (int n : nums){
            q.offer(n);
            if(q.size()>k) q.poll();
        }
        return q.poll();
    }
}
