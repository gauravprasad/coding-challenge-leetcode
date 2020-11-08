package com.gprasad.leetcode.introtods.linkedlist;


public class MyLinkedList {
    private Node head;
    private Node tail;
    private int size = -1;

    public int getSize() {
        return size;
    }

    /**
     * Initialize your data structure here.
     */
    public MyLinkedList() {
//        this.head = new Node();
//        this.tail = this.head;
        this.size = 0;
    }

    /**
     * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
     */
    public int get(int index) {
        int value = -1;
        if (index < 0 || index >= size) {
            return value;
        }
        int i = -1;
        Node curr = this.head;
        while (i < index && curr!=null) {
            value = curr.getVal();
            curr = curr.next;
            i++;
        }
        return value;
    }

    /**
     * Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
     */
    public void addAtHead(int val) {
        Node node = new Node(val);
        node.next = this.head;
        this.head = node;
        this.size++;
        if (size == 1) {
            this.tail = this.head;
        }
    }

    /**
     * Append a node of value val to the last element of the linked list.
     */
    public void addAtTail(int val) {
        Node node = new Node(val);
        if (this.tail == null) {
            addAtHead(val);
        } else {
            this.tail.next = node;
            this.tail = node;
            size++;
        }

    }

    /**
     * Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
     */
    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) {
            return;
        }
        Node node = new Node(val);
        if (index == 0) {
            addAtHead(val);
        } else if (index == size) {
            addAtTail(val);
        } else {
            int i = 0;
            Node prev = null;
            Node curr = this.head;
            while (i < index && index != 0 && i < this.size) {
                prev = curr;
                curr = curr.next;
                i++;
            }
            if (prev != null) {
                prev.next = node;
            }
            node.next = curr;
            size++;
        }


    }

    /**
     * Delete the index-th node in the linked list, if the index is valid.
     */
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return;
        }
        int i = 0;
        Node prev = null;
        Node curr = this.head;
        while (i < index && index != 0) {
            prev = curr;
            curr = curr.next;
            i++;
        }
        if (prev != null) {
            prev.next = curr!=null?curr.next:curr;
        } else {
            this.head = this.head.next;
        }
        if(prev != null && prev.next==null){
            this.tail = prev;
        }
        size--;
    }

    public void printList() {
        Node node = this.head;
        while (node != null) {
            System.out.print(node.getVal() + " -> ");
            node = node.next;
        }
        System.out.println("\n");
    }

    private class Node {
        private Integer val;
        private Node next;

        public Node(Integer val, Node next) {
            this.val = val;
            this.next = next;
        }

        public Node(Integer val) {
            this.val = val;
        }

        public Node() {
        }

        public Integer getVal() {
            return val;
        }

        public void setVal(Integer val) {
            this.val = val;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
