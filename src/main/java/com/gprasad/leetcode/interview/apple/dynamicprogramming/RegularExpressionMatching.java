package com.gprasad.leetcode.interview.apple.dynamicprogramming;

import java.util.regex.Pattern;
//TODO: need to revisit and solve with Dynamic Programming.
public class RegularExpressionMatching {
    public boolean isMatch(String s, String p) {
        Pattern pattern = Pattern.compile(p);
        return pattern.matcher(s).matches();
    }
    public boolean isMatch2(String s, String p) {
        return s.matches(p);
    }
}
