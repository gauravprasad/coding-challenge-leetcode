package com.gprasad.leetcode.interview.apple.linkedlist;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode ln1 = l1;
        ListNode ln2 = l2;
        ListNode curr = result;
        int carryOver = 0;
        while(ln1!=null || ln2!=null){
            int sum = (ln1!=null?ln1.val:0)+(ln2!=null?ln2.val:0)+carryOver;
            carryOver = sum/10;
            curr.next=new ListNode(sum%10);
            curr=curr.next;
            ln1 = ln1!=null?ln1.next:ln1;
            ln2 = ln2!=null?ln2.next:ln2;
        }
        if(carryOver!=0){
            curr.next = new ListNode(carryOver);
        }
        return result.next;
    }
}
