package com.gprasad.leetcode.interview.apple.arraystring;

//TODO: need to revisit.
public class MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        int startIndex = s.length()-1;
        int endIndex = 0;
        for (int i = 0; i < t.length(); i++) {
            int index = s.indexOf(t.charAt(i));
           startIndex = Math.min(index, startIndex);
           endIndex = Math.max(index, endIndex);
        }
        return s.substring(startIndex, endIndex + 1);
    }
}
