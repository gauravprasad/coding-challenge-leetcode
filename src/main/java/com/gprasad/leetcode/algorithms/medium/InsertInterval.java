package com.gprasad.leetcode.algorithms.medium;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        PriorityQueue<int[]> queue = new PriorityQueue<>((a,b)->(Integer.compare(a[0], b[0]))){{for (int[] x: intervals) add(x);}};
        queue.add(newInterval);
        LinkedList<int[]> ls  = new LinkedList<>();
        while(queue.size()!=0){
            int[] x = queue.poll();
            if(ls.size()==0 || ls.getLast()[1]<x[0]) ls.add(x);
            else ls.getLast()[1] = Math.max(ls.getLast()[1], x[1]);
        }
        return ls.toArray(new int[ls.size()][]);
    }
}
