package com.gprasad.leetcode.algorithms.easy;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> availability = new HashSet<>();
        while (head != null) {
            if (!availability.add(head)) return true;
            head = head.next;
        }
        return false;
    }

    public boolean hasCycleOther(ListNode head) {
        ListNode slow, fast;
        for (slow = head, fast = head; fast != null && fast.next != null && slow != null; ) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow)
                return true;
        }
        return false;
    }
}
