package com.gprasad.leetcode.interview.google.treegraph;

public class LongestIncreasingPathInAMatrix {
    public int longestIncreasingPath(int[][] matrix) {
        int rLen = matrix.length, clen = matrix[0].length, res = 0;
        int[][] memo = new int[rLen][clen];
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                res = Math.max(res, dfs(r, c, matrix, memo));
            }
        }
        return res;
    }

    private int dfs(int r, int c, int[][] matrix, int[][] memo) {
        if (memo[r][c] > 0) return memo[r][c];
        int val = matrix[r][c];
        memo[r][c] = 1 + Math.max(Math.max(r < matrix.length - 1 && matrix[r + 1][c] > val ? dfs(r + 1, c, matrix, memo) : 0, r > 0 && matrix[r - 1][c] > val ? dfs(r - 1, c, matrix, memo) : 0),
                Math.max(c < matrix[r].length - 1 && matrix[r][c + 1] > val ? dfs(r, c + 1, matrix, memo) : 0, c > 0 && matrix[r][c - 1] > val ? dfs(r, c - 1, matrix, memo) : 0));
        return memo[r][c];
    }
}
