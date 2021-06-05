package com.gprasad.leetcode.algorithms.medium;


//TODO:check back
public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode curr = head;
        ListNode next = head.next;
        curr.next = swapPairs(next.next);
        next.next = curr;
        return next;
    }
}
