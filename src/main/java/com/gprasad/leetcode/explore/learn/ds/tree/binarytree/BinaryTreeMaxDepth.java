package com.gprasad.leetcode.explore.learn.ds.tree.binarytree;

public class BinaryTreeMaxDepth {

    /*public Integer maximumDepth(TreeNode root, Integer depth) {
        if (root == null) {
            return depth;
        }
        int leftDepth = maximumDepth(root.left, depth + 1);
        int rightDepth = maximumDepth(root.right, depth + 1);
        return Math.max(leftDepth, rightDepth) + 1;
    }*/

    public Integer maximumDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftDepth = maximumDepth(root.left);
        int rightDepth = maximumDepth(root.right);
        return Math.max(leftDepth, rightDepth) + 1;
    }
}
