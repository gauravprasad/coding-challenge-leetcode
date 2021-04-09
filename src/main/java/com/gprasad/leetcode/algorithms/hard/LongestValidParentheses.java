package com.gprasad.leetcode.algorithms.hard;

import java.util.Stack;

public class LongestValidParentheses {
    public int longestValidParentheses(String s) {
        int maxCount = 0;
        int L = 0, R = 0;
        for (int idx = 0; idx < s.length(); idx++) {
            if (s.charAt(idx) == '(') L++;
            else R++;
            if (L == R) maxCount = Math.max(maxCount, 2 * R);
            else if (R >= L) L = R = 0;
        }
        L=R=0;
        for (int idx = s.length() - 1; idx >= 0; idx--) {
            if (s.charAt(idx) == '(') L++;
            else R++;
            if (R == L) maxCount = Math.max(maxCount, 2 * L);
            else if (L >= R) R = L = 0;
        }
        return maxCount;
    }

    //stack solution
    public int longestValidParentheses1(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int maxCount = 0;
        for (int idx = 0; idx < s.length(); idx++) {
            if (s.charAt(idx) == '(') stack.push(idx);
            else {
                stack.pop();
                if (stack.isEmpty()) stack.push(idx);
                else maxCount = Math.max(maxCount, idx - stack.peek());
            }
        }
        return maxCount;
    }
}
