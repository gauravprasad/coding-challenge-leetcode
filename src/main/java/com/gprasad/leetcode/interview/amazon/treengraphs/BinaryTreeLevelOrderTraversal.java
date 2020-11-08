package com.gprasad.leetcode.interview.amazon.treengraphs;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root!=null)resultPrep(root,0,result);
        return result;
    }

    private void resultPrep(TreeNode root,Integer depth ,List<List<Integer>> result){
        if(result.size()==depth) result.add(new ArrayList<>());
        result.get(depth).add(root.val);
        if(root.left!=null) resultPrep(root.left, depth+1, result);
        if(root.right!=null) resultPrep(root.right, depth+1, result);
    }
    /*public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue
        return result;
    }*/


}
