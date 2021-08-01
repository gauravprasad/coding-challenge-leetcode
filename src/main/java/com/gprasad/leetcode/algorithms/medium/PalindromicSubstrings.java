package com.gprasad.leetcode.algorithms.medium;

public class PalindromicSubstrings {
    public int countSubstrings0(String s) {
        if (s == null || s.length() == 0) return 0;
        int count = 0;
        for (int left = 0; left < s.length(); left++) {
            for (int right = left; right < s.length(); right++) {
                if (isPalindrome(s, left, right)) count++;
            }
        }
        return count;
    }

    public int countSubstrings(String s) {
        if (s == null || s.length() == 0) return 0;
        int count = 0;
        for (int idx = 0; idx < s.length() ; idx++) {
            count += countPalindrome(s, idx, idx);
            count += countPalindrome(s, idx, idx + 1);
        }
        return count;
    }

    private int countPalindrome(String str, int left, int right) {
        int count = 0;
        while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
            count++;
            left--;
            right++;
        }
        return count;
    }

    private boolean isPalindrome(String str, int left, int right) {
        while (left <= right) {
            if (str.charAt(left) != str.charAt(right)) return false;
            else {
                left++;
                right--;
            }
        }
        return true;
    }
}
