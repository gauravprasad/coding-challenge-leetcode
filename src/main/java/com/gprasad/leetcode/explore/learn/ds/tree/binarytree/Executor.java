package com.gprasad.leetcode.explore.learn.ds.tree.binarytree;

import java.util.stream.Collectors;

public class Executor {
    public static void main(String[] args) {
        BinaryTreePreorderTraversal binaryTreePreorderTraversal = new BinaryTreePreorderTraversal();
        String preOrderTraversal = binaryTreePreorderTraversal.preorderTraversal(getBinaryTree()).stream().map(i->String.valueOf(i)).collect(Collectors.joining(" | "));
        System.out.println(preOrderTraversal);
        BinaryTreeInorderTraversal binaryTreeInorderTraversal = new BinaryTreeInorderTraversal();
        String inOrderTraversal = binaryTreeInorderTraversal.inorderTraversal(getBinaryTree()).stream().map(i->String.valueOf(i)).collect(Collectors.joining(" | "));
        System.out.println(inOrderTraversal);
        BinaryTreePostorderTraversal binaryTreePostorderTraversal = new BinaryTreePostorderTraversal();
        String postOrderTraversal = binaryTreePostorderTraversal.postorderTraversal(getBinaryTree()).stream().map(i->String.valueOf(i)).collect(Collectors.joining(" | "));
        System.out.println(postOrderTraversal);
        BinaryTreeMaxDepth maxDepth = new BinaryTreeMaxDepth();
        System.out.println(maxDepth.maximumDepth(getBinaryTree()));

    }

    public static TreeNode getBinaryTree() {
        TreeNode c = new TreeNode(3);
        TreeNode e = new TreeNode(5);
        TreeNode h = new TreeNode(8);
        TreeNode a = new TreeNode(1);
        TreeNode d = new TreeNode(4, c, e);
        TreeNode i = new TreeNode(9, h, null);
        TreeNode b = new TreeNode(2, a, d);
        TreeNode g = new TreeNode(7, null, i);
        TreeNode f = new TreeNode(6, b, g);
        return f;
    }
}
