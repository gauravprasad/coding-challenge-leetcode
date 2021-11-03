package com.gprasad.leetcode.algorithms.medium;


/*
109. Convert Sorted List to Binary Search Tree
Medium

Given the head of a singly linked list where elements are sorted in ascending order, convert it to a height balanced BST.

For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.



Example 1:


Input: head = [-10,-3,0,5,9]
Output: [0,-3,9,-10,null,5]
Explanation: One possible answer is [0,-3,9,-10,null,5], which represents the shown height balanced BST.
Example 2:

Input: head = []
Output: []
Example 3:

Input: head = [0]
Output: [0]
Example 4:

Input: head = [1,3]
Output: [3,1]


Constraints:

The number of nodes in head is in the range [0, 2 * 104].
-105 <= Node.val <= 105
 */
public class ConvertSortedListToBinarySearchTree {
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) return null;
        ListNode middle = getMiddle(head);
        TreeNode root = new TreeNode(middle.val);
        if (middle == head) return root;
        root.left = sortedListToBST(head);
        root.right = sortedListToBST(middle.next);
        return root;
    }

    private ListNode getMiddle(ListNode head) {
        ListNode slow = head, fast = head, prev = null;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if (prev != null) prev.next = null;
        return slow;
    }
}
