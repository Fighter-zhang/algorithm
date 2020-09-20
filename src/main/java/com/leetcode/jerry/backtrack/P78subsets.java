package com.leetcode.jerry.backtrack;

import java.util.ArrayList;
import java.util.List;

public class P78subsets {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        if (nums == null || nums.length < 1){
            return res;
        }

        backtrack(nums, res, 0 , new ArrayList<Integer>());

        return res;
    }

    private void backtrack(int[] nums, List<List<Integer>> res, int index,
                           ArrayList<Integer> cur) {
        res.add(new ArrayList<>(cur));

        for(int i = index; i < nums.length; i++){
            cur.add(nums[i]);
            backtrack(nums,res, i + 1,cur);
            cur.remove(cur.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        P78subsets p78subsets = new P78subsets();
        List<List<Integer>> res = p78subsets.subsets(nums);
        for (List<Integer> list : res) {
            for (Integer integer : list) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }
    }
}
