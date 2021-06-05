package com.gprasad.leetcode.interview.amazon.treengraphs;

import java.util.*;

public class BinaryTreeZigzagLevelOrderTraversal {
    /*public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;
        Boolean zFlag = true;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> inner = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode node  = q.poll();
                int arrIndex = zFlag?i:0;
                inner.add(arrIndex,node.val);
                if(node.left!=null) q.add(node.left);
                if (node.right!=null) q.add(node.right);
            }
            result.add(inner);
            zFlag = !zFlag;
        }
        return result;
    }*/
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        zigzagLevelOrder(root, 0, result);
        return result;
    }

    private void zigzagLevelOrder(TreeNode node, int depth, List<List<Integer>> result) {
        if (node == null) return;
        if (result.size() == depth) result.add(new ArrayList<>());
        if (depth % 2 == 0) result.get(depth).add(node.val);
        else result.get(depth).add(0, node.val);
        zigzagLevelOrder(node.left, depth + 1, result);
        zigzagLevelOrder(node.right, depth + 1, result);
    }
}
