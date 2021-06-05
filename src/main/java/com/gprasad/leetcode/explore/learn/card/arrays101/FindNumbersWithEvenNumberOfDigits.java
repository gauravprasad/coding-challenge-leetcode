package com.gprasad.leetcode.explore.learn.card.arrays101;

public class FindNumbersWithEvenNumberOfDigits {
    public int findNumbers(int[] nums) {
        int result = 0;
        for(int num:nums){
            String temp = String.valueOf(num);
            if(temp.length()%2==0) result++;
        }
        return result;
    }
}
