package com.gprasad.leetcode.interview.google.sortingsearching;

import java.util.Arrays;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] sArr = s.toCharArray();
        Arrays.sort(sArr);
        char[] tArr = t.toCharArray();
        Arrays.sort(tArr);
        return Arrays.equals(sArr, tArr);
    }

    public boolean isAnagram2(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] chars = new int[256];
        for (char c : s.toCharArray()) chars[c] = ++chars[c];
        for (char c : t.toCharArray()) {
            chars[c] = --chars[c];
            if (chars[c] < 0) return false;
        }
        return true;
    }
}
