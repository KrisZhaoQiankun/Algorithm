package com.medp.leetcode.sort;

import java.util.Arrays;

/**
 * [LeetCode-561]
 * 数组拆分I
 *
 * @author MEDP
 * @date 2022/3/28 21:43
 */
public class ArrayPairSum {

    /**
     * 牺牲最小的
     *
     * @param nums
     * @return
     */
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        for (int i = 0; i < nums.length; i += 2) {
            count += nums[i];
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new ArrayPairSum().arrayPairSum(new int[]{6, 2, 6, 5, 1, 2}));
    }
}
