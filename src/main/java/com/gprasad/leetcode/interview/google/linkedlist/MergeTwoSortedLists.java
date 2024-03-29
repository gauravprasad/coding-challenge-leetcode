package com.gprasad.leetcode.interview.google.linkedlist;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(-1);
        ListNode cur = result;
        while(l1!=null && l2 != null){
            if(l1.val< l2.val){
                cur.next=l1;
                l1=l1.next;
            }else {
                cur.next=l2;
                l2=l2.next;
            }
            cur = cur.next;
        }
        cur.next= l1!=null?l1:l2;
        return result.next;
    }
}
