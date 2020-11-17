/*
 * There are two sorted arrays nums1 and nums2 of size m and n respectively. Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
 * and open the template in the editor.
 */
package com.gprasad.leetcode.algorithms.hard;

/**
 * @author gq6pras
 */
public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        return ((nums1 == null || nums1.length == 0) && (nums2 == null || nums2.length == 0)) ? 0d : findMedian(mergeSortedArray(nums1, nums2));
    }

    private int[] mergeSortedArray(int[] nums1, int[] nums2) {
        if (nums1 == null || nums1.length == 0) return nums2;
        if (nums2 == null || nums2.length == 0) return nums1;
        int index1 = 0;
        int index2 = 0;
        int[] arr = new int[nums1.length + nums2.length];
        for (int i = 0; i < arr.length; i++) {
            if (index1 >= nums1.length) {
                arr[i] = nums2[index2];
                index2++;
            }
            else if (index2 >= nums2.length) {
                arr[i] = nums1[index1];
                index1++;
            }
            else {
                if (nums1[index1] < nums2[index2]) {
                    arr[i] = nums1[index1];
                    index1++;
                } else {
                    arr[i] = nums2[index2];
                    index2++;
                }
            }
        }
        return arr;
    }

    private double findMedian(int[] nums) {
        return nums.length % 2 == 0 ? Double.valueOf(nums[nums.length / 2] + nums[(nums.length / 2) - 1]) / 2 : Double.valueOf(nums[nums.length / 2]);
    }
}
