package com.gprasad.leetcode.interview.apple.design;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
//TODO : REVISIT
public class LRUCache {
    private int capacity;
    Map<Integer, Integer> cache;
    LinkedList<Integer> sequence;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<>();
        this.sequence = new LinkedList<>();
    }

    public int get(int key) {
        if(cache.containsKey(key)){
            sequence.remove(key);
            sequence.addFirst(key);
            return cache.get(key);
        }
        return -1;
    }

    public void put(int key, int value) {
        cache.put(key,value);
        if(sequence.size()>capacity) cache.remove(sequence.pollLast());
        sequence.remove(Integer.valueOf(key));
        sequence.addFirst(key);
    }
}
