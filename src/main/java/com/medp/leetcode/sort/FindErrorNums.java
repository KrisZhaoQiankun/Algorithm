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
     * 判断有缺陷，待修改
     *
     * @param nums
     * @return
     */
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - nums[i-1] == 2) {
                return new int[]{nums[i], nums[i] - 1};
            } else if (nums[i] - nums[i-1] == 0){
                return new int[]{nums[i], nums[i] + 1};
            }
        }
        return new int[]{};
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
    }
}
