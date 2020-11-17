package com.gprasad.leetcode.interview.amazon.design;

import java.util.LinkedList;
import java.util.Stack;

public class MinStack {
    Stack<int[]> stack;
    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int x) {
       if(stack.isEmpty()){
           stack.add(new int[]{x,x});
           return;
       }
       int curMin = stack.peek()[1];
       stack.push(new int[]{x,Math.min(x,curMin)});
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
