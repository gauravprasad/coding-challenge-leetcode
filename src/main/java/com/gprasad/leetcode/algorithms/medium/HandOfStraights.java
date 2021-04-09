package com.gprasad.leetcode.algorithms.medium;

import java.util.PriorityQueue;

public class HandOfStraights {
    public boolean isNStraightHand(int[] hand, int W) {
        /*PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->Integer.compare(a,b));
        for(int n: hand) pq.offer(n);*/
        int result = hand.length/W;
        return result>=W;
    }
}
