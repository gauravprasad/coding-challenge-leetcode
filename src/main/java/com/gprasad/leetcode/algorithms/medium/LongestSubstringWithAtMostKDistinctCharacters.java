package com.gprasad.leetcode.algorithms.medium;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithAtMostKDistinctCharacters {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        int max = 0;
        Map<Character, Integer> charCount = new HashMap<>();
        int startIdx = 0;

        for (int idx = 0; idx < s.length(); idx++) {
            char c = s.charAt(idx);
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            if (charCount.size() > k) {
                max = Math.max(max, idx - startIdx);
                while (charCount.size() > k) {
                    char temp = s.charAt(startIdx);
                    int count = charCount.get(temp);
                    if (count > 1) charCount.put(temp, count - 1);
                    else charCount.remove(temp);
                    startIdx++;
                }
            }
        }
        return Math.max(max, s.length() - startIdx);
    }
}
