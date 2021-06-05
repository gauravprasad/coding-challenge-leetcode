package com.gprasad.leetcode.interview.apple.arraystring;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Map<Character, Character> charMap = new HashMap<>() {{
            put('}', '{');
            put(')', '(');
            put(']', '[');
        }};
        Stack<Character> parenthesesStack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') parenthesesStack.add(c);
            else if (parenthesesStack.isEmpty() || charMap.getOrDefault(c, '*') != parenthesesStack.pop()) return false;
        }
        return parenthesesStack.empty();
    }

    /*private boolean checkRev(Character c, Stack<Character> paranthesisStack) {

        switch (c) {
            case ')':
                return paranthesisStack.pop() == '(';
            case '}':
                return paranthesisStack.pop() == '{';
            case ']':
                return paranthesisStack.pop() == '[';
            default:
                return false;
        }
    }*/
}
