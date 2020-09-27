package com.leetcode.jerry.treenode;

import com.leetcode.jerry.tophot.TreeNode;

public class P235lowestCommonAncestor {
    TreeNode res = null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
         return (root.val - p.val) * (root.val - q.val) <= 0 ? root : lowestCommonAncestor(p.val < root.val ? root.left : root.right, p, q);
    }

    public TreeNode trackback(TreeNode root, TreeNode p, TreeNode q){
        if (root != null){
            return res;
        }
        if (root ==p || root ==q){
            res = p == root ? p : q;
        }
        if (root.val < p.val && root.val < q.val){
            trackback(root.left,p,q);
        }
        else if (root.val > p.val && root.val > q.val){
            trackback(root.right,p,q);
        }else {
            res = root;
        }
        return res;

    }
}
