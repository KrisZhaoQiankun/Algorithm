package com.medp.leetcode.sort;

import java.util.Arrays;
import java.util.TreeSet;

/**
 * [LeetCode-414]
 * 找第三大的数
 *
 * @author MEDP
 * @date 2022/3/24 21:00
 */
public class FindThirdMax {

    /**
     * 时间复杂度O(nlogn)
     * 倒序排数组，然后依次比较相邻的两个数字，如果不相同++diff ,当++diff=3的时候说明找到了
     * 否则就是最大的那个
     *
     * @param nums
     * @return
     */
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        reverse(nums);
        for (int i = 1, diff = 1; i < nums.length; i++) {
            // 这个条件蛮难想的
            if (nums[i] != nums[i - 1] && ++diff == 3) {
                return nums[i];
            }
        }
        return nums[0];
    }

    /**
     * 反转数组
     *
     * @param nums
     */
    private void reverse(int[] nums) {
        int fore = 0;int back = nums.length - 1;
        while (fore < back) {
            int temp = nums[fore];
            nums[fore] = nums[back];
            nums[back] = temp;
            fore++;
            back--;
        }
    }

    /**
     * 时间复杂度O(n)
     * 利用treeset有序的特性，维护一个大小为3的set,然后根据set的大小返回第一个还是最后一个
     *
     * @param nums
     * @return
     */
    public int thirdMaxTwo(int[] nums) {
        TreeSet<Integer> integers = new TreeSet<>();
        for(int n : nums) {
            integers.add(n);
            if (integers.size() > 3) {
                integers.remove(integers.first());
            }
        }
        return integers.size() == 3 ? integers.first() : integers.last();
    }

}
