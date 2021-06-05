package com.gprasad.leetcode.interview.apple.sortingandsearching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> merged = new ArrayList<>();
        int mergedIdx = -1;
        for (int idx = 0; idx < intervals.length; idx++) {
            if (merged.isEmpty()) {
                merged.add(intervals[idx]);
                mergedIdx++;
            } else if (merged.get(mergedIdx)[1] >= intervals[idx][0]) {
                if (merged.get(mergedIdx)[0] >= intervals[idx][0])
                    merged.get(mergedIdx)[0] = intervals[idx][0];
                if (merged.get(mergedIdx)[1] <= intervals[idx][1])
                    merged.get(mergedIdx)[1] = intervals[idx][1];
            } else {
                merged.add(intervals[idx]);
                mergedIdx++;
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }

    public int[][] merge2(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        LinkedList<int[]> merged = new LinkedList<>();
        for(int[] interval: intervals){
            if(merged.isEmpty()||merged.getLast()[1]<interval[0]){
                merged.add(interval);
            }else{
                merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }
}
