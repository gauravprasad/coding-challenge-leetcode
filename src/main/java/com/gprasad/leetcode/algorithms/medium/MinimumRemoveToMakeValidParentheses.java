package com.gprasad.leetcode.algorithms.medium;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/*
1249. Minimum Remove to Make Valid Parentheses
Medium

Given a string s of '(' , ')' and lowercase English characters.

Your task is to remove the minimum number of parentheses ( '(' or ')', in any positions ) so that the resulting parentheses string is valid and return any valid string.

Formally, a parentheses string is valid if and only if:

It is the empty string, contains only lowercase characters, or
It can be written as AB (A concatenated with B), where A and B are valid strings, or
It can be written as (A), where A is a valid string.


Example 1:

Input: s = "lee(t(c)o)de)"
Output: "lee(t(c)o)de"
Explanation: "lee(t(co)de)" , "lee(t(c)ode)" would also be accepted.
Example 2:

Input: s = "a)b(c)d"
Output: "ab(c)d"
Example 3:

Input: s = "))(("
Output: ""
Explanation: An empty string is also valid.
Example 4:

Input: s = "(a(b(c)d)"
Output: "a(b(c)d)"


Constraints:

1 <= s.length <= 10^5
s[i] is one of  '(' , ')' and lowercase English letters.
 */
public class MinimumRemoveToMakeValidParentheses {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> openIdx = new Stack<>();
        Set<Integer> removeIdx = new HashSet<>();
        for (int idx = 0; idx < s.length(); idx++) {
            if (s.charAt(idx) == '(') openIdx.push(idx);
            if (s.charAt(idx) == ')') {
                if (openIdx.isEmpty()) removeIdx.add(idx);
                else openIdx.pop();
            }
        }
        while (!openIdx.isEmpty()) removeIdx.add(openIdx.pop());
        StringBuilder sb = new StringBuilder();
        for (int idx = 0; idx < s.length(); idx++) {
            if (removeIdx.contains(idx)) continue;
            sb.append(s.charAt(idx));
        }
        return sb.toString();
    }
}