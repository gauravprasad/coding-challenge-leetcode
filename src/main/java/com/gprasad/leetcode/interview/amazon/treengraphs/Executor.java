package com.gprasad.leetcode.interview.amazon.treengraphs;

import java.util.stream.Collectors;

public class Executor {
    public static void main(String[] args) {
       /* BinaryTreeLevelOrderTraversal orderTraversal = new BinaryTreeLevelOrderTraversal();
        System.out.println(orderTraversal.levelOrder(getTreeNode()));*/
        /*orderTraversal.levelOrder(getTreeNode()).stream().forEach(list->{
            String data = list.stream().map(x->String.valueOf(x)).collect(Collectors.joining(","));
            System.out.println(data);
        });*/
        printTreeNode(getSymmetricTreeNode());
        System.out.println();
        System.out.println(new SymmetricTree().isSymmetric(getSymmetricTreeNode()));
        printTreeNode(getTreeNode());
        System.out.println();
        System.out.println(new BinaryTreeZigzagLevelOrderTraversal().zigzagLevelOrder(getTreeNode()));
    }

    private static TreeNode getTreeNode() {
        TreeNode nodeRL2 = new TreeNode(15);
        TreeNode nodeRR2 = new TreeNode(7);
        TreeNode nodeL1 = new TreeNode(9);
        TreeNode nodeR1 = new TreeNode(20, nodeRL2, nodeRR2);
        TreeNode nodeRoot0 = new TreeNode(3, nodeL1, nodeR1);
        return nodeRoot0;
    }

    private static TreeNode getSymmetricTreeNode() {
        TreeNode RRR3 = null;//new TreeNode(5);
        TreeNode RRL3 = new TreeNode(6);
        TreeNode RLR3 = new TreeNode(7);
        TreeNode RLL3 = new TreeNode(8);
        TreeNode LRR3 = new TreeNode(8);
        TreeNode LRL3 = new TreeNode(7);
        TreeNode LLR3 = new TreeNode(6);
        TreeNode LLL3 = new TreeNode(5);
        TreeNode RR2 = new TreeNode(3,RRL3,RRR3);
        TreeNode RL2 = new TreeNode(4,RLL3,RLR3);
        TreeNode LR2 = new TreeNode(4,LRL3,LRR3);
        TreeNode LL2 = new TreeNode(3,LLL3,LLR3);
        TreeNode R1 = new TreeNode(2,RL2,RR2);
        TreeNode L1 = new TreeNode(2,LL2,LR2);
        TreeNode root = new TreeNode(1,L1,R1);
        return root;
    }

    private static void printTreeNode(TreeNode nodes){
        if(nodes!=null){
            System.out.printf("[root node : %d ::: left node : %d ::: right node : %d] -> ", nodes.val, nodes.left!=null?nodes.left.val:null,nodes.right!=null?nodes.right.val:null);
            printTreeNode(nodes.left);
            printTreeNode(nodes.right);
        }
    }

}
