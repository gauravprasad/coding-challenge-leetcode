package com.gprasad.leetcode.interview.apple.linkedlist;

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

    public ListNode reverseList2(ListNode head) {
        ListNode reverse = null;
        while(head!=null){
            ListNode temp = head.next;
            head.next = reverse;
            reverse = head;
            head = temp;
        }
        return reverse;
    }
}
