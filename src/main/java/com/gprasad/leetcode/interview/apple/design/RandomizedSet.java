package com.gprasad.leetcode.interview.apple.design;

import java.util.*;

public class RandomizedSet {
    private Set<Integer> set;
    private List<Integer> list;
    private Random rn;

    /**
     * Initialize your data structure here.
     */
    public RandomizedSet() {
        set = new HashSet<>();
        list = new ArrayList<>();
        rn = new Random();
    }

    /**
     * Inserts a value to the set. Returns true if the set did not already contain the specified element.
     */
    public boolean insert(int val) {
        if(set.add(val)){
            list.add(val);
            return true;
        }
        return false;
    }

    /**
     * Removes a value from the set. Returns true if the set contained the specified element.
     */
    public boolean remove(int val) {
        if(set.remove(val)){
            list.remove(Integer.valueOf(val));
            return true;
        }
        return false;
    }

    /**
     * Get a random element from the set.
     */
    public int getRandom() {
        return list.get(rn.nextInt(list.size()));
    }
}
