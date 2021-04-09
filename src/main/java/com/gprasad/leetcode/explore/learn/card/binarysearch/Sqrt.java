package com.gprasad.leetcode.explore.learn.card.binarysearch;

public class Sqrt {
    public int mySqrt(int x) {
        if(x < 2) return x;
        int left = 2, mid, right= x/2;
        while(left<=right){
            mid = left + (right-left)/2;
            long n = (long)mid*(long)mid;
            if(n==x)  return mid;
            if(n>x)right = mid-1;
            else left = mid+1;
        }
        return right;
    }
}
