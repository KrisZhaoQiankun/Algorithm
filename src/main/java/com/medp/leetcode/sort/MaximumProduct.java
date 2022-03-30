package com.medp.leetcode.sort;

import java.util.Arrays;

/**
 * [LeetCode-628]
 * 三个数的最大乘积
 *
 * @author MEDP
 * @date 2022/3/30 23:30
 */
public class MaximumProduct {

    // 分析出三种最大值的情况
    // 1. 全部非负数/全部非整数最大乘积都为排序后最后三个数字的成绩
    // 2. 有正数负数，则最大乘积为最后三个数的成绩或最小两个和最大的那个成绩
    // 综上，比较排序后三个最大数组成绩和最小两个和最大一个乘积即可
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        return Math.max(nums[0] * nums[1] * nums[len-1], nums[len - 3] * nums[len - 2] * nums[len - 1]);
    }

    public static void main(String[] args) {
        System.out.println(new MaximumProduct().maximumProduct(new int[]{-100, -98, -1, 2, 3, 4}));
    }
}
