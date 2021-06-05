package com.gprasad.leetcode.algorithms.easy;

public class RotateString {
    public boolean rotateString(String A, String B) {
        if (A.length() == 0 || B.length() == 0 || A.length() != B.length()) return A.equals(B);
        return A.concat(A).contains(B);
    }
}