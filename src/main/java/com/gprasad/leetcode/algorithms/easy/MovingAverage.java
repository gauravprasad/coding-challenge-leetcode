package com.gprasad.leetcode.algorithms.easy;

import java.util.ArrayDeque;
import java.util.Deque;

public class MovingAverage {
    private int size, count=0;
    private double sum = 0d;
    private Deque<Double> dq;
    public MovingAverage(int size) {
        this.size = size;
        this.dq = new ArrayDeque<>();
    }

    public double next(int val) {
        ++count;
        sum += Double.valueOf(val);
        dq.add(Double.valueOf(val));
        Double tail = count>size?dq.poll():0d;
        sum = sum-tail;
        return sum/Math.min(count,size);
    }
}
