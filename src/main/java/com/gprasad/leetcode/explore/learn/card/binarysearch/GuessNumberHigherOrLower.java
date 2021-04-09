package com.gprasad.leetcode.explore.learn.card.binarysearch;

public class GuessNumberHigherOrLower {
    public int guessNumber(int n) {
        int lower =0, mid, higher = n;
        while(lower<=higher){
            mid  = lower+(higher-lower)/2;
            int fReturn = guess(mid);
            if(fReturn==0) return mid;
            if(fReturn==-1) higher=mid-1;
            else lower=mid+1;
        }
        return -1;
    }
    private int guess(int num){
        return 0;
    }
}
