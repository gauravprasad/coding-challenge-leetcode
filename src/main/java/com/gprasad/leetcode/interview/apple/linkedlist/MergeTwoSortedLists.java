package com.gprasad.leetcode.interview.apple.linkedlist;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(-1);
        ListNode curr = result;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                curr.next = new ListNode(l1.val);
                l1 = l1.next;
            } else {
                curr.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            curr = curr.next;
        }
        curr.next = l1!=null?l1:l2;
        return result.next;
    }
}
