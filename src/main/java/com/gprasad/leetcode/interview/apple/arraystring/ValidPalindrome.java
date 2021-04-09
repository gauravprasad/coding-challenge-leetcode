package com.gprasad.leetcode.interview.apple.arraystring;

import java.util.Locale;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s.replaceAll("[^a-zA-Z0-9]+", "").toLowerCase());
        s = sb.toString();
        String  rev = sb.reverse().toString();
        return s.equals(rev);
    }
}
