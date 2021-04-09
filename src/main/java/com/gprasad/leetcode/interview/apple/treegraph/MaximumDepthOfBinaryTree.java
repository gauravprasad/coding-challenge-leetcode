package com.gprasad.leetcode.interview.apple.treegraph;

public class MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        return maxDepth(root,0);
    }

    public int maxDepth(TreeNode root, int count) {
        if (root == null) return count;
        return Math.max(maxDepth(root.left,count+1),maxDepth(root.right,count+1));
    }
}
