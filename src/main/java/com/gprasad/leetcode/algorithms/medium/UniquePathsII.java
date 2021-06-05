package com.gprasad.leetcode.algorithms.medium;

public class UniquePathsII {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid[0][0] == 1) return 0;
        obstacleGrid[0][0] = 1;
        int M = obstacleGrid.length;
        int N = obstacleGrid[0].length;
        for (int R = 1; R < M; R++)
            obstacleGrid[R][0] = (obstacleGrid[R][0] == 0 && obstacleGrid[R - 1][0] == 1) ? 1 : 0;
        for (int C = 1; C < N; C++)
            obstacleGrid[0][C] = (obstacleGrid[0][C] == 0 && obstacleGrid[0][C - 1] == 1) ? 1 : 0;
        for (int R = 1; R < M; R++) {
            for (int C = 1; C < N; C++) {
                if(obstacleGrid[R][C]==0)
                obstacleGrid[R][C] = obstacleGrid[R - 1][C] + obstacleGrid[R][C - 1];
                else
                    obstacleGrid[R][C]=0;
            }
        }
        return obstacleGrid[M - 1][N - 1];
    }
}
