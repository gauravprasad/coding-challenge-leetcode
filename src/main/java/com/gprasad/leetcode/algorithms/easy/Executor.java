package com.gprasad.leetcode.algorithms.easy;

public class Executor {
    public static void main(String[] args) {
        System.out.println(new NumberOfSegmentsInAString().countSegments("Hello, my name is John"));
        System.out.println(new NumberOfSegmentsInAString().countSegments("Hello"));
        System.out.println(new NumberOfSegmentsInAString().countSegments("love live! mu'sic forever"));
        System.out.println(new NumberOfSegmentsInAString().countSegments(""));
        System.out.println(new NumberOfSegmentsInAString().countSegments("    foo    bar"));
        System.out.println(new NumberOfSegmentsInAString().countSegments(", , , ,        a, eaefa"));
    }
}
