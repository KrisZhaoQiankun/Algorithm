package com.senwolf.leetcode.array;

import com.senwolf.stack.ArrayStack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author SenWolf
 * @date 2022/3/6 11:46
 */
public class intersect {
    public int[] intersect(int[] nums1, int[] nums2) {
        // 先将两个数组排序
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        // 声明两个指针
        int i = 0;
        int j = 0;
        // 定义接收结果的list
        ArrayList<Integer> integers = new ArrayList<>();
        while(i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                integers.add(nums1[i]);
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                i++;
            }
        }
        int[] ret = new int[integers.size()];
        for (int k = 0; k < integers.size(); k++) {
            ret[k] = integers.get(k);
        }
        return ret;

    }
}
