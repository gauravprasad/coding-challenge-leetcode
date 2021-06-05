package com.gprasad.leetcode.interview.google.treegraph;

public class CountCompleteTreeNodes {
    public int countNodes(TreeNode root) {
        return countNodes(root, 0);
    }

    private int countNodes(TreeNode root, int count) {
        if (root == null) return 0;
        int leftCount = countNodes(root.left,count);
        int rightCount = countNodes(root.right,count);
        return 1+leftCount+rightCount;
    }
}
