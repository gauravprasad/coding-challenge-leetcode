package com.gprasad.leetcode.algorithms.easy;

public class ClimbingStairs {
    public int climbStairs(int n) {
        int[] mem = new int[n+1];
        //return climb(0, n);
        return climbStairs(0,n,mem);
    }

    public int climb(int steps, int n) {
        if (steps > n) return 0;
        if (steps == n) return 1;
        return climb(steps + 1, n) + climb(steps + 2, n);
    }


    public int climbStairs(int steps, int n, int[] mem) {
        if (steps > n) return 0;
        if (steps == n) return 1;
        if (mem[steps] > 0) return mem[steps];
        mem[steps] = climbStairs(steps + 1, n, mem) + climbStairs(steps + 2, n, mem);
        return mem[steps];
    }
}
