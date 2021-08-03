package com.gprasad.leetcode.algorithms.hard;

import java.util.PriorityQueue;

/*
778. Swim in Rising Water
Hard

You are given an n x n integer matrix grid where each value grid[i][j] represents the elevation at that point (i, j).

The rain starts to fall. At time t, the depth of the water everywhere is t. You can swim from a square to another 4-directionally adjacent square if and only if the elevation of both squares individually are at most t. You can swim infinite distances in zero time. Of course, you must stay within the boundaries of the grid during your swim.

Return the least time until you can reach the bottom right square (n - 1, n - 1) if you start at the top left square (0, 0).

Example 1:

Input: grid = [[0,2],[1,3]]
Output: 3
Explanation:
At time 0, you are in grid location (0, 0).
You cannot go anywhere else because 4-directionally adjacent neighbors have a higher elevation than t = 0.
You cannot reach point (1, 1) until time 3.
When the depth of water is 3, we can swim anywhere inside the grid.
Example 2:

Input: grid = [[0,1,2,3,4],[24,23,22,21,5],[12,13,14,15,16],[11,17,18,19,20],[10,9,8,7,6]]
Output: 16
Explanation: The final route is shown.
We need to wait until time 16 so that (0, 0) and (4, 4) are connected.

Constraints:

n == grid.length
n == grid[i].length
1 <= n <= 50
0 <= grid[i][j] < n2
Each value grid[i][j] is unique.
 */
public class SwimInRisingWater {
    public int swimInWater(int[][] grid) {
        int len = grid.length;
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));
        minHeap.add(new int[]{grid[0][0], 0, 0});
        grid[0][0] = -1;
        int[][] directions = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        while (!minHeap.isEmpty()) {
            int[] minHt = minHeap.poll();
            if (minHt[1] == len - 1 && minHt[2] == len - 1) return minHt[0];
            for (int[] direction : directions) {
                updateVisit(grid, minHt[0], minHt[1] + direction[0], minHt[2] + direction[1], len, minHeap);
            }
        }
        return 0;
    }

    private void updateVisit(int[][] grid, int curr, int R, int C, int len, PriorityQueue<int[]> minHeap) {
        if (R >= 0 && C >= 0 && R < len && C < len && grid[R][C] != -1) {
            minHeap.add(new int[]{Math.max(curr, grid[R][C]), R, C});
            grid[R][C] = -1;
        }
    }
}
