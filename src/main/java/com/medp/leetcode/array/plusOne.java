package com.medp.leetcode.array;

/**
 * @author MEDP
 * @date 2022/3/6 12:05
 */
public class plusOne {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length-1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i] += 1;
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        int[] temp = new int[digits.length+1];
        temp[0] = 1;
        return temp;
    }
}
