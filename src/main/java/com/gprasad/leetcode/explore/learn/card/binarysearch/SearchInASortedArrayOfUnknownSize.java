package com.gprasad.leetcode.explore.learn.card.binarysearch;

public class SearchInASortedArrayOfUnknownSize {
    public int search(ArrayReader reader, int target) {

        int left =0 , right =1;
        while(reader.get(right)<target){
            left = right;
            right <<=1;
        }

        while(left<=right){
            int mid = left + ((right-left)>>1);
            int num = reader.get(mid);
            if(num==target) return mid;
            if(num>target) right = mid-1;
            else left = mid+1;
        }

        return -1;
    }
}
