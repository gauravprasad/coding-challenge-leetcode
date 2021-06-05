/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gprasad.leetcode.algorithms.easy;

/**
 *
 * @author gq6pras
 */
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int mi=0,ni=0;
        while(mi<m){
            if(nums1[mi]>=nums2[ni]){
                int temp = nums1[mi];
                nums1[mi] = nums2[ni];
                nums2[ni] = temp;
            }else ni++;
            mi++;
        }
        ni = 0;
        while(mi<nums1.length){
            nums1[mi] = nums2[ni];
            ni++;
            mi++;
        }
    }
}
