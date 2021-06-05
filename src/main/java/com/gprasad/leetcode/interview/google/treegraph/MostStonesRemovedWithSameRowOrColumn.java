package com.gprasad.leetcode.interview.google.treegraph;

import java.util.HashSet;
import java.util.Set;

public class MostStonesRemovedWithSameRowOrColumn {
    public int removeStones(int[][] stones) {
        Set<Integer> rowSet = new HashSet<>();
        Set<Integer> colSet = new HashSet<>();
        int result = 0;
        for (int[] stone : stones) {
            if (rowSet.contains(stone[0]) || colSet.contains(stone[1])) {
                result++;
            }
            rowSet.add(stone[0]);
            colSet.add(stone[1]);
        }
        return result;
    }
}
