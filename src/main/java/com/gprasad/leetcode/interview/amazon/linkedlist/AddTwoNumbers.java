package com.gprasad.leetcode.interview.amazon.linkedlist;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ln1 = l1;
        ListNode ln2 = l2;
        ListNode result = new ListNode(0);
        ListNode curr = result;
        int co = 0;
        while(ln1!=null || ln2!=null){
            int temp = (ln1!=null?ln1.val:0)+(ln2!=null?ln2.val:0)+co;
            co = temp/10;
            curr.next=new ListNode(temp%10);
            ln1 = ln1!=null?ln1.next:null;
            ln2 = ln2!=null?ln2.next:null;
            curr = curr.next;
        }
        if(co>0) curr.next = new ListNode(co);
        return result.next;
    }
}
