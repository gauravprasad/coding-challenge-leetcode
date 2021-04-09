package com.gprasad.leetcode.explore.learn.card.binarysearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ClosestBinarySearchTreeValue {
    public int closestValue(TreeNode root, double target) {
        int val, close = root.val;
        while (root != null) {
            val = root.val;
            close = Math.abs(val - target) < Math.abs(target - close) ? val : close;
            root = target<val?root.left:root.right;
        }
        return close;
    }

    /*public void inorder(TreeNode root, List<Integer> nums) {
        if (root == null) return;
        inorder(root.left, nums);
        nums.add(root.val);
        inorder(root.right, nums);
    }

    public int closestValue(TreeNode root, double target) {
        List<Integer> nums = new ArrayList<>();
        inorder(root, nums);
        int result = Collections.min(nums, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Math.abs(o1 - target) < Math.abs(o2 - target) ? -1 : 1;
            }
        });
        return result;
    }*/
}
