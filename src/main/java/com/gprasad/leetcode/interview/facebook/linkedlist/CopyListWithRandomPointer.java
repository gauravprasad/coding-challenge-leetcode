package com.gprasad.leetcode.interview.facebook.linkedlist;

import java.util.HashMap;
import java.util.Map;

public class CopyListWithRandomPointer {

    public Node copyRandomList(Node head) {
        Node deepCopy = new Node(-1);
        Map<Node, Node> deepCopyMap = new HashMap<>();
        Node copyTraversal = deepCopy;
        while(head!=null){
            Node newNode = null;
            if(deepCopyMap.containsKey(head)){
                newNode = deepCopyMap.get(head);
            }else {
                newNode = new Node(head.val);
                deepCopyMap.put(head, newNode);
            }
            if(deepCopy==null) deepCopy=newNode;
            if(head.random!=null){
                if(deepCopyMap.containsKey(head.random)){
                    newNode.random = deepCopyMap.get(head.random);
                }
                else{
                    newNode.random = new Node(head.random.val);
                    deepCopyMap.put(head.random, newNode.random);
                }
            }
            copyTraversal.next = newNode;
            copyTraversal = newNode;
            head = head.next;
        }
        System.out.println();
        return deepCopy.next;
    }
}
