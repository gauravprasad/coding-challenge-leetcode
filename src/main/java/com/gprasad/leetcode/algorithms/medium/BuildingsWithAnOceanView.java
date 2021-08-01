package com.gprasad.leetcode.algorithms.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class BuildingsWithAnOceanView {
    public int[] findBuildings(int[] heights) {
        if (heights == null || heights.length == 0) return null;
        int tallest = heights[heights.length - 1];
        heights[heights.length-1] = heights.length-1;
        int read = heights.length - 2;
        int write = read;
        while (read >= 0) {
            if (heights[read] > tallest) {
                tallest = heights[read];
                heights[write]=read;
                write--;
            }
            read--;
        }
        return Arrays.copyOfRange(heights, write+1, heights.length);
    }

    public int[] findBuildingsX(int[] heights) {
        if (heights == null || heights.length == 0) return null;
        LinkedList<Integer> oceanViewIndex = new LinkedList<>();
        for (int idx = 0; idx < heights.length; idx++) {
            if (oceanViewIndex.size() == 0 || heights[oceanViewIndex.getLast()] > heights[idx]) oceanViewIndex.add(idx);
            else {
                while (oceanViewIndex.size() > 0 && heights[oceanViewIndex.getLast()] <= heights[idx])
                    oceanViewIndex.pollLast();
                oceanViewIndex.add(idx);
            }
        }
        return oceanViewIndex.stream().mapToInt(i -> i).toArray();
    }

    public int[] findBuildingsCopied(int[] heights) {
        if (heights == null || heights.length <= 1) {
            return new int[]{0};
        }
        int read = heights.length - 1;
        int write = heights.length - 1;
        int min = Integer.MIN_VALUE;
        while (read >= 0) {
            if (heights[read] > min) {
                min = heights[read];
                heights[write] = read;
                write--;
            }
            read--;
        }
        return Arrays.copyOfRange(heights, write + 1, heights.length);
    }
}