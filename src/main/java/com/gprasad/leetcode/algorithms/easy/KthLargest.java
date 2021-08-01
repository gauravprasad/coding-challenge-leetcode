package com.gprasad.leetcode.algorithms.easy;

import java.util.PriorityQueue;

public class KthLargest {

    private PriorityQueue<Integer> largeK;
    int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.largeK = new PriorityQueue<>((a, b) -> Integer.compare(a, b)) {{
            for (int n : nums) add(n);
        }};
        while (this.largeK.size() > k) largeK.poll();
    }

    public int add(int val) {
        largeK.add(val);
        if (largeK.size() > k) largeK.poll();
        return largeK.peek();
    }
}
