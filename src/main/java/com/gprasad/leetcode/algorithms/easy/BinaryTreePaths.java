package com.gprasad.leetcode.algorithms.easy;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        pathConstructor(root, "", paths);
        return paths;
    }

    private void pathConstructor(TreeNode root, String pathVals, List<String> paths) {
        if (root == null) return;
        pathVals += String.valueOf(root.val);
        if (root.left == null && root.right == null) paths.add(pathVals);
        else {
            pathVals += "->";
            pathConstructor(root.left, pathVals, paths);
            pathConstructor(root.right, pathVals, paths);
        }
    }
}
