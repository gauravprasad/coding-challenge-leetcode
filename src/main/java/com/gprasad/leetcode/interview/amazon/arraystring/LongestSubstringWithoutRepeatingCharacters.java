package com.gprasad.leetcode.interview.amazon.arraystring;

public class LongestSubstringWithoutRepeatingCharacters {


    public int lengthOfLongestSubstring(String s) {

        int[] subArr = new int[128];
        int maxSubString = 0;
        int initial = 0;
        for (int i = 0; i < s.length(); i++) {
            initial = Math.max(subArr[s.charAt(i)], initial);
            maxSubString = Math.max(maxSubString, i-initial+1);
            subArr[s.charAt(i)] = i+1;
        }
        return maxSubString;
    }
}
