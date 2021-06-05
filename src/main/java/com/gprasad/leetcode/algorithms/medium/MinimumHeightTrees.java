/*
  For a undirected graph with tree characteristics, we can choose any node as the root. The result graph is then a rooted tree. Among all possible rooted trees, those with minimum height are called minimum height trees (MHTs). Given such a graph, write a function to find all the MHTs and return a list of their root labels.

Format
The graph contains n nodes which are labeled from 0 to n - 1. You will be given the number n and a list of undirected edges (each edge is a pair of labels).

You can assume that no duplicate edges will appear in edges. Since all edges are undirected, [0, 1] is the same as [1, 0] and thus will not appear together in edges.

Example 1:

Given n = 4, edges = [[1, 0], [1, 2], [1, 3]]

        0
        |
        1
       / \
      2   3

return [1]

Example 2:

Given n = 6, edges = [[0, 3], [1, 3], [2, 3], [4, 3], [5, 4]]

     0  1  2
      \ | /
        3
        |
        4
        |
        5

return [3, 4] 
 */
package com.gprasad.leetcode.algorithms.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author gq6pras
 */
public class MinimumHeightTrees {

    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<Integer> result = new ArrayList<>();
        if (n <= 0) {
            return result;
        }
        if (n == 1 && edges.length == 0) {
            result.add(0);
            return result;
        }
        List<Set<Integer>> adList = getGraph(n, edges);
        int node = 0;
        for (Set<Integer> neibhor : adList) {
            if (neibhor.size() == 1) {
                result.add(node);
            }
            node++;
        }
        while (n > 2) {
            n-=result.size();
            List<Integer> temp = new ArrayList<>();
            for(int rNode:result)
            {
                int neibhor = adList.get(rNode).iterator().next();
                adList.get(neibhor).remove(rNode);
                if(adList.get(neibhor).size()==1)
                {
                    temp.add(neibhor);
                }
            }
            result=temp;
        }

        return result;
    }

    public List<Set<Integer>> getGraph(int n, int[][] edges) {
        List<Set<Integer>> adList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adList.add(new HashSet<Integer>());
        }
        for (int[] edge : edges) {
            adList.get(edge[0]).add(edge[1]);
            adList.get(edge[1]).add(edge[0]);
        }
        return adList;
    }
//    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
//        List<Integer> result = new ArrayList<>();
//        if(edges==null || edges.length==0)
//        {
//            return result;
//        }
//        Map<Integer, List<Integer>> adMap = prepareGraph(edges);
//        Integer minHeigt = Integer.MAX_VALUE;
//        boolean[] visited = new boolean[n];
//        for (int i = 0; i < n; i++) {
//            Integer height = getHeight(i, adMap, visited);
//            if (minHeigt > height) {
//                result.clear();
//                result.add(i);
//                minHeigt=height;
//            } else if (minHeigt.equals(height)) {
//                result.add(i);
//            }
//        }
//        return result;
//    }
//

    public Map<Integer, List<Integer>> prepareGraph(int[][] edges) {
        Map<Integer, List<Integer>> adMap = new HashMap<>();
        for (int[] edge : edges) {
            if (!adMap.containsKey(edge[0])) {
                adMap.put(edge[0], new ArrayList<Integer>());
            }
            if (!adMap.containsKey(edge[1])) {
                adMap.put(edge[1], new ArrayList<Integer>());
            }
            adMap.get(edge[0]).add(edge[1]);
            adMap.get(edge[1]).add(edge[0]);
        }
        return adMap;
    }

    public Integer getHeight(int root, Map<Integer, List<Integer>> adMap, boolean[] visited) {
        int height = 0;
        visited[root] = true;
        List<Integer> neighbors = adMap.get(root);
        for (Integer neighbor : neighbors) {
            if (!visited[neighbor]) {
                height = Math.max(height, getHeight(neighbor, adMap, visited));
            }
        }
        visited[root] = false;
        return height + 1;
    }

    public static void main(String[] args) {
        int n = 6;
        int[][] edges = new int[5][2];
        edges[0][0] = 0;
        edges[0][1] = 3;
        edges[1][0] = 1;
        edges[1][1] = 3;
        edges[2][0] = 2;
        edges[2][1] = 3;
        edges[3][0] = 4;
        edges[3][1] = 3;
        edges[4][0] = 5;
        edges[4][1] = 4;
        MinimumHeightTrees heightTrees = new MinimumHeightTrees();
        System.out.println(">>>>> " + heightTrees.findMinHeightTrees(n, edges));

    }
}
