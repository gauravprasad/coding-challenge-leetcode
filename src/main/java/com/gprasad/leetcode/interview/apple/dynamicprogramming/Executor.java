package com.gprasad.leetcode.interview.apple.dynamicprogramming;

import java.util.List;

public class Executor {
    public static void main(String[] args) {
        //System.out.println(new LongestPalindromicSubstring().longestPalindrome("babad"));
//        System.out.println(new RegularExpressionMatching().isMatch("aab","c*a*b"));
        System.out.println(new WordBreak().wordBreak("bb", List.of("a","b", "bbb", "ab")));
    }
}
