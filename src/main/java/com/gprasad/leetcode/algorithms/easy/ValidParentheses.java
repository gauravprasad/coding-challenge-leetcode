package com.gprasad.leetcode.algorithms.easy;

import java.util.Stack;

public class ValidParentheses {
    Stack<Character> braces = new Stack<>();

    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            switch (c) {
                case '(':
                    braces.push(')');
                    break;
                case '{':
                    braces.push('}');
                    break;
                case '[':
                    braces.push(']');
                    break;
                default:
                    if (braces.isEmpty() || braces.peek() != c) {
                        return false;
                    }
                    braces.pop();
            }
        }
        return braces.isEmpty();
    }

    public static void main(String[] args) {
        ValidParentheses vp = new ValidParentheses();
        System.out.println(vp.isValid("(("));
    }
}
