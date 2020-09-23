package com.leetcode.jerry.treenode;

import com.leetcode.jerry.tophot.TreeNode;

public class P617mergeTrees {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null){
            return t2;
        }
        if (t2 == null){
            return t1;
        }
        /**
         * 和归并排序算法相似，归并排序,先排左边,在排右边，最后两边组合
         */
        TreeNode merged = new TreeNode(t1.val + t2.val);
        merged.left = mergeTrees(t1.left, t2.left);
        merged.right = mergeTrees(t1.right, t2.right);
        return merged;
    }


}
