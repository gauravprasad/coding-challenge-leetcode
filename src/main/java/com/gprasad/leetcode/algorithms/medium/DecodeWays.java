package com.gprasad.leetcode.algorithms.medium;

public class DecodeWays {
    public int numDecodings(String s) {
        int[] dp = new int[s.length() + 1];
        dp[0] = 1;
        dp[1] = s.charAt(0) == '0' ? 0 : 1;
        for (int idx = 2; idx <= s.length(); idx++) {
            int oneDigit = Integer.valueOf(s.substring(idx-1,idx));
            int twoDigit = Integer.valueOf(s.substring(idx-2,idx));
            if(oneDigit>=1) dp[idx]+=dp[idx-1];
            if(twoDigit>=10 && twoDigit<=26) dp[idx]+=dp[idx-2];
        }
        return dp[s.length()];
    }
}
