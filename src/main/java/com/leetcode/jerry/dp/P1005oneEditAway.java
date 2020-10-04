package com.leetcode.jerry.dp;

public class P1005oneEditAway {
    public boolean oneEditAway(String first, String second) {
        if (Math.abs(first.length() - second.length()) > 1){
            return  false;
        }
        int i = 0;
        int j = first.length();
        int k = second.length();
        while (i < first.length() && i < second.length() && first.charAt(i) == second.charAt(i)){
            i++;
        }
        while (j >= 0 && k >= 0 && first.charAt(j) == second.charAt(k)){
            j--;
            k--;
        }
        return j - i < 1 && k - i < 1;
    }
}
