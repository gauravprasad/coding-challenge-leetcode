package com.gprasad.leetcode.interview.facebook.linkedlist;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode mergedSortedList =new ListNode(-1);
        ListNode pointer = mergedSortedList;
        while(l1!=null && l2!=null){
            if(l1.val<l2.val) {
                pointer.next = l1;
                l1 = l1.next;
            }
            else {
                pointer.next = l2;
                l2 = l2.next;
            }

            pointer = pointer.next;
        }
        pointer.next = l1!=null?l1:l2;
        return mergedSortedList.next;
    }
}
