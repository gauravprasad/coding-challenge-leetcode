package com.gprasad.leetcode.interview.apple.arraystring;


public class LongestSubstringWithoutRepeatingCharacters {
//TODO: Need to get the understanding and correct the solution.
    public int lengthOfLongestSubstring(String s) {
        int[] initializerArr = new int[256];
        int initial = 0;
        int max = 0;
        for(int idx = 0; idx<s.length(); idx++){
            initial = Math.max(initializerArr[s.charAt(idx)], initial);
            max = Math.max(max, idx-initial+1);
            initializerArr[s.charAt(idx)] = idx+1;
        }
        return max;
    }
}
