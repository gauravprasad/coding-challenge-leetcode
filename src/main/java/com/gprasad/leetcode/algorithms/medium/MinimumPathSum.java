package com.gprasad.leetcode.algorithms.medium;

public class MinimumPathSum {
    public int minPathSum(int[][] grid) {
        if(grid==null || grid.length==0) return 0;
        int[][] dp = new int[grid.length][grid[0].length];
        for(int R=0;R<dp.length;R++){
            for(int C=0;C<dp[R].length;C++){
                dp[R][C]+=grid[R][C];
                if(R>0 && C>0) dp[R][C]+=Math.min(dp[R-1][C], dp[R][C-1]);
                else if(R>0) dp[R][C]+=dp[R-1][C];
                else if(C>0) dp[R][C]+=dp[R][C-1];
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}
