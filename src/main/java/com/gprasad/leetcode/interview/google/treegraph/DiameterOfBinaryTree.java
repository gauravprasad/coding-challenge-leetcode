package com.gprasad.leetcode.interview.google.treegraph;

public class DiameterOfBinaryTree {
    private int diameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return diameter;
    }

    private int dfs(TreeNode root) {
        if (root == null) return 0;
        int left = dfs(root.left);
        int right = dfs(root.right);
        diameter = Math.max(diameter, (left + right));
        return Math.max(left, right) + 1;
    }
}
