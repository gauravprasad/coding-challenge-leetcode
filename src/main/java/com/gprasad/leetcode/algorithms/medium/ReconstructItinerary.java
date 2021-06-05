/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gprasad.leetcode.algorithms.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author gq6pras
 */
public class ReconstructItinerary {
    private List<String> itinerary = null;
    private Map<String, Queue<String>> itineraryMap = null;
    public List<String> findItinerary(String[][] tickets) {
        itinerary = new ArrayList<>();
        itineraryMap = new HashMap<>();
        for(String[] strArr: tickets)
        {
            if(!itineraryMap.containsKey(strArr[0]))
            {
                itineraryMap.put(strArr[0], new PriorityQueue<String>());
            }
            itineraryMap.get(strArr[0]).offer(strArr[1]);
        }
        dfs("JFK");
        return itinerary;
    }
    
    private void dfs(String current)
    {
        Queue<String> q = itineraryMap.get(current);
        while(q!=null && !q.isEmpty())
        {
            dfs(q.poll());
        }
        itinerary.add(0,current);
    }
}
