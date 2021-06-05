package com.gprasad.leetcode.interview.apple.sortingandsearching;

import java.util.Arrays;

public class Executor {
    public static void main(String[] args) {
        //System.out.println(new MedianOfTwoSortedArrays().findMedianSortedArrays(new int[]{1,2},new int[]{3,4}));
        //System.out.println(new MergeIntervals().merge(new int[][]{{1,3},{2,6},{8,10},{15,18}}));
        /*int[] x = {2,2};
        new SortColors().sortColors(x);
        Arrays.stream(x).forEach(i-> System.out.println(i));*/
        System.out.println(new TopKFrequentWords().topKFrequent(new String[]{"i", "love", "leetcode", "i", "love", "coding"},2));
    }
}
