package com.gprasad.leetcode.interview.amazon.treengraphs;

import java.util.stream.Collectors;

public class Executor {
    public static void main(String[] args) {
        BinaryTreeLevelOrderTraversal orderTraversal = new BinaryTreeLevelOrderTraversal();
        System.out.println(orderTraversal.levelOrder(getTreeNode()));
        /*orderTraversal.levelOrder(getTreeNode()).stream().forEach(list->{
            String data = list.stream().map(x->String.valueOf(x)).collect(Collectors.joining(","));
            System.out.println(data);
        });*/
    }

    private static TreeNode getTreeNode(){
        TreeNode nodeRL2 = new TreeNode(15);
        TreeNode nodeRR2 = new TreeNode(7);
        TreeNode nodeL1 = new TreeNode(9);
        TreeNode nodeR1 = new TreeNode(20, nodeRL2, nodeRR2);
        TreeNode nodeRoot0 = new TreeNode(3, nodeL1, nodeR1);
        return nodeRoot0;
    }

}
