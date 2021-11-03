package com.gprasad.leetcode.algorithms.easy;

public class ReverseOnlyLetters {
    public String reverseOnlyLetters(String s) {
        if (s == null || s.length() == 0) return s;
        int start = 0, end = s.length() - 1;
        StringBuilder sb = new StringBuilder(s);
        Boolean continueFlag = false;
        while (start < end) {
            if (!isAlbhabet(s.charAt(start))) {
                start++;
                continueFlag = true;
            }
            if (!isAlbhabet(s.charAt(end))) {
                end--;
                continueFlag = true;
            }
            if(continueFlag) {
                continueFlag = false;
                continue;
            }
            char temp = s.charAt(start);
            sb.setCharAt(start++, s.charAt(end));
            sb.setCharAt(end--, temp);

        }
        return sb.toString();
    }
    private boolean isAlbhabet(Character c) {
        return Character.isAlphabetic(c);
    }
}
