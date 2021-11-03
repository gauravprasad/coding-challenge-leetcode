package com.gprasad.leetcode.algorithms.medium;

import java.util.ArrayList;
import java.util.List;
//TODO: time complexity is perfect. need to work on space.
public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (n == 0) return head;
        ListNode curr = head;
        List<ListNode> listNodes = new ArrayList<>();
        while (curr != null) {
            listNodes.add(curr);
            curr = curr.next;
        }
        int size = listNodes.size();
        if (size == n) {
            head = size!=1?listNodes.get(1):null;
        } else if (n == 1) {
            listNodes.get(size - 2).next = null;
        }else {
            ListNode prev = listNodes.get(size - n - 1);
            ListNode next = listNodes.get(size - n + 1);
            prev.next = next;
        }
        return head;
    }
}
class Solutionzzzz {
    class Index
    {
        int value = 0;
        boolean temp = false;

    }


    public ListNode removeNthFromEnd(ListNode head, int n) {
        Index idx = new Index();
        ListNode temp = function(head, n, idx);
        return temp;


    }
    public ListNode function(ListNode insidehead, int n, Index idx)
    {
        if(insidehead == null) return null;
        ListNode inside = function(insidehead.next, n, idx);
        idx.value = idx.value + 1;
        if(idx.value == n)
        {
            idx.temp = true;
            return inside;

        }
        if(idx.temp)
        {
            insidehead.next = inside;

        }
        return insidehead;



    }
}
/*
public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p1=head;
        int len=0;
        while(p1!=null){
            len++;
            p1=p1.next;
        }
        int diff = len-n;
        ListNode p2=head;
        if (diff ==0){
            //remove head
            head=head.next;
            return head;
        }
        while (diff >1){
             p2 = p2.next;
            diff--;
        }
        p2.next=p2.next.next;
        return head;


    }
* */

/*
public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode first = dummy;
        ListNode second = dummy;
        for (int i = 0; i <= n; i++) {
            first = first.next;
        }
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return dummy.next;
    }
 */