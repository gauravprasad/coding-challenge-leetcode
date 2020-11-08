package com.gprasad.leetcode.explore.learn.ds.tree.binarytree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inorderList = new ArrayList<>();
        inorderTraversal(root, inorderList);
        return inorderList;
    }

    private void inorderTraversal(TreeNode root, List<Integer> inorderList) {
        if(root==null){
            return;
        }
        if(root.left!=null) inorderTraversal(root.left,inorderList);
        inorderList.add(root.val);
        if(root.right!=null) inorderTraversal(root.right,inorderList);
    }
}
