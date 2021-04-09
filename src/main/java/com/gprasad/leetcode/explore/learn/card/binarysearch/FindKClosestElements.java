package com.gprasad.leetcode.explore.learn.card.binarysearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FindKClosestElements {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        if (arr == null || arr.length == 0) return new ArrayList<>();
        List<Integer> arrList = Arrays.stream(arr).boxed().collect(Collectors.toList());
        if (x <= arrList.get(0)) return arrList.subList(0, k);
        else if (x >= arrList.get(arr.length - 1)) return arrList.subList(arr.length - k, arr.length);
        else {
            int index = Collections.binarySearch(arrList, x);
            if (x < 0) index = -index - 1;
            int low = Math.max(0, index - k - 1), high = Math.min(arr.length - 1, index + k - 1);
            while (high - low > k - 1) {
                if (low < 0 || (x - arrList.get(low)) <= (arrList.get(high) - x))
                    high--;
                else if (high > arrList.size() - 1 || (x - arrList.get(low)) > (arrList.get(high) - x))
                    low++;
            }
            return arrList.subList(low, high + 1);
        }

    }
}
