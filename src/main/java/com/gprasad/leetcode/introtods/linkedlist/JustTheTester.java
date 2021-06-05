package com.gprasad.leetcode.introtods.linkedlist;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;



public class JustTheTester {
    private static MyLinkedList myLinkedList;
    private static int step = 0;
    public static void main(String[] args) {
        List<String> ops= Arrays.asList("MyLinkedList","addAtHead","get","addAtHead","addAtHead","deleteAtIndex","addAtHead","get","get","get","addAtHead","deleteAtIndex");
        int[][] vals = {{},{4},{1},{1},{5},{3},{7},{3},{3},{3},{1},{4}};
        IntStream.range(0, ops.size()).forEach(x-> switchExecutor(ops.get(x), vals[x]));
    }

    private static void switchExecutor(String opp, int[] val){
        System.out.println("STEP = "+step);
        switch (opp){
            case "MyLinkedList":
                System.out.println("INITIALIZING... ");
                myLinkedList = new MyLinkedList();
                break;
            case "addAtHead":
                System.out.println("addAtHead = "+val[0]);
                myLinkedList.addAtHead(val[0]);
                myLinkedList.printList();
                break;
            case "addAtTail":
                System.out.println("addAtTail = "+val[0]);
                myLinkedList.addAtTail(val[0]);
                myLinkedList.printList();
                break;
            case "addAtIndex":
                System.out.println("addAtIndex ::: INDEX = "+val[0]+" VAL = "+val[1]);
                myLinkedList.addAtIndex(val[0], val[1]);
                myLinkedList.printList();
                break;
            case "deleteAtIndex":
                System.out.println("deleteAtIndex = "+val[0]);
                myLinkedList.deleteAtIndex(val[0]);
                myLinkedList.printList();
                break;
            case "get":
                System.out.println("get = "+val[0]);
                System.out.println(myLinkedList.get(val[0]));
                break;
            default:
                System.out.println("opp not available");
        }
        System.out.println("MY LINKED LIST SIZE : = "+myLinkedList.getSize()+"\n");
        step++;
    }

}
