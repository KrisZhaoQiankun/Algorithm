package com.medp.leetcode.sort;

import java.util.Arrays;
import java.util.HashMap;

/**
 * [LeetCode-169]
 * 查找众数
 *
 * @author MEDP
 * @date 2022/3/23 20:53
 */
public class FindMajorityElement {
    /**
     * 用hash表记录数字出现的次数然后打擂
     *
     * @param nums
     * @return
     */
    public int majorityElement(int[] nums) {
        int max = 0;
        int val = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
                if (max < map.get(num)) {
                    max = map.get(num);
                    val = num;
                }
            } else {
                map.put(num, 1);
                if (max < 1) {
                    max = 1;
                    val = num;
                }
            }
        }
        return val;
    }

    /**
     * 排序后的数组n/2下标的位置一定是众数
     *
     * @param nums
     * @return
     */
    public int majorityElementSorted(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }

    public static void main(String[] args) {
        System.out.println(new FindMajorityElement().majorityElement(new int[]{1, 2, 3, 3, 2, 2, 4}));
        System.out.println(new FindMajorityElement().majorityElementSorted(new int[]{1, 2, 3, 3, 2, 2, 4}));
    }
}
