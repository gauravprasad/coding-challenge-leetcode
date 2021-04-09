package com.gprasad.leetcode.interview.apple.sortingandsearching;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class KClosestPointsToOrigin {
    public int[][] kClosest(int[][] points, int k) {
        Map<int[], Integer> cordDistance = new HashMap<>(){{for(int[] arr: points) put(arr, ((arr[0]*arr[0])+(arr[1]*arr[1])));}};
        return cordDistance.entrySet().stream().sorted(Map.Entry.comparingByValue()).limit(k).map(e->e.getKey()).toArray(int[][]::new);
    }
    public int[][] kClosestII(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((p1,p2)->((p2[0]*p2[0])+(p2[1]*p2[1]))-((p1[0]*p1[0])+(p1[1]*p1[1])));
        for(int[] arr:points){
            pq.offer(arr);
            if(pq.size()>k){
                pq.poll();
            }
        }
        return pq.toArray(new int[pq.size()][]);
    }
}

