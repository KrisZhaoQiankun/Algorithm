package com.medp.recurrence;

import java.util.HashMap;

/**
 * 假如这里有 n 个台阶，每次你可以跨 1 个台阶或者 2 个台阶，请问走这 n 个台阶有多少种走法？
 * 斐波那契数列:后面数是前两个数的和
 *
 * @author MEDP
 * @date 2022/3/2 20:59
 */
public class GetSteps {
    private HashMap<Integer, Integer> hasSolvedList = new HashMap<>();

    public int f(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;

        if (hasSolvedList.containsKey(n)) return hasSolvedList.get(n);
        return f(n-1) + f(n-2);
    }

    public static void main(String[] args) {
        System.out.println(new GetSteps().f(2));
    }
}
