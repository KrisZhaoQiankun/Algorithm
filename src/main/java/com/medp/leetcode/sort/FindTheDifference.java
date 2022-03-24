package com.medp.leetcode.sort;

/**
 * [LeetCode-389]
 * 找不同
 *
 * @author MEDP
 * @date 2022/3/24 20:38
 */
public class FindTheDifference {

    /**
     * 用数组记录每一个字母出现的频率，然后遍历第二个字符串，找出那个多余的数组
     *
     * @param s
     * @param t
     * @return
     */
    public char findTheDifference(String s, String t) {
        int[] cnt = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            cnt[ch - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            cnt[ch - 'a']--;
            if (cnt[ch - 'a'] < 0) {
                return ch;
            }
        }
        return ' ';
    }

    /**
     * 相减得到插入字母的ascii码
     *
     * @param s
     * @param t
     * @return
     */
    public char findTheDifferenceTwo(String s, String t) {
        int as = 0;int at = 0;
        for (int i = 0; i < s.length(); i++) {
            as += s.charAt(i);
        }
        for (int i = 0; i < t.length(); i++) {
            at += t.charAt(i);
        }
        return (char)Math.abs(as - at);
    }

    public static void main(String[] args) {
        System.out.println(new FindTheDifference().findTheDifference("abcd", "abcde"));
        System.out.println(new FindTheDifference().findTheDifferenceTwo("abcd", "abcde"));
    }
}
