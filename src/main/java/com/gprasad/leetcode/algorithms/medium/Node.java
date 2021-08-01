package com.gprasad.leetcode.algorithms.medium;

import java.util.ArrayList;
import java.util.List;

public class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
    public Node left;
    public Node right;
    public Node parent;
    public List<Node> neighbors;

    public Node() {
        val = 0;
        neighbors = new ArrayList<>();
    }

    public Node(int _val,Node _prev,Node _next,Node _child) {
        val = _val;
        prev = _prev;
        next = _next;
        child = _child;
    }

    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }

    public Node(Node left, Node right, Node parent, int val) {
        this.val = val;
        this.left = left;
        this.right = right;
        this.parent = parent;
    }
}
