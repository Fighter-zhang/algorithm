package com.leetcode.jerry.sort;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {10,4324,235,43564,6,547,65,8,67,987,6,2,453,5,2454,3,535,3453};
        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public void mergeSort(int[] arr){
        if (arr == null || arr.length < 1){
            return;
        }
        merge(arr, 0, arr.length - 1);
    }
    public void merge(int[] arr , int left , int right){
        if (left == right){
            return;
        }
        int mid = left + ((right - left) >> 1);
        merge(arr, left,mid);
        merge(arr, mid + 1, right);
        mergetSort(arr,mid, left, right);
    }


    public void mergetSort(int[] arr, int mid , int left ,int right){
        int p1 = left;
        int p2 = mid + 1;
        int i = 0;
        int[] nums = new int[right - left + 1];
        while (p1 <= mid && p2 <= right){
            nums[i++] = arr[p1] < arr[p2] ? arr[p1++] : arr[p2++];
        }
        while (p1<=mid){
            nums[i++] = arr[p1++];
        }
        while (p2 <= right){
            nums[i++] = arr[p2++];
        }
        for (i = 0; i < nums.length; i++) {
            arr[left + i] = nums[i];
        }
    }
}
