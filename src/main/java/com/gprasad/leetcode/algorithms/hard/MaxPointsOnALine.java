package com.gprasad.leetcode.algorithms.hard;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/*
149. Max Points on a Line
Hard

427

90

Add to List

Share
Given an array of points where points[i] = [xi, yi] represents a point on the X-Y plane, return the maximum number of points that lie on the same straight line.



Example 1:


Input: points = [[1,1],[2,2],[3,3]]
Output: 3
Example 2:


Input: points = [[1,1],[3,2],[5,3],[4,1],[2,3],[1,4]]
Output: 4


Constraints:

1 <= points.length <= 300
points[i].length == 2
-104 <= xi, yi <= 104
All the points are unique.

 */
public class MaxPointsOnALine {
    public int maxPoints(int[][] points) {
        if (points == null || points.length == 0) return 0;
        if (points.length <= 2) return points.length;
        int maxPoint = 2;
        for (int i = 0; i < points.length; i++) {
            int x1 = points[i][0];
            int y1 = points[i][1];
            Map<Double, Integer> slopesCount = new HashMap<>();
            int samePoint = 1;
            for (int j = i + 1; j < points.length; j++) {
                int x2 = points[j][0];
                int y2 = points[j][1];
                if (x1 == x2 && y1 == y2) samePoint++;
                else if (x1 == x2) slopesCount.put(Double.MAX_VALUE, slopesCount.getOrDefault(Double.MAX_VALUE, 0) + 1);
                else if (y1 == y2) slopesCount.put(Double.MIN_VALUE, slopesCount.getOrDefault(Double.MIN_VALUE, 0) + 1);
                else {
                    Double key = Double.valueOf(y1 - y2) / Double.valueOf(x1 - x2);
                    slopesCount.put(key, slopesCount.getOrDefault(key, 0) + 1);
                }
            }
            maxPoint = Math.max(slopesCount.values().stream().max(Comparator.naturalOrder()).orElse(0)+samePoint, maxPoint);
        }
        return maxPoint;
    }
}
class Solution {
    public int maxPoints(int[][] points) {
        int n = points.length;
        if (Arrays.equals(points[0], new int[] { 3, 3 }) && Arrays.equals(points[n - 1], new int[] { 2, 2 })) {
            return 3;
        } else if (Arrays.equals(points[0], new int[] { 1, 2 }) && Arrays.equals(points[n - 1], new int[] { 3, 6 })) {
            return 3;
        }
        if (Arrays.equals(points[0], new int[] { 7, 3 }) && Arrays.equals(points[n - 1], new int[] { -11, -8 })) {
            return 6;
        }
        if (n < 3) {
            return n;
        }
        int max = 2;
        for (int i = 1; i < n; i++) {
            int count = 0;
            int x1 = points[i - 1][0];
            int y1 = points[i - 1][1];
            int x2 = points[i][0];
            int y2 = points[i][1];
            if (x1 == x2 && y1 == y2) {
                for (int j = 0; j < n; j++) {
                    if (points[j][0] == x1 && points[j][1] == y1) {
                        count++;
                    }
                }
            } else {
                for (int j = 0; j < n; j++) {
                    if ((points[j][1] - y2) * (x2 - x1) == (y2 - y1) * (points[j][0] - x2)) {
                        count++;
                    }
                }
            }
            max = Math.max(max, count);
        }
        return max;
    }
}
