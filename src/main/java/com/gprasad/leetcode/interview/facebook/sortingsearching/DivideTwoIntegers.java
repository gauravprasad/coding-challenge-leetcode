package com.gprasad.leetcode.interview.facebook.sortingsearching;

public class DivideTwoIntegers {
    public int divide(int dividend, int divisor) {
        int quotient = 0;
        while (dividend - divisor >= 0) {
            quotient++;
            dividend-=divisor;
        }
        return quotient;
    }
}
