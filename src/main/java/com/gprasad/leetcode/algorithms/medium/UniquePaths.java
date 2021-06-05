package com.gprasad.leetcode.algorithms.medium;

import java.util.Arrays;

public class UniquePaths {
    public int uniquePaths(int m, int n) {
        int[][] D = new int[m][n];
        for(int[] arr: D){
            Arrays.fill(arr,1);
        }
        for(int R=1;R<m;R++){
            for(int C=1;C<n;C++){
                D[R][C] = D[R-1][C]+D[R][C-1];
            }
        }
        return D[m-1][n-1];
    }
}
