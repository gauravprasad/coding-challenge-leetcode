package com.gprasad.leetcode.algorithms.easy;

public class NumberOfSegmentsInAString {
    public int countSegments(String s) {
        if(s==null || s.trim().isEmpty()) return 0;
        return s.trim().split(" +").length;
    }
}
