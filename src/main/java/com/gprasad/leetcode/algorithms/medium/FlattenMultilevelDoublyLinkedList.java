package com.gprasad.leetcode.algorithms.medium;

import java.util.LinkedList;
import java.util.Queue;

public class FlattenMultilevelDoublyLinkedList {

    public static Node flatten(Node head) {
        if (head == null) return head;
        Queue<Node> q = new LinkedList<>();
        flatten(head, q);
        Node curr = q.remove();
        Node root = curr;
        root.child = null;
        while (q.peek() != null) {
            Node node = q.poll();
            curr.next = node;
            curr.next.prev = curr;
            curr = node;
            curr.child = null;
        }
        return root;
    }

    public static void flatten(Node head, Queue<Node> q) {
        if (head == null) return;
        q.add(head);
        flatten(head.child, q);
        flatten(head.next, q);
    }

    public static void main(String[] args) {
        Node node = new Node();
        node.next = new Node();
        node.val = 1;
        node.next.val = 2;
        node.next.prev = node;
        node.next.next = new Node();
        node.next.next.val = 3;
        node.next.next.prev = node.next;
        node.next.next.next = new Node();
        node.next.next.next.val = 4;
        node.next.next.next.prev = node.next.next;
        node.next.next.next.next = new Node();
        node.next.next.next.next.val = 5;
        node.next.next.next.next.prev = node.next.next.next;
        node.next.next.next.next.next = new Node();
        node.next.next.next.next.next.val = 6;
        node.next.next.next.next.next.prev = node.next.next.next.next;
        Node nodeCl1 = new Node();
        nodeCl1.val = 7;
        nodeCl1.next = new Node();
        nodeCl1.next.val = 8;
        nodeCl1.next.prev = nodeCl1;
        nodeCl1.next.next = new Node();
        nodeCl1.next.next.val = 9;
        nodeCl1.next.next.prev = nodeCl1.next;
        nodeCl1.next.next.next = new Node();
        nodeCl1.next.next.next.val = 10;
        nodeCl1.next.next.next.prev = nodeCl1.next.next;
        node.next.next.child = nodeCl1;
        Node nodeCl2 = new Node();
        nodeCl2.val = 11;
        nodeCl2.next = new Node();
        nodeCl2.next.val = 12;
        nodeCl2.next.prev = nodeCl2;
        nodeCl1.next.child = nodeCl2;
        node = flatten(node);

        printList(node);
    }

    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println("");
    }
}
