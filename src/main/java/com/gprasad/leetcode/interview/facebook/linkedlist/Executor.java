package com.gprasad.leetcode.interview.facebook.linkedlist;



public class Executor {


    public static void main(String[] args) {
        ListNode ln = getList();
        new ReorderList().reorderList(ln);
        printList(ln);

        printListWithRandom(new CopyListWithRandomPointer().copyRandomList(getListForRandom()));

        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        printList(addTwoNumbers.addTwoNumbers(getList1(), getList2()));
        printList(addTwoNumbers.addTwoNumbers(getList3(), getList4()));

        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();
        printList(mergeTwoSortedLists.mergeTwoLists(getList1(),getList2()));

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

    private static ListNode getList() {
        ListNode ln6 = new ListNode(7);
        ListNode ln5 = new ListNode(6, ln6);
        ListNode ln4 = new ListNode(5, ln5);
        ListNode ln3 = new ListNode(4, ln4);
        ListNode ln2 = new ListNode(3, ln3);
        ListNode ln1 = new ListNode(2, ln2);
        ListNode head = new ListNode(1, ln1);
        return head;
    }

    private static Node getListForRandom() {

        Node ln4 = new Node(1);
        Node ln3 = new Node(10);
        Node ln2 = new Node(11);
        Node ln1 = new Node(13);
        Node head = new Node(7);
        head.next = ln1;
        ln1.next=ln2;
        ln2.next=ln3;
        ln3.next=ln4;
        ln1.random=head;
        ln2.random=ln4;
        ln3.random=ln2;
        ln4.random=head;
        return head;
    }

    private static void printList(ListNode ln){
        while(ln!=null){
            System.out.print(ln.val+" -> ");
            ln=ln.next;
        }
        System.out.print("\n");
    }

    private static void printListWithRandom(Node ln){
        while(ln!=null){
            System.out.print("["+ln.val+","+(ln.random!=null?ln.random.val:null)+"] -> ");
            ln=ln.next;
        }
        System.out.print("\n");
    }
}
