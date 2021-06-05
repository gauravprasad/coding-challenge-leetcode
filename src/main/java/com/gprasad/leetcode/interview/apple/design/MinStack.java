package com.gprasad.leetcode.interview.apple.design;

import java.util.Stack;

public class MinStack {
    Stack<int[]> stack;

    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int val) {
        if (stack.isEmpty()) stack.push(new int[]{val, val});
        else {
            int curr = stack.peek()[1];
            stack.push(new int[]{val, Math.min(curr, val)});
        }
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek()[0];
    }

    public int getMin() {
        return stack.peek()[1];
    }
}
