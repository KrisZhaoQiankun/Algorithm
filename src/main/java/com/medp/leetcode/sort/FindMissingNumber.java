package com.medp.leetcode.sort;

import java.util.Arrays;

/**
 * [LeetCode-268]
 * 丢失的数字
 *
 * @author MEDP
 * @date 2022/3/23 21:58
 */
public class FindMissingNumber {
    /**
     * 减去缺失的数字
     *
     * @param nums
     * @return
     */
    public int missingNumber(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        if (nums.length % 2 == 0) {
            return nums.length/2 * (nums.length+1) - sum;
        } else {
            return nums.length/2 * (nums.length+1) + (nums.length+1)/2 -sum;
        }
    }

    /**
     *
     * @param nums
     * @return
     */
    public int missingNumberTwo(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return n;

    }



    public static void main(String[] args) {
        System.out.println(new FindMissingNumber().missingNumber(new int[]{0, 1}));
    }
}
