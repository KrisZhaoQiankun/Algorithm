package com.medp.leetcode.sort;

import java.util.Arrays;

/**
 * [LeetCode-88]
 * 合并两个有序的数组
 *
 * @author SenWolf
 * @date 2022/3/22 22:50
 */
public class MergeTwoSortedArray {

    /**
     *
     * 合并两个数组然后排序
     *
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }

    /**
     * 利用数组排序特性，使用双指针
     *
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public void mergeWithDoublePointer(int[] nums1, int m, int[] nums2, int n) {
        int p1 = 0;
        int p2 = 0;
        int[] sorted = new int[m+n];
        int curr;
        while(p1 < m || p2 < n) {
            if (p1 == m) {
                curr = nums2[p2++];
            } else if (p2 == n) {
                curr = nums1[p1++];
            } else if (nums1[p1] < nums2[p2]) {
                curr = nums1[p1++];
            } else {
                curr = nums2[p2++];
            }
            sorted[p1 + p2 -1] = curr;
        }
        System.arraycopy(sorted, 0,nums1, 0, m+n);
        System.out.println(Arrays.toString(nums1));
    }

    /**
     * 使用逆双指针,不用担心数据被覆盖
     *
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public void mergeWithDoublePointerReverse(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m -1;
        int p2 = n -1;
        int curr;
        int tail = m + n -1;
        while(p1 >= 0 || p2 >= 0) {
            if (p1 == -1) {
                curr = nums2[p2--];
            } else if (p2 == -1) {
                curr = nums1[p1--];
            } else if (nums1[p1] < nums2[p2]) {
                curr = nums2[p2--];
            } else {
                curr = nums1[p1--];
            }
            nums1[tail--] = curr;
        }
        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        new MergeTwoSortedArray().merge(new int[]{1, 2, 4, 0, 0}, 3, new int[]{3, 5}, 2);
        new MergeTwoSortedArray().mergeWithDoublePointer(new int[]{1, 2, 4, 0, 0}, 3, new int[]{3, 5}, 2);
        new MergeTwoSortedArray().mergeWithDoublePointerReverse(new int[]{1, 2, 4, 0, 0}, 3, new int[]{3, 5}, 2);
    }
}
