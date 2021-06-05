package com.gprasad.leetcode.interview.apple.treegraph;

import java.util.*;

public class LowestCommonAncestorOfABinaryTree {
    TreeNode result = null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        findLCARecursion(root, p, q);
        return result;
    }

    public boolean findLCARecursion(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null) return false;
        int left = findLCARecursion(root.left,p,q)?1:0;
        int right = findLCARecursion(root.right,p,q)?1:0;
        int mid = (root.val==p.val||root.val==q.val) ?1:0;
        result = (left+right+mid)>=2?root:result;
        return (left+right+mid)>0;
    }

    public TreeNode lowestCommonAncestor2(TreeNode root, TreeNode p, TreeNode q) {
        Map<TreeNode, TreeNode> backTrackMap = new HashMap<>();
        Queue<TreeNode> traversalQ = new LinkedList<>();
        backTrackMap.put(root, null);
        traversalQ.offer(root);
        while (!backTrackMap.containsKey(p) || !backTrackMap.containsKey(q)){
            TreeNode node = traversalQ.poll();
            if(node.left!=null){
                backTrackMap.put(node.left,node);
                traversalQ.offer(node.left);
            }
            if(node.right!=null){
                backTrackMap.put(node.right,node);
                traversalQ.offer(node.right);
            }
        }
        Set<TreeNode> allPAncestor = new HashSet<>();
        while(p!=null){
            allPAncestor.add(p);
            p = backTrackMap.get(p);
        }
        while (!allPAncestor.contains(q)){
            q = backTrackMap.get(q);
        }
        return q;
    }
}
