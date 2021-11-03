package com.gprasad.leetcode.algorithms.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShortestUnsortedContinuousSubarrayTest {

    @Test
    void findUnsortedSubarray1() {
        System.out.println("INPUT ARRAY : 1,3,2,2,2 EXPECTED : 4");
        assertEquals(new ShortestUnsortedContinuousSubarray().findUnsortedSubarray(new int[]{1,3,2,2,2}),4);
    }
    @Test
    void findUnsortedSubarray2() {
        System.out.println("INPUT ARRAY : 1,3,5,4,2 EXPECTED : 4");
        assertEquals(new ShortestUnsortedContinuousSubarray().findUnsortedSubarray(new int[]{1,3,5,4,2}),4);
    }
}