package com.gprasad.leetcode.interview.apple.arraystring;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    Map<Character, Integer> romanToIntegerMap = new HashMap<>() {
        {
            put('M', 1000);
            put('D', 500);
            put('C', 100);
            put('L', 50);
            put('X', 10);
            put('V', 5);
            put('I', 1);
        }
    };

    public int romanToInt(String s) {
        int result = 0;
        int next = 0;
        for (int i = (s.length() - 1); i >= 0; i--) {
            int curr = romanToIntegerMap.get(s.charAt(i));
            result = curr < next ? result - curr : result + curr;
            next = curr;
        }
        return result;
    }
}
