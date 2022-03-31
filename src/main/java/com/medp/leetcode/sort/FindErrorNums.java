package com.medp.leetcode.sort;

import java.util.Arrays;

/**
 * [LeetCode-645]
 * 错误的集合
 *
 * @author MEDP
 * @date 2022/3/30 23:49
 */
public class FindErrorNums {

    /**
     *  考虑到所有的情况
     *
     * @param nums
     * @return
     */
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int prev = 0;
        int[] errorNums = new int[2];
        for (int i = 0; i < n; i++) {
            int curr = nums[i];
            if (curr - prev == 0) {
                errorNums[0] = curr;
            } else if (curr - prev > 1){
                errorNums[1] = prev + 1;
            }
            prev = curr;
        }
        if (nums[n-1] != n) {
            errorNums[1] = n;
        }
        return errorNums;
    }

    /**
     * 正确解法
     *
     * @param nums
     * @return
     */
    public int[] findErrorNumsCorrect(int[] nums) {

        int[] counter = new int[nums.length+1];

        for (int i: nums) {
            counter[i]++;
        }

        int[] result = new int[2];
        for (int i = 1; i<counter.length; i++) {
            if (counter[i] == 0) {
                result[1] = i;
            } else if (counter[i] == 2) {
                result[0] = i;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new FindErrorNums().findErrorNums(new int[]{1, 2, 2, 4})));
        System.out.println(Arrays.toString(new FindErrorNums().findErrorNums(new int[]{1, 1})));
    }
}
