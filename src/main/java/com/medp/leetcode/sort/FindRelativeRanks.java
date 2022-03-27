package com.medp.leetcode.sort;

import java.util.Arrays;
import java.util.HashMap;

/**
 * [LeetCode-506]
 * 相对名词
 *
 * @author MEDP
 * @date 2022/3/27 22:49
 */
public class FindRelativeRanks {

    /**
     * 空间复杂度较高
     *
     * @param score
     * @return
     */
    public String[] findRelativeRanks(int[] score) {
        // 1. 用键值对记录数组中的数字及对应的位置
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < score.length; i++) {
            map.put(score[i], i);
        }
        // 2. 对原有数组进行排序
        Arrays.sort(score);
        // 反转数组
        reverse(score);
        // 给对应位置设置值
        String[] s = new String[score.length];
        for (int i = 0; i < s.length; i++) {
            String res;
            switch(i) {
                case 0 :
                    res = "Gold Medal";
                    break;
                case 1 :
                    res = "Silver Medal";
                    break;
                case 2 :
                    res = "Bronze Medal";
                    break;
                default :
                    res = i + 1 + "";
            }
            s[map.get(score[i])] = res;
        }

        return s;
    }

    /**
     * 反转数组
     *
     * @param score
     */
    private void reverse(int[] score) {
        for (int i = 0; i < score.length / 2; i++) {
            int temp = score[i];
            score[i] = score[score.length - 1 -i];
            score[score.length - 1 -i] = temp;
        }
    }

    /**
     * 利用二维数组解决
     *
     * @param score
     * @return
     */
    public String[] findRelativeRanksTwo(int[] score) {
        // 数组长度
        int length = score.length;
        String[] desc = {"Gold Medal", "Silver Medal", "Bronze Medal"};
        int[][] arr = new int[length][2];

        // 将一维数组转换为二维数组
        for (int i = 0; i < length; i++) {
            arr[i][0] = score[i];
            arr[i][1] = i;
        }

        Arrays.sort(arr, (a, b) -> b[0] - a[0]);
        String[] ans = new String[length];
        for (int i = 0; i < length; i++) {
            if (i >= 3) {
                ans[arr[i][1]] = Integer.toString(i + 1);
            } else {
                ans[arr[i][1]] = desc[i];
            }
        }
        return ans;
    }



    public static void main(String[] args) {
        System.out.println(Arrays.toString(new FindRelativeRanks().findRelativeRanksTwo(new int[]{10, 3, 8, 9, 4})));
    }

}
