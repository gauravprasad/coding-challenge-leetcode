package com.gprasad.leetcode.interview.google.treegraph;

public class BinaryTreeMaximumPathSum {
    private int maxVal = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        max(root);
        return maxVal;
    }

    public int max(TreeNode root) {
        if (root == null) return 0;
        int left = max(root.left);
        int right = max(root.right);
        int maxSub = Math.max(Math.max(left, right) + root.val, root.val);
        int maxSum = Math.max(maxSub, left + right + root.val);
        maxVal = Math.max(maxSum, maxVal);
        return maxSub;
    }

}
