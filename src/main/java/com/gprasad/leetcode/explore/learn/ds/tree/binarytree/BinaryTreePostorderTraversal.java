package com.gprasad.leetcode.explore.learn.ds.tree.binarytree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> postOrderList = new ArrayList<>();
        postorderTraversal(root, postOrderList);
        return postOrderList;
    }

    private void postorderTraversal(TreeNode root, List<Integer> postOrderList) {
        if (root == null) {
            return;
        }
        if (root.left != null) postorderTraversal(root.left, postOrderList);
        if (root.right != null) postorderTraversal(root.right, postOrderList);
        postOrderList.add(root.val);
    }
}
