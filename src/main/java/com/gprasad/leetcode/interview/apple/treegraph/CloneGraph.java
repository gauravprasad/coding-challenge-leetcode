package com.gprasad.leetcode.interview.apple.treegraph;

import java.util.*;

public class CloneGraph {
    private Map<Node, Node> nodeMap = new HashMap<>();

    public Node cloneGraph(Node node) {
        if (node == null) return node;
        if (nodeMap.containsKey(node)) return nodeMap.get(node);
        Node cNode = new Node(node.val, new ArrayList<>());
        nodeMap.put(node, cNode);
        for (Node n : node.neighbors) cNode.neighbors.add(cloneGraph(n));
        return cNode;
    }

    public Node cloneGraph2(Node node) {
        if (node == null) return node;
        Map<Node, Node> map = new HashMap<>();
        map.put(node, new Node(node.val, new ArrayList<>()));
        Queue<Node> q = new LinkedList<>();
        q.add(node);

        while(!q.isEmpty()){
            Node n = q.remove();
            for(Node tn: n.neighbors){
                if(!map.containsKey(tn)){
                    map.put(tn, new Node(tn.val, new ArrayList<>()));
                    q.add(tn);
                }
                map.get(n).neighbors.add(map.get(tn));
            }
        }
        return map.get(node);
    }
}
