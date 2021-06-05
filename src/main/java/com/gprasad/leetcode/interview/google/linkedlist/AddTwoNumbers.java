package com.gprasad.leetcode.interview.google.linkedlist;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(-1);
        ListNode curr = result;
        int carryOver = 0;
        while (l1 != null || l2 != null) {
            int sum = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + carryOver;
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
            curr.next = new ListNode(sum % 10);
            carryOver = sum / 10;
            curr = curr.next;
        }
        curr.next = carryOver!=0?new ListNode(carryOver):null;
        return result.next;
    }
}
