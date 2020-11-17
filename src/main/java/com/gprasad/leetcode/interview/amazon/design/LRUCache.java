package com.gprasad.leetcode.interview.amazon.design;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class LRUCache {
    private Map<Integer, Integer> cache;
    private Deque<Integer> keysSequence;
    private Integer capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<>();
        this.keysSequence = new LinkedList<>();
    }

    public int get(int key) {
        if (cache.containsKey(key)) {
            keysSequence.remove(key);
            keysSequence.addFirst(key);
            return cache.get(key);
        }
        return -1;
    }

    public void put(int key, int value) {
        cache.put(key, value);
        if (cache.size() > capacity) cache.remove(keysSequence.pollLast());
        keysSequence.remove(key);
        keysSequence.addFirst(key);
    }
}
