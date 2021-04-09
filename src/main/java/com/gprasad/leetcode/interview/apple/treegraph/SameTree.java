package com.gprasad.leetcode.interview.apple.treegraph;

import java.util.LinkedList;
import java.util.Queue;

public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        if(p.val!=q.val) return false;
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
    public boolean isSameTree2(TreeNode p, TreeNode q) {
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        Queue<TreeNode> pQ = new LinkedList<>();
        Queue<TreeNode> qQ = new LinkedList<>();
        pQ.add(p);
        qQ.add(q);
        while (!pQ.isEmpty() || !qQ.isEmpty()) {
            if ((pQ.size() != pQ.size()) || (pQ.peek().val != qQ.peek().val)) return false;
            else {
                TreeNode pN = pQ.poll();
                TreeNode qN = qQ.poll();
                if (!validate(pN.left, qN.left,pQ,qQ)) return false;
                if (!validate(pN.right, qN.right,pQ,qQ)) return false;
            }
        }
        return true;
    }

    private boolean validate(TreeNode p, TreeNode q,Queue<TreeNode> pQ,Queue<TreeNode> qQ) {
        if ((p != null && q != null) && (p.val != q.val)) return false;
        else if (p != null && q == null) return false;
        else if (p == null && q != null) return false;
        else if((p != null && q != null)){
            pQ.offer(p);
            qQ.offer(q);
            return true;
        }
        return true;
    }
}
