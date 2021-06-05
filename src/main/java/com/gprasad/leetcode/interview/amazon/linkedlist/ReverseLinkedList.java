package com.gprasad.leetcode.interview.amazon.linkedlist;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode reverse = null;
        while(head!=null){
            ListNode temp = new ListNode(head.val);
            temp.next = reverse;
            reverse = temp;
            head = head.next;
        }
        return reverse;
    }

}
