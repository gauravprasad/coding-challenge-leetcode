package com.gprasad.leetcode.interview.facebook.linkedlist;

import java.util.List;

public class ReorderList {
    public void reorderList(ListNode head) {
        if(head==null || head.next==null) return;
        ListNode firstHead = head;
        ListNode firstTail = null;
        ListNode secondHead = head;
        ListNode secondTail = head;
        while(secondTail!=null && secondTail.next!=null){
            firstTail = secondHead;
            secondHead = secondHead.next;
            secondTail =  secondTail.next.next;
        }
        firstTail.next=null;
        secondHead = revListNode(secondHead);
        mergeList(head,secondHead);

    }

    private ListNode revListNode(ListNode node) {
        ListNode rev = null;
        while (node != null) {
            ListNode temp = new ListNode(node.val);
            temp.next = rev;
            rev = temp;
            node = node.next;
        }
        return rev;
    }

    private void mergeList(ListNode l1, ListNode l2) {
        while (l1 != null) {
            ListNode l1Next = l1.next;
            ListNode l2Next = l2.next;
            l1.next=l2;
            if(l1Next==null) break;
            l2.next = l1Next;
            l1 = l1Next;
            l2 = l2Next;
        }
    }
}
