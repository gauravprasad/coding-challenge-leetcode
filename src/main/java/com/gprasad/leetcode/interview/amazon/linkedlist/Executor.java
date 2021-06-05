package com.gprasad.leetcode.interview.amazon.linkedlist;

public class Executor {
    public static void main(String[] args) {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        printList(addTwoNumbers.addTwoNumbers(getList1(), getList2()));
        printList(addTwoNumbers.addTwoNumbers(getList3(), getList4()));

        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();
        printList(mergeTwoSortedLists.mergeTwoLists(getList1(),getList2()));

        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        printList(reverseLinkedList.reverseList(getList5()));
    }

    private static ListNode getList1(){
        ListNode ln2 = new ListNode(4);
        ListNode ln1 = new ListNode(2,ln2);
        ListNode head = new ListNode(1,ln1);
        return head;
    }

    private static ListNode getList2(){
        ListNode ln2 = new ListNode(4);
        ListNode ln1 = new ListNode(3,ln2);
        ListNode head = new ListNode(1,ln1);
        return head;
    }

    private static ListNode getList3(){
        ListNode ln6 = new ListNode(9);
        ListNode ln5 = new ListNode(9,ln6);
        ListNode ln4 = new ListNode(9,ln5);
        ListNode ln3 = new ListNode(9,ln4);
        ListNode ln2 = new ListNode(9,ln3);
        ListNode ln1 = new ListNode(9,ln2);
        ListNode head = new ListNode(9,ln1);
        return head;
    }

    private static ListNode getList4(){
        ListNode ln3 = new ListNode(9);
        ListNode ln2 = new ListNode(9,ln3);
        ListNode ln1 = new ListNode(9,ln2);
        ListNode head = new ListNode(9,ln1);
        return head;
    }

    private static ListNode getList5(){
        ListNode ln6 = new ListNode(7);
        ListNode ln5 = new ListNode(6,ln6);
        ListNode ln4 = new ListNode(5,ln5);
        ListNode ln3 = new ListNode(4,ln4);
        ListNode ln2 = new ListNode(3,ln3);
        ListNode ln1 = new ListNode(2,ln2);
        ListNode head = new ListNode(1,ln1);
        return head;
    }


    private static void printList(ListNode ln){
        while(ln!=null){
            System.out.print(ln.val+" -> ");
            ln=ln.next;
        }
        System.out.print("\n");
    }
}
