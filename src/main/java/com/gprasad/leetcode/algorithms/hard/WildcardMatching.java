package com.gprasad.leetcode.algorithms.hard;

import java.util.regex.Pattern;

public class WildcardMatching {
    public boolean isMatch(String s, String p) {
        return Pattern.matches(p, s);
    }
}
