package com.gprasad.leetcode.explore.learn.ds.tree.binarytree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal {


    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> preOrderList = new ArrayList<>();
        preorderTraversal(root, preOrderList);
        return preOrderList;
    }

    private void preorderTraversal(TreeNode root, List<Integer> preOrderList){
        if(root==null){
            return;
        }
        preOrderList.add(root.val);
        if(root.left!=null) preorderTraversal(root.left,preOrderList);
        if(root.right!=null) preorderTraversal(root.right,preOrderList);
    }

}
