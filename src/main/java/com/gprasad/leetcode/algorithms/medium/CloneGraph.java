package com.gprasad.leetcode.algorithms.medium;

import java.util.*;

public class CloneGraph {
    Map<Node, Node> deepCopyMap = new HashMap<>();
    public Node cloneGraphDFS(Node node) {
        if(node==null) return node;
        if(deepCopyMap.containsKey(node)) return deepCopyMap.get(node);
        Node deepCopyNode = new Node(node.val,new ArrayList<>());
        deepCopyMap.put(node, deepCopyNode);
        for(Node n : node.neighbors){
            deepCopyNode.neighbors.add(cloneGraphDFS(n));
        }
        return deepCopyNode;
    }
    public Node cloneGraphBFS(Node node) {
        if(node == null) return node;
        Map<Node, Node> cloneMap = new HashMap<>();
        Queue<Node> traverse = new LinkedList<>();
        traverse.add(node);
        cloneMap.put(node,new Node(node.val, new ArrayList<>()));
        while(!traverse.isEmpty()){
            Node temp = traverse.poll();
            for(Node n : temp.neighbors){
                if(!cloneMap.containsKey(n)){
                    cloneMap.put(n, new Node(n.val, new ArrayList<>()));
                    traverse.add(n);
                }
                cloneMap.get(temp).neighbors.add(cloneMap.get(n));
            }
        }
        return cloneMap.get(node);
    }
}
