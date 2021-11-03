/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gprasad.leetcode.algorithms.medium;

import java.util.*;
/**
 * @author gq6pras
 */
public class CourseScheduleII {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        if (numCourses == 0) return new int[0];
        Set<Integer>[] dependecyTree = new Set[numCourses];
        Arrays.fill(dependecyTree, new HashSet<>());
        for (int idx = 0; idx < prerequisites.length; idx++)
            dependecyTree[prerequisites[idx][0]].add(prerequisites[idx][1]);
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        while(!stack.isEmpty()){
            int t = stack.pop();
            for(int num : dependecyTree[t]){

            }
        }
        return null;
    }
}

/*class Solutionxxxxxxxx {

    int p;
    public int[] findOrder(int n, int[][] req) {
        ArrayList[] g = new ArrayList[n];

        // build adjacence list
        for (int i = 0; i < n; ++i)
            g[i] = new ArrayList<>();

        for (int i = 0; i < req.length; ++i)
            g[req[i][0]].add(req[i][1]);

        // b: visiting state, c: course order
        byte[] b = new byte[n];
        int[]  c = new int[n];

        // dfs check validity
        for (int i = 0; i < n; ++i) {
            if (dfs(g, b, c, i) < 0)
                return new int[0];
        }
        return c;
    }

    *//** postorder-like traverse with fiiling in array backwards *//*
    private byte dfs(ArrayList[] g, byte[] b, int[] c, int k) {
        if (b[k] != 0) return b[k];
        b[k] = -1;

        for (int i = 0; i < g[k].size(); ++i)
            if (dfs(g, b, c, (int) g[k].get(i)) < 0)
                return b[k];

        c[p++] = k;
        return b[k] = 1;
    }
}*/
