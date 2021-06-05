package com.gprasad.leetcode.interview.google.arraysstrings;

public class RotateImage {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int row = 0; row < n; row++) {
            for(int col=row;col<n;col++) {
                int temp = matrix[row][col];
                matrix[row][col] = matrix[col][row];
                matrix[col][row] = temp;
            }
        }
        for(int row=0;row<n;row++){
            for(int col=0;col<n/2;col++){
                int temp = matrix[row][col];
                matrix[row][col] = matrix[row][n-1-col];
                matrix[row][n-1-col] = temp;
            }
        }
    }
}
