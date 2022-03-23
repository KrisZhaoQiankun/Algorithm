package com.medp.leetcode.sort;

import java.util.Arrays;
import java.util.HashSet;

/**
 * [LeetCode-349]
 * 寻找两个数组的交集
 *
 * @author SenWolf
 * @date 2022/3/23 22:26
 */
public class FindIntersection {

    /**
     * 时间复杂度太高
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    set.add(nums1[i]);
                }
            }
        }

        Integer[] integers = set.toArray(new Integer[set.size()]);
        int[] result = new int[integers.length];
        for (int i = 0; i < integers.length; i++) {
            result[i] = integers[i].intValue();
        }
        return result;
    }

    /**
     * 时间复杂度控制在O(1)
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] intersectionTwo(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for (int num : nums1) {
            set.add(num);
        }
        for (int num : nums2) {
            set2.add(num);
        }
        return getIntersection(set, set2);
    }

    private int[] getIntersection(HashSet<Integer> set, HashSet<Integer> set2) {
        if (set.size() > set2.size()) {
            return getIntersection(set2, set);
        }
        HashSet<Integer> set3 = new HashSet<>();
        for (int i : set) {
            if (set2.contains(i)) {
                set3.add(i);
            }
        }
        int[] result = new int[set3.size()];
        int index = 0;
        for (int i : set3) {
            result[index++] = i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new FindIntersection().intersection(new int[]{2, 3}, new int[]{1, 3})));
        System.out.println(Arrays.toString(new FindIntersection().intersectionTwo(new int[]{2, 3}, new int[]{1, 3})));
    }
}
