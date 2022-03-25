package com.medp.leetcode.sort;

import java.util.Arrays;

/**
 * [LeetCode-455]
 * 分发饼干
 *
 * @author MEDP
 * @date 2022/3/25 21:40
 */
public class FindContentChildren {

    /**
     * 排序+贪心
     *
     * @param g
     * @param s
     * @return
     */
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0;
        for (int i = 0, j = 0; i < g.length && j < s.length; i++, j++) {
            // 找到满足最小胃口的饼干
            while (j < s.length && g[i] > s[j]) {
                j++;
            }
            if (j < s.length) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new FindContentChildren().findContentChildren(new int[]{1, 2, 3}, new int[]{1, 1}));
    }
}
