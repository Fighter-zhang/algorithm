package com.leetcode.jerry.treenode;

import com.leetcode.jerry.tophot.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class P113pathSum {
    public static void main(String[] args) {

    }
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<>();
        if (res == null){
            return res;
        }
        trackback(root,sum,res, new ArrayList<>());
        return res;
    }

    public void trackback(TreeNode root, int sum ,
                          List<List<Integer>> res, List<Integer> cur ){
        if (root == null){
            return;
        }
        sum = sum - root.val;
        cur.add(root.val);
        if (root.left == null && root.right == null && sum == 0){
            res.add(new ArrayList<>(cur));
        }
        trackback(root.left, sum, res, cur);
        trackback(root.right, sum, res, cur);
        sum = sum + root.val;
        cur.remove(cur.size() - 1);
    }
}
