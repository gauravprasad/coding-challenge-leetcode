package com.gprasad.leetcode.algorithms.hard;

import java.util.PriorityQueue;

public class MergeKSortedLists {

    public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null || lists.length==0) return null;
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b)->Integer.compare(a.val, b.val));
        ListNode head = new ListNode(-1);
        ListNode curr = head;
        for(ListNode ln : lists)  if(ln!=null) pq.offer(ln);
        while(!pq.isEmpty()){
            ListNode ln = pq.poll();
            curr.next = ln;
            curr = curr.next;
            if(ln.next!=null) pq.offer(ln.next);
        }
        return head.next;
    }

    public ListNode mergeKLists2(ListNode[] lists) {
        if(lists==null || lists.length==0) return null;
        ListNode list = lists[0];
        for(int i=1;i<lists.length;i++){
            list = merge(list, lists[i]);
        }
        return list;
    }
    private ListNode merge(ListNode l1, ListNode l2){
        ListNode result = new ListNode(-1);
        ListNode curr = result;
        while (l1!=null && l2!=null){
            if(l1.val< l2.val) {
                curr.next=new ListNode(l1.val);
                l1 = l1.next;
            }else{
                curr.next=new ListNode(l2.val);
                l2 = l2.next;
            }
            curr = curr.next;
        }
        curr.next = l1!=null?l1:l2;
        return result.next;
    }
}
