package com.gprasad.leetcode.algorithms.medium;

public class LongestCommonSubsequence {
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        if (m == 0 || n == 0) return 0;
        int dp[][] = new int[m + 1][n + 1];
        for(int i = 1;i<=m;i++){
            for(int j = 1;j<=n;j++){
                if(text1.charAt(i-1)==text2.charAt(j-1)) dp[i][j]=1+dp[i-1][j-1];
                else dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[m][n];
        //return longestCommonSubsequence(text1, text2, dp);
    }

    public int longestCommonSubsequence(String text1, String text2, int[][] memo) {
        if (text1.length() == 0 || text2.length() == 0) return 0;
        if (memo[text1.length()][text2.length()] > 0) return memo[text1.length()][text2.length()];
        if (text1.charAt(0) == text2.charAt(0)) {
            memo[text1.length()][text2.length()] = 1 + longestCommonSubsequence(text1.substring(1), text2.substring(1), memo);
            return memo[text1.length()][text2.length()];
        } else {
            int op1 = longestCommonSubsequence(text1, text2.substring(1), memo);
            int op2 = longestCommonSubsequence(text1.substring(1), text2, memo);
            memo[text1.length()][text2.length()] = Math.max(op1, op2);
            return memo[text1.length()][text2.length()];
        }
    }
}
