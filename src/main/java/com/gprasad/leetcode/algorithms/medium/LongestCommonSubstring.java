package com.gprasad.leetcode.algorithms.medium;

import java.util.Map;

public class LongestCommonSubstring {
    public int longestCommonSubstring(String text1, String text2) {
        return 0;
    }

    public int longestCommonSubstring(String text1, String text2, int m, int n, int count, Map<String, Integer> memo) {
        if (m >= text1.length() || n > text2.length()) return count;
        String key = m + "|" + n + "|" + count;
        if (memo.containsKey(key)) return memo.get(key);
        int equality = count;
        if (text1.charAt(m) == text2.charAt(n))
            equality = longestCommonSubstring(text1, text2, m + 1, n + 1, count + 1, memo);

        int ans1 = longestCommonSubstring(text1, text2, m, n + 1, 0, memo);
        int ans2 = longestCommonSubstring(text1, text2, m + 1, n, 0, memo);
        int res = Math.max(equality, Math.max(ans1, ans2));
        memo.put(key, res);
        return res;
    }
}
