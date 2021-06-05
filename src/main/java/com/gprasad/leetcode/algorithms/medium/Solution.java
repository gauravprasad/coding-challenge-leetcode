package com.gprasad.leetcode.algorithms.medium;

/**
 *
 * @author gq6pras
 *
 * You are given two linked lists representing two non-negative numbers. The
 * digits are stored in reverse order and each of their nodes contain a single
 * digit. Add the two numbers and return it as a linked list.
 *
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4) Output: 7 -> 0 -> 8
 *
 * public class ListNode { int val; ListNode next; ListNode(int x) { val = x; }
 * }
 */
public class Solution {

    boolean flag = false;

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        l1.val = l1.val + l2.val + (flag ? 1 : 0);
        if (l1.val >= 10) {
            l1.val = l1.val % 10;
            flag = true;
        } else {
            flag = false;
        }

        if(l1.next != null||l2.next!=null) {
            l1.next = l1.next!=null?l1.next:new ListNode(0);
            l2.next = l2.next!=null?l2.next:new ListNode(0);
            addTwoNumbers(l1.next, l2.next);
        }
        if(l1.next==null && flag)
        {
            l1.next=new ListNode(1);
        }
        return l1;
    }
}

/*

 while(l1.next!=null){
 tmp=l1.next;
 l1.next=null;
 tmp.next=l1;
            
            
 }
 */
