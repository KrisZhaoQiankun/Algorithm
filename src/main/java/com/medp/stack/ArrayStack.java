package com.medp.stack;

/**
 * 数组实现的顺序栈
 *
 * @author MEDP
 * @date 2022/2/22 21:18
 */
public class ArrayStack {

    private String[] items; //数组
    private int count; //栈中的元素个数
    private int n; //栈的大小

    public ArrayStack(int n) {
        this.items = new String[n];
        this.n = n;
        this.count = 0;
    }

    /**
     * 入栈操作
     */
    public boolean push(String item) {
        if (count == n) return false;
        items[count] = item;
        ++count;
        return true;
    }

    /**
     * 出栈操作
     */
    public String pop() {
        if (count == 0) return null;
        String temp = items[count-1];
        --count;
        return temp;
    }
}
