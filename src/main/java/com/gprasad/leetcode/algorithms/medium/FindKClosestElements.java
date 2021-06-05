package com.gprasad.leetcode.algorithms.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindKClosestElements {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        if (arr == null || arr.length == 0) return new ArrayList<>();
        int left = 0, right = arr.length - k;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (x - arr[mid] > arr[mid + k] - x) left = mid + 1;
            else right = mid;
        }
        return IntStream.range(left, left + k).boxed().map(idx -> arr[idx]).collect(Collectors.toList());
    }
}
