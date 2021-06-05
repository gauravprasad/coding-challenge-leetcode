package com.gprasad.leetcode.interview.apple.sortingandsearching;

public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergedArr = getMergedArray(nums1, nums2);
        return mergedArr.length % 2 == 0 ? (Double.valueOf(mergedArr[mergedArr.length / 2]) + Double.valueOf(mergedArr[(mergedArr.length / 2) - 1])) / 2 : Double.valueOf(mergedArr[mergedArr.length / 2]);
    }

    private int[] getMergedArray(int[] nums1, int[] nums2) {
        int[] merged = new int[nums1.length + nums2.length];
        int mIdx = 0;
        int nIdx = 0;
        for (int idx = 0; idx < merged.length; idx++) {
            if (mIdx >= nums1.length) {
                merged[idx] = nums2[nIdx];
                nIdx++;
            } else if (nIdx >= nums2.length) {
                merged[idx] = nums1[mIdx];
                mIdx++;
            } else {
                if (nums1[mIdx] < nums2[nIdx]) {
                    merged[idx] = nums1[mIdx];
                    mIdx++;
                } else {
                    merged[idx] = nums2[nIdx];
                    nIdx++;
                }
            }
        }
        return merged;
    }
}
