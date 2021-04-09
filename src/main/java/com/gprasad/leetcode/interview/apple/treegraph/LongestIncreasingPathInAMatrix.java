package com.gprasad.leetcode.interview.apple.treegraph;

//TODO: Time Limit Exceed.
public class LongestIncreasingPathInAMatrix {
    public int longestIncreasingPath(int[][] matrix) {
        int count = 0;
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                count = Math.max(count, longestPathDFS(matrix, r, c, 0, -1));
            }
        }
        return count;
    }

    private int longestPathDFS(int[][] matrix, int r, int c, int count, int prevVal) {
        if (r >= 0 && c >= 0 && r < matrix.length && c < matrix[r].length && matrix[r][c] > prevVal) {
            return Math.max(Math.max(longestPathDFS(matrix, r - 1, c, count + 1, matrix[r][c]), longestPathDFS(matrix, r + 1, c, count + 1, matrix[r][c])),
                    Math.max(longestPathDFS(matrix, r, c - 1, count + 1, matrix[r][c]), longestPathDFS(matrix, r, c + 1, count + 1, matrix[r][c])));
        } else return count;
    }
}
