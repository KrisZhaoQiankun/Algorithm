package com.medp.leetcode.sort;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * [LeetCode-242]
 * 有效的字母异位词
 *
 * @author MEDP
 * @date 2022/3/23 21:25
 */
public class AdjustIsAnagram {

    /**
     *
     *
     * @param s
     * @param t
     * @return
     */
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> table = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            table.put(s.charAt(i), table.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            table.put(t.charAt(i), table.getOrDefault(t.charAt(i), 0) - 1);
            if (table.get(t.charAt(i)) < 0) {
                return false;
            }
        }

        return true;
    }

    public boolean isAnagramTwo(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        char[] chars = s1.toCharArray();
        char[] chars1 = s2.toCharArray();
        Arrays.sort(chars);
        Arrays.sort(chars1);
        return Arrays.equals(chars, chars1);

    }

    public static void main(String[] args) {
        System.out.println(new AdjustIsAnagram().isAnagram("abc", "bca"));
        System.out.println(new AdjustIsAnagram().isAnagramTwo("abc", "bca"));
    }
}
