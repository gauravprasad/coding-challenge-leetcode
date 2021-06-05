package com.gprasad.leetcode.interview.google.linkedlist;

import java.util.HashMap;
import java.util.Map;

public class CopyListWithRandomPointer {
    public Node copyRandomList(Node head) {
        Map<Node, Node> deepCopyMap = new HashMap<>();
        Node copy = new Node(-1);
        Node traversal = copy;
        while (head != null) {
            Node newNode = null;
            if (deepCopyMap.containsKey(head)) newNode = deepCopyMap.get(head);
            else {
                newNode = new Node(head.val);
                deepCopyMap.put(head, newNode);
            }
            if (head.random != null) {
                if (deepCopyMap.containsKey(head.random)) newNode.random = deepCopyMap.get(head.random);
                else {
                    newNode.random = new Node(head.random.val);
                    deepCopyMap.put(head.random, newNode.random);
                }
            }
            traversal.next = newNode;
            traversal = traversal.next;
            head = head.next;
        }
        return copy.next;
    }
}
