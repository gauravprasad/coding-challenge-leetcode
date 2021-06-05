package com.gprasad.leetcode.algorithms.medium;

import java.util.ArrayList;
import java.util.List;
//TODO: time complexity is perfect. need to work on space.
public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (n == 0) return head;
        ListNode curr = head;
        List<ListNode> listNodes = new ArrayList<>();
        while (curr != null) {
            listNodes.add(curr);
            curr = curr.next;
        }
        int size = listNodes.size();
        if (size == n) {
            head = size!=1?listNodes.get(1):null;
        } else if (n == 1) {
            listNodes.get(size - 2).next = null;
        }else {
            ListNode prev = listNodes.get(size - n - 1);
            ListNode next = listNodes.get(size - n + 1);
            prev.next = next;
        }
        return head;
    }
}
