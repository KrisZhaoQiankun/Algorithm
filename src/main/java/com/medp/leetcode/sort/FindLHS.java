package com.medp.leetcode.sort;

import java.util.Arrays;

/**
 * [LeetCode-594]
 * 最长和谐子序列
 *
 * @author MEDP
 * @date 2022/3/28 21:52
 */
public class FindLHS {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int max = 0;
        for (int left = 0, right = 1; left < nums.length && right < nums.length; right++) {
            // 当右边减去左边的值大于1left++，因为排过序所以不用担心left>right
            while (nums[right] - nums[left] > 1) {
                left++;
            }
            if (nums[right] - nums[left] == 1) {
                max = Math.max(right - left, max);
            }
        }
        return max == 0 ? 0 : max + 1;
    }

    public static void main(String[] args) {
        System.out.println(new FindLHS().findLHS(new int[]{1, 3, 2, 2, 5, 2, 3, 7}));
        System.out.println(new FindLHS().findLHS(new int[]{1, 2, 2, 1}));
    }
}
