package com.gprasad.leetcode.interview.facebook.treegraph;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class ConvertBinarySearchTreeToSortedDoublyLinkedList {
    public Node treeToDoublyList(Node root) {
        Comparator<Node> compare = (a, b) -> {
            return a.val - b.val;
        };

        Queue<Node> q = new PriorityQueue<>(compare);
        addToQ(root, q);
        Node head = q.poll();
        Node tail = head;
        if (head != null) {
            head.left = tail;
            head.right = tail;
            tail.left = head;
            tail.right = head;
        }
        while (!q.isEmpty()) {
            Node temp = q.poll();
            temp.right = tail.right;
            temp.left = tail.left;
            temp.left.right = temp;
            tail = temp;
            head.left=tail;


        }

        return head;
    }

    private void addToQ(Node node, Queue<Node> q) {
        if (node == null) return;
        q.add(node);
        addToQ(node.left, q);
        addToQ(node.right, q);
    }
}
