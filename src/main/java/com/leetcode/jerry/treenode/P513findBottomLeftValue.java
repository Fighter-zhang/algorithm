package com.leetcode.jerry.treenode;

import com.leetcode.jerry.tophot.TreeNode;

public class P513findBottomLeftValue {

    int max = -1;
    int value = 0;
    public int findBottomLeftValue(TreeNode root) {
        trackback(root, 0);
        return value;
    }

    public void trackback(TreeNode root, int depth){
        if (root == null){
            return;
        }
        depth = depth + 1;
        if (depth > max){
            max = depth;
            value = root.val;
        }
        trackback(root.left,depth);
        trackback(root.right,depth);
    }
}
