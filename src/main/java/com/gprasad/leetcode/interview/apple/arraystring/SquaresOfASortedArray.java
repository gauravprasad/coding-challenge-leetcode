package com.gprasad.leetcode.interview.apple.arraystring;

import java.util.Arrays;

public class SquaresOfASortedArray {

    public int[] sortedSquares(int[] nums) {
        int[] arr = new int[nums.length];
        int lp =0, rp=nums.length-1;
        for(int i = nums.length-1; i>=0; i--){
            if(Math.abs(nums[lp])<Math.abs(nums[rp])){
                arr[i] = nums[rp]*nums[rp];
                rp--;
            }else {
                arr[i]=nums[lp]*nums[lp];
                lp++;
            }
        }
        return arr;
    }

    //Bruteforce
    public int[] sortedSquares2(int[] nums) {
        int[] arr = new int[nums.length];
        for(int i = 0; i<nums.length; i++){
            arr[i] = nums[i]*nums[i];
        }
        Arrays.sort(arr);
        return arr;
    }
}
