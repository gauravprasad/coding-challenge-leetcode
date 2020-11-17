package com.gprasad.leetcode.interview.facebook.treegraph;

public class Executor {
    public static void main(String[] args) {
        /*printTreeNode(getTreeNode2());
        System.out.println();
        TreeNode n = getTreeNode2();
        new FlattenBinaryTreeToLinkedList().flatten(n);
        printTreeNode(n);
        System.out.println();*/
        //System.out.println(new BinaryTreeVerticalOrderTraversal().verticalOrder(getTreeNode3()));

        printTreeNode(new ConvertBinarySearchTreeToSortedDoublyLinkedList().treeToDoublyList(getNode()),6);
    }

    private static Node getNode(){
        Node nodeRR2 = new Node(6);
        Node nodeLR2 = new Node(4);
        Node nodeLL2 = new Node(3);
        Node nodeR1 = new Node(5, null, nodeRR2);
        Node nodeL1 = new Node(2, nodeLL2, nodeLR2);
        Node nodeRoot0 = new Node(1, nodeL1, nodeR1);
        return nodeRoot0;
    }

    private static TreeNode getTreeNode1(){
        TreeNode nodeRR2 = new TreeNode(6);
        TreeNode nodeLR2 = new TreeNode(4);
        TreeNode nodeLL2 = new TreeNode(3);
        TreeNode nodeR1 = new TreeNode(5, null, nodeRR2);
        TreeNode nodeL1 = new TreeNode(2, nodeLL2, nodeLR2);
        TreeNode nodeRoot0 = new TreeNode(1, nodeL1, nodeR1);
        return nodeRoot0;
    }

    private static TreeNode getTreeNode2(){
        TreeNode nodeRRR3 = new TreeNode(15);
        TreeNode nodeRRL3 = new TreeNode(14);
        TreeNode nodeRLR3 = new TreeNode(13);
        TreeNode nodeRLL3 = new TreeNode(12);
        TreeNode nodeRR2 = new TreeNode(11, nodeRRL3, nodeRRR3);
        TreeNode nodeRL2 = new TreeNode(10, nodeRLL3, nodeRLR3);
        TreeNode nodeLRR3 = new TreeNode(8);
        TreeNode nodeLRL3 = new TreeNode(7);
        TreeNode nodeLLR3 = new TreeNode(6);
        TreeNode nodeLLL3 = new TreeNode(5);
        TreeNode nodeLR2 = new TreeNode(4,nodeLRL3, nodeLRR3);
        TreeNode nodeLL2 = new TreeNode(3,nodeLLL3,nodeLLR3);
        TreeNode nodeR1 = new TreeNode(9, nodeRL2, nodeRR2);
        TreeNode nodeL1 = new TreeNode(2, nodeLL2, nodeLR2);
        TreeNode nodeRoot0 = new TreeNode(1, nodeL1, nodeR1);
        return nodeRoot0;
    }

    private static TreeNode getTreeNode3(){
        TreeNode RLR3 = new TreeNode(5);
        TreeNode LLR3 = new TreeNode(11);
        TreeNode LLL3 = new TreeNode(3);
        TreeNode RR2 = new TreeNode(7);
        TreeNode RL2 = new TreeNode(1,null, RLR3);
        TreeNode LL2 = new TreeNode(4,LLL3,LLR3);
        TreeNode R1 = new TreeNode(8, RL2, RR2);
        TreeNode L1 = new TreeNode(9, LL2, null);
        TreeNode R0 = new TreeNode(2, L1, R1);
        return R0;
    }

    private static void printTreeNode(TreeNode nodes){
        if(nodes!=null){
            System.out.printf("[root node : %d ::: left node : %d ::: right node : %d] -> ", nodes.val, nodes.left!=null?nodes.left.val:null,nodes.right!=null?nodes.right.val:null);
            printTreeNode(nodes.left);
            printTreeNode(nodes.right);
        }
    }

    private static void printTreeNode(Node nodes, int n){
        if(nodes!=null&& n>0){
            System.out.printf("[root node : %d ::: left node : %d ::: right node : %d] -> ", nodes.val, nodes.left!=null?nodes.left.val:null,nodes.right!=null?nodes.right.val:null);
            n--;
            printTreeNode(nodes.left, n);
            printTreeNode(nodes.right, n);
        }
    }
}
