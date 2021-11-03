package com.gprasad.leetcode.algorithms.medium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SwapNodesInPairsTest {
    private SwapNodesInPairs swapNodesInPairs;
    @BeforeAll
    void initialized() {
        System.out.println("@BeforeAll executed");
        swapNodesInPairs = new SwapNodesInPairs();
    }

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @ParameterizedTest(name= " # {index} - Input {0} expected {1}")
    @CsvSource(value = {"1,2,3,4|2,1,4,3","|","1|1"}, delimiterString = "|")
    void swapPairs( String input,String expected) {
        assertEquals(swapNodesInPairs.swapPairs(getListNode(input)), getListNode(expected));
    }

    private ListNode getListNode(String input){
        ListNode out = new ListNode(-1);
        for(String n : input.split(",")){
            out.next=new ListNode(Integer.valueOf(n));
        }
        return out.next;
    }
}