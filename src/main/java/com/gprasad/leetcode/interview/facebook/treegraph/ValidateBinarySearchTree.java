package com.gprasad.leetcode.interview.facebook.treegraph;

import com.gprasad.leetcode.interview.amazon.arraystring.IntegerToRoman;

public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {

        return isValidBST(root, null, null);
    }
    public boolean isValidBST(TreeNode root, Integer lower, Integer upper){
        if(root == null) return true;
        int val = root.val;
        if(lower!=null && val<=lower) return false;
        if(upper!=null && val>=upper) return false;
        if(!isValidBST(root.left, lower, val)) return false;
        if(!isValidBST(root.right,val, upper)) return false;
        return true;
    }

}
