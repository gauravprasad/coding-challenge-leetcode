package com.gprasad.leetcode.interview.amazon.design;

import java.util.ArrayList;
import java.util.List;

public class MedianFinder {
    List<Integer> storage;

    /**
     * initialize your data structure here.
     */
    public MedianFinder() {
        storage = new ArrayList<>();
    }

    public void addNum(int num) {
        storage.add(0,num);
    }

    public double findMedian() {
        return storage.size()%2==0?(Double.valueOf(storage.get(storage.size()/2))+Double.valueOf(storage.get((storage.size()/2)-1)))/2:Double.valueOf(storage.get(storage.size()/2));
    }
}
//["MedianFinder","addNum","findMedian","addNum","findMedian","addNum","findMedian","addNum","findMedian","addNum","findMedian","addNum","findMedian","addNum","findMedian","addNum","findMedian","addNum","findMedian","addNum","findMedian","addNum","findMedian"]
//[[],[6],[],[10],[],[2],[],[6],[],[5],[],[0],[],[6],[],[3],[],[1],[],[0],[],[0],[]]
//[null,null,6.00000,null,8.00000,null,10.00000,null,6.00000,null,2.00000,null,4.00000,null,6.00000,null,5.50000,null,5.00000,null,2.50000,null,0.00000]
//[null,null,6.00000,null,8.00000,null,6.00000,null,6.00000,null,6.00000,null,5.50000,null,6.00000,null,5.50000,null,5.00000,null,4.00000,null,3.00000]