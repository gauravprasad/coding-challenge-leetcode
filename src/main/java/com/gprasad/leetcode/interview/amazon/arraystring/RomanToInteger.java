package com.gprasad.leetcode.interview.amazon.arraystring;

public class RomanToInteger {

    public int romanToInt(String s) {
        int result = 0;
        int prev = 0;
        for (int i = (s.length() - 1); i >= 0; i--) {
            int curr = getDecimalNumber(s.charAt(i));
            result = curr < prev ? result - curr : result + curr;
            prev = curr;
        }
        return result;
    }

    private int getDecimalNumber(char c) {
        switch (c) {
            case 'M':
                return 1000;
            case 'D':
                return 500;
            case 'C':
                return 100;
            case 'L':
                return 50;
            case 'X':
                return 10;
            case 'V':
                return 5;
            case 'I':
                return 1;
            default:
                return 0;
        }
    }
}
