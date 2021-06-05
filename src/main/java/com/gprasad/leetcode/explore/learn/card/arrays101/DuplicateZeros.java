package com.gprasad.leetcode.explore.learn.card.arrays101;

public class DuplicateZeros {
    public void duplicateZeros(int[] arr) {
        int next = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]==0){
                next =  arr[i];
                arr[i] = 0;
            }
        }
    }
}
