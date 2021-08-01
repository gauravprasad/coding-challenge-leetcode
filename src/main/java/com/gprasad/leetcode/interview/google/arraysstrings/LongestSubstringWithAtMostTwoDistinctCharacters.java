package com.gprasad.leetcode.interview.google.arraysstrings;

import java.util.*;

public class LongestSubstringWithAtMostTwoDistinctCharacters {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        if (s.length() <= 2) return s.length();
        int longestString = Integer.MIN_VALUE;
        int start = 0, end = 0;
        Map<Character, Integer> charIndex = new HashMap<>();
        while (end < s.length()) {
            charIndex.put(s.charAt(end), end++);
            if (charIndex.size() > 2) {
                int delIdx = Collections.min(charIndex.values());
                charIndex.remove(s.charAt(delIdx));
                start = delIdx + 1;
            }
            longestString = Math.max(longestString, end - start);
        }
        return longestString;
    }
}
