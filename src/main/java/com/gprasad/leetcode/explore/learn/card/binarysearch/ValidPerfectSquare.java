package com.gprasad.leetcode.explore.learn.card.binarysearch;

public class ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        if (num < 0) return false;
        if (num == 0 || num == 1) return true;
        long val = (long) num;
        long low = 2, high = num / 2;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            long sqr = mid * mid;
            if (num == sqr) return true;
            if (sqr > num) high = mid - 1;
            else low = mid + 1;
        }
        return false;
    }
}
