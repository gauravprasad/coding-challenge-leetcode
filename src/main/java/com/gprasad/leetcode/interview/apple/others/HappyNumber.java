package com.gprasad.leetcode.interview.apple.others;

import java.util.HashSet;
import java.util.Set;

//TODO: need to correct with a another solution.
public class HappyNumber {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while(n!=1 && !set.contains(n)){
            set.add(n);
            n = getNext(n);
        }
        return n==1;
    }

    private int getNext(int n) {
        int sum = 0;
        while (n > 0) {
            int mod = n % 10;
            n = mod * mod;
            sum = mod * mod;
        }
        return sum;
    }
}
