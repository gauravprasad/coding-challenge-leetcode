package com.gprasad.leetcode.interview.google.sortingsearching;

public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length, idx1 = 0, idx2 = 0, med1 = -1, med2 = -1;
        boolean  isEven = ((m + n) % 2==0);
        for (int idx = 0; idx <= (m + n) / 2; idx++) {
            if(isEven)med2=med1;
            if(idx1!=m && idx2!=n) med1 = nums1[idx1]>nums2[idx2]?nums2[idx2++]:nums1[idx1++];
            else if(idx1<m)med1=nums1[idx1++];
            else med1=nums2[idx2++];
        }
        return isEven?Double.valueOf(med1+med2)/2:med1;
    }
}
