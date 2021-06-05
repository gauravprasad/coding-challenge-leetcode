package com.gprasad.leetcode.interview.google.sortingsearching;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
//TODO: Lets revisit
public class InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        PriorityQueue<int[]> inserted = Arrays.stream(intervals).collect(Collectors.toCollection(()->new PriorityQueue<>((a,b)->Integer.compare(a[0], b[0]))));
        inserted.add(newInterval);
//        Collections.sort(inserted, (a,b)->Integer.compare(a[0],b[0]));
        LinkedList<int[]> merged = new LinkedList<>();
        while(!inserted.isEmpty()){
            int[] interval = inserted.poll();
            if(merged.isEmpty() || merged.getLast()[1]<interval[0]) merged.add(interval);
            else merged.getLast()[1]=Math.max(merged.getLast()[1],interval[1]);
        }
        return merged.toArray(new int[merged.size()][]);
    }
}
