package com.gprasad.leetcode.interview.amazon.design;

import java.util.Arrays;
import java.util.List;

public class Executor {
    private static LRUCache lruCache = null;
    public static void main(String[] args) {

        /*List<String> operations = Arrays.asList("LRUCache","get","put","get","put","put","get","get");
        int[][] values =  {{2},{2},{2,6},{1},{1,5},{1,2},{1},{2}};
        for (int i=0;i<operations.size();i++){
            System.out.printf(" %d ->",operate(operations.get(i),values[i]));
        }*/

       MedianFinder mf=new MedianFinder();
       mf.addNum(1);
       mf.addNum(2);
       System.out.println(mf.findMedian());
        mf.addNum(3);
       System.out.println(mf.findMedian());
    }

    public static Integer operate(String operation, int[] val) {
        switch (operation) {
            case "LRUCache":
                lruCache = new LRUCache(val[0]);
                return null;
            case "put":
                lruCache.put(val[0], val[1]);
                return null;
            case "get":
                return lruCache.get(val[0]);
            default:
                return 500;
        }
    }

}
//[null,-1,null,-1,null,null,2,6]