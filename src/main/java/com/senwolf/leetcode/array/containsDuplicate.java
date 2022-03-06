package com.senwolf.leetcode.array;

import java.util.HashMap;
import java.util.HashSet;

/**
 * int数组是否包含重复数数字
 *
 * @author SenWolf
 * @date 2022/3/6 11:21
 */
public class containsDuplicate {
    public boolean containsDuplicate(int nums[]) {
        HashSet<Integer> integers = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            integers.add(nums[i]);
            if (integers.size() < i+1) {
                return true;
            }
        }
        return false;
    }

    /**
     * set.add方法
     * If this set already contains the element, the call leaves the set unchanged and returns false. orelse return true
     * public boolean add(E e) {
     *     return map.put(e, PRESENT)==null;
     * }
     */
}
