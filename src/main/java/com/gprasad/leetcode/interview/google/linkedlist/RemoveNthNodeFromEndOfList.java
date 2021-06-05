package com.gprasad.leetcode.interview.google.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return head;
        ListNode fast = head;
        ListNode slow = head;
        for (int idx = 0; idx < n; idx++) {
            fast = fast.next;
        }
        if (fast == null) return head.next;
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
