package com.gprasad.leetcode.interview.facebook.linkedlist;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(-1);
        ListNode pointer = result;
        int co = 0;
        while(l1!=null || l2!=null){
            int sum = (l1!=null?l1.val:0)+(l2!=null?l2.val:0)+co;
            co = sum/10;
            pointer.next = new ListNode(sum%10);
            l1=l1!=null?l1.next:null;
            l2=l2!=null?l2.next:null;
            pointer= pointer.next;
        }
        if(co>0) pointer.next = new ListNode(co);
        return result.next;
    }
}
