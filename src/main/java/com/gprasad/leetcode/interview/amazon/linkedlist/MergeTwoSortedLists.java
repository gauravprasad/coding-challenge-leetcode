package com.gprasad.leetcode.interview.amazon.linkedlist;

public class MergeTwoSortedLists {

    /*public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null) return l2;
        if(l2==null) return l1;
        ListNode ln1 = l1, ln2=l2, result=new ListNode(0), curr = result;
        while(ln1!=null || ln2!=null){
            if(ln1==null && ln2!=null) {
                curr.next=ln2;
                break;
            }
            if(ln2==null && ln1!=null) {
                curr.next=ln1;
                break;
            }
            if(ln1.val<ln2.val){
                curr.next = ln1;
                ln1 = ln1.next;
            }else {
                curr.next = ln2;
                ln2 = ln2.next;
            }
            curr=curr.next;
        }
        return result.next;
    }*/

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode preHead = new ListNode(-1);
        ListNode prev = preHead;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                prev.next = new ListNode(l1.val);
                l1 = l1.next;
            } else {
                prev.next = new ListNode(l2.val);
                l2=l2.next;
            }
            prev = prev.next;
        }
        prev.next = l1!=null?l1:l2;
        return preHead.next;
    }

}
