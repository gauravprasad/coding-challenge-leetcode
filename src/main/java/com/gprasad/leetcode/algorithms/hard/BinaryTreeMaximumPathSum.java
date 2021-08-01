package com.gprasad.leetcode.algorithms.hard;

public class BinaryTreeMaximumPathSum {
    int maxSum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        maxSumFinder(root);
        return maxSum;
    }

    private int maxSumFinder(TreeNode root) {
        if (root == null) return 0;
        int left = maxSumFinder(root.left);
        int right = maxSumFinder(root.right);
        int initMax = Math.max(Math.max(left, right) + root.val, root.val);
        int maxSub = Math.max(initMax, root.val + left + right);
        maxSum = Math.max(maxSum, maxSub);
        return initMax;
    }
}
