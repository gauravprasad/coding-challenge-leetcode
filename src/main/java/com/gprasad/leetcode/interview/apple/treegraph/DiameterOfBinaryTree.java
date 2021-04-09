package com.gprasad.leetcode.interview.apple.treegraph;

public class DiameterOfBinaryTree {
    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
       getDiameter(root);
       return diameter;
    }

    private int getDiameter(TreeNode currNode){
        if(currNode==null) return 0;
        int leftDepth = getDiameter(currNode.left);
        int rightDepth = getDiameter(currNode.right);
        diameter = Math.max(diameter, leftDepth+rightDepth);
        return Math.max(leftDepth,rightDepth)+1;
    }
}
