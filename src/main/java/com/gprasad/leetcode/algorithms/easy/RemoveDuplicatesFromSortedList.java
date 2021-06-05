package com.gprasad.leetcode.algorithms.easy;

public class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
       ListNode traverse = head;
       while(traverse!=null && traverse.next!=null){
            if (traverse.next.val==traverse.val) traverse.next = traverse.next.next;
            else traverse = traverse.next;
       }
       return head;
    }
}
