package com.gprasad.leetcode.interview.google.treegraph;

import java.util.*;

public class CourseScheduleII {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        if (numCourses==0) return new int[]{0};
        int[] dependencies = new int[numCourses];
        int[] order = new int[numCourses];
        Map<Integer, Set<Integer>> srcDest = new HashMap<>();
        for (int[] course : prerequisites) {
            srcDest.putIfAbsent(course[1], new HashSet<>());
            srcDest.get(course[1]).add(course[0]);
            dependencies[course[0]]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for (int course = 0; course < dependencies.length; course++) {
            if (dependencies[course] == 0) q.add(course);
        }
        int courseCount = 0;
        while (!q.isEmpty()) {
            int course = q.poll();
            order[courseCount++] = course;
            if (srcDest.containsKey(course)) {
                for (int c : srcDest.get(course)) {
                    dependencies[c]--;
                    if (dependencies[c] == 0) q.add(c);
                }
            }
        }
        return courseCount == numCourses ? order : new int[0];
    }
}
