package com.gprasad.leetcode.algorithms.easy;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Executor {
    public static void main(String[] args) {
        /*System.out.println(new NumberOfSegmentsInAString().countSegments("Hello, my name is John"));
        System.out.println(new NumberOfSegmentsInAString().countSegments("Hello"));
        System.out.println(new NumberOfSegmentsInAString().countSegments("love live! mu'sic forever"));
        System.out.println(new NumberOfSegmentsInAString().countSegments(""));
        System.out.println(new NumberOfSegmentsInAString().countSegments("    foo    bar"));
        System.out.println(new NumberOfSegmentsInAString().countSegments(", , , ,        a, eaefa"));*/
        /*System.out.println(new FibonacciNumber().fib(10));
        System.out.println(new FibonacciNumber().fib(1));
        System.out.println(new FibonacciNumber().fib(0));
        System.out.println(new FibonacciNumber().fibArr(10));
        System.out.println(new FibonacciNumber().fibArr(1));
        System.out.println(new FibonacciNumber().fibArr(0));*/
        //System.out.println(new DivisorGame().divisorGame(3));
//        System.out.println(new MinCostClimbingStairs().minCostClimbingStairs(new int[]{10,15,20}));
        //System.out.println(new ClimbingStairs().climbStairs(4));
        //System.out.println(Arrays.stream(new PlusOne().plusOne(new int[]{9,9,9,9})).boxed().map(x->String.valueOf(x)).collect(Collectors.joining(",")));
        /*ListNode ln = new RemoveDuplicatesFromSortedList().deleteDuplicates(new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3))))));
        while(ln!=null){
            System.out.println(ln.val);
            ln  =ln.next;
        }*/
//        new MergeSortedArray().merge(new int[]{1,2,3,0,0,0},3, new int[]{2,5,6},3);

        System.out.println(new MaximumSubarray().maxSubArray(new int[]{-1}));
    }
}
