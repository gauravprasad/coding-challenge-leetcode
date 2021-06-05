package com.gprasad.leetcode.interview.facebook.treegraph;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class FlattenBinaryTreeToLinkedList {
    /*Queue<TreeNode> nodes  = new LinkedList<>();
    public void flatten(TreeNode root) {
        helper(root);
        TreeNode temp = new TreeNode(-1);
        while(!nodes.isEmpty()){
            temp.right = nodes.poll();
            temp.left=null;
            temp = temp.right;
        }
        root = temp.right;
    }

    private void helper(TreeNode root){
        if(root==null) return;
        nodes.add(root);
        helper(root.left);
        helper(root.right);
    }*/
    public void flatten(TreeNode root) {
        root = flattenTree(root);
    }

    private TreeNode flattenTree(TreeNode node) {
        if (node == null || (node.left == null && node.right == null)) return node;
        TreeNode left = flattenTree(node.left);
        TreeNode right = flattenTree(node.right);
        if (left != null) {
            left.right = node.right;
            node.right = node.left;
            node.left = null;
        }
        return right==null?left:right;
    }
}
