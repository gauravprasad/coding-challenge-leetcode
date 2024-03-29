package com.gprasad.leetcode.interview.google.treegraph;

public class NumberOfIslands {
    public int numIslands(char[][] grid) {
        int count = 0;
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[r].length; c++) {
                if (grid[r][c] == '1') {
                    makeAllAdjacentZero(grid, r, c);
                    count++;
                }
            }
        }
        return count;
    }

    private void makeAllAdjacentZero(char[][] grid, int r, int c) {
        if (r >= 0 && c >= 0 && r < grid.length && c < grid[r].length && grid[r][c] == '1') {
            grid[r][c] = '0';
            makeAllAdjacentZero(grid, r + 1, c);
            makeAllAdjacentZero(grid, r - 1, c);
            makeAllAdjacentZero(grid, r, c + 1);
            makeAllAdjacentZero(grid, r, c - 1);
        }
    }
}
