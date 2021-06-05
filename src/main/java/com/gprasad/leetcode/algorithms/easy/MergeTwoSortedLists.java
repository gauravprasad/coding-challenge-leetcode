package com.gprasad.leetcode.algorithms.easy;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while (true) {
            if (l1 == null) {
                tail.next = l2;
                break;
            }
            if (l2 == null) {
                tail.next = l1;
                break;
            }
            if(l1.val<=l2.val){
                tail.next = l1;
                l1 = l1.next;
            }
            if(l2.val<=l1.val){
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }
        return dummy.next;
    }
}
